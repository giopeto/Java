package com.example.videolibrary.company.controller;

import com.example.videolibrary.company.domain.Company;
import com.example.videolibrary.company.service.CompanyService;
import com.example.videolibrary.movies.controller.MoviesController;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyController {

    @NonNull private final CompanyService companyService;

   @GetMapping
    public List<Resource<Company>> getAllCompanies() {
        return getCompanyResources(companyService.getAllCompanies());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Resource<Company> getCompany(@PathVariable(value = "id") Long id) {
        return getCompanyResource(companyService.getCompanyById(id));
    }

    private List<Resource<Company>> getCompanyResources(List<Company> allCompanies) {
        List<Resource<Company>> companyResources = new ArrayList<>();
        allCompanies.forEach(company -> companyResources.add(getCompanyResource(company)));

        return companyResources;
    }

    private Resource<Company> getCompanyResource(Company company) {
        Resource<Company> companyResource = new Resource<>(company);

        // Link to Company
        companyResource.add(linkTo(methodOn(CompanyController.class).getCompany(company.getId())).withSelfRel());
        company.getMovies().forEach(movie -> {
            // Link to Movies
            companyResource.add(linkTo(methodOn(MoviesController.class).getMovieById(movie.getId())).withRel("movies"));
        });

        return companyResource;
    }

}
