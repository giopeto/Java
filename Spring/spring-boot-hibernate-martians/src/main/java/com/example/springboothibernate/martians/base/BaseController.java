package com.example.springboothibernate.martians.base;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("base")
@AllArgsConstructor
public class BaseController {

    @NonNull
    private final BaseRepository baseRepository;

    @GetMapping
    public List<Base> getAllBases() {
        return baseRepository.findAll();
    }

    @PostMapping
    public Base insertBase(@RequestBody Base base) {
        return baseRepository.save(base);
    }
}

