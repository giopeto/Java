package com.example.videolibrary.company.service;

import com.example.videolibrary.company.domain.Company;

import java.util.List;

public interface CompanyService {

    public List<Company> getAllCompanies();
    public Company getCompanyById(Long id);
}
