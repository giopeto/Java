package com.example.springboothibernate.martians.martian;

import com.example.springboothibernate.martians.martian.domain.Martian;
import com.example.springboothibernate.martians.martian.domain.MartianDTO;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("martian")
@AllArgsConstructor
public class MartianController {

    @NonNull
    private final MartianService martianService;

    @GetMapping
    public List<Martian> getAllMartians() {
        return martianService.findAll();
    }

    @GetMapping("/{id}")
    public Martian getMartianById(@RequestParam Long id) {
        return martianService.findById(id);
    }

    @PostMapping
    public Martian saveMartian(@RequestBody MartianDTO martian) {
        return martianService.save(martian);
    }
}
