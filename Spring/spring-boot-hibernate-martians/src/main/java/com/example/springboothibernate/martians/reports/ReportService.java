package com.example.springboothibernate.martians.reports;

import com.example.springboothibernate.martians.martian.domain.Martian;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReportService {

    @NonNull
    private final MartiansReportsRepository martiansReportsRepository;

    public List<Martian> getMartiansInfo() {
        return martiansReportsRepository.getMartiansInfo();
    }


    public Martian findMartianById(Long id) {
        return martiansReportsRepository.findMartianById(id);
    }
}
