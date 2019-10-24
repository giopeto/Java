package com.example.springboothibernate.martians;

import com.example.springboothibernate.martians.base.Base;
import com.example.springboothibernate.martians.base.BaseRepository;
import com.example.springboothibernate.martians.martian.MartianRepository;
import com.example.springboothibernate.martians.martian.domain.Martian;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class InitTestData {

    @NonNull
    private final MartianRepository martianRepository;

    @NonNull
    private final BaseRepository baseRepository;

    List<Base> baseList = Arrays.asList(
            new Base("Tharsisland", new Date()),
            new Base("Valles Marines 2.0", new Date())
    );

    Martian martian1 = new Martian("M 1", "M 1 lastname");
    Martian martian2 = new Martian("M 2", "M 2 lastname", null, martian1);
    Martian martian3 = new Martian("M 3", "M 3 lastname", baseList.get(1), martian1);

    public InitTestData(@NonNull MartianRepository martianRepository, @NonNull BaseRepository baseRepository) {
        this.martianRepository = martianRepository;
        this.baseRepository = baseRepository;
    }


    public void init() {
        initBases();
        initMartians();
    }

    private void initMartians() {
        martianRepository.saveAll(Arrays.asList(martian1, martian2, martian3));
    }

    private void initBases() {
        baseRepository.saveAll(baseList);
    }
}
