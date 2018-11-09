package com.example.videolibrary.company.repository;

import com.example.videolibrary.company.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {

    Optional<Company> getCompanyById(Long id);
}
