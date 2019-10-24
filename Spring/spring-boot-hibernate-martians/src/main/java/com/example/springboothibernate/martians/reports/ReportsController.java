package com.example.springboothibernate.martians.reports;

import com.example.springboothibernate.martians.martian.domain.Martian;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("report")
@AllArgsConstructor
public class ReportsController {

    @NonNull
    private final ReportService reportService;

    @GetMapping("/martian")
    public List<Martian> getAllMartiansInfo() {
        return reportService.getMartiansInfo();
    }

    @GetMapping("/martian/{id}")
    public Martian getMartianById(@RequestParam Long id) {
        return reportService.findMartianById(id);
    }
}
