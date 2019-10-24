package com.example.springboothibernate.martians.martian;

import com.example.springboothibernate.martians.base.BaseRepository;
import com.example.springboothibernate.martians.martian.domain.Martian;
import com.example.springboothibernate.martians.martian.domain.MartianDTO;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MartianService {

    @NonNull
    private final MartianRepository martianRepository;

    @NonNull
    private final BaseRepository baseRepository;

    public Martian save(MartianDTO martianDTO) {
        return martianRepository.save(convertToMartian(martianDTO));
    }

    public List<Martian> findAll() {
        return martianRepository.findAll();
    }

    public Martian findById(Long id) {
        return martianRepository.findById(id).get();
    }

    private Martian convertToMartian(MartianDTO martianDTO) {
        return new Martian(
                martianDTO.getId() == null ? null : martianDTO.getId(),
                martianDTO.getFirstName(),
                martianDTO.getLastName(),
                martianDTO.getBaseId() == null ? null : baseRepository.findById(martianDTO.getBaseId()).get(),
                martianDTO.getSuperId() == null ? null : martianRepository.findById(martianDTO.getSuperId()).get()
        );

    }
}
