package com.example.springboothibernate.martians.martian;

import com.example.springboothibernate.martians.martian.domain.Martian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MartianRepository extends JpaRepository<Martian, Long> {
}
