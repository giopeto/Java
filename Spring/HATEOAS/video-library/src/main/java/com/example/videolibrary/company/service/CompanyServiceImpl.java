package com.example.videolibrary.company.service;

import com.example.videolibrary.company.repository.CompanyRepository;
import com.example.videolibrary.company.domain.Company;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CompanyServiceImpl implements CompanyService {

    @NonNull private final CompanyRepository companyRepository;
    @Override
    public List<Company> getAllCompanies() {
        return (List<Company>) companyRepository.findAll();
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.getCompanyById(id).get();
    }
}
