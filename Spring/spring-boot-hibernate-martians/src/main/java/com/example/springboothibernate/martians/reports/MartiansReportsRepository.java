package com.example.springboothibernate.martians.reports;

import com.example.springboothibernate.martians.martian.domain.Martian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MartiansReportsRepository extends JpaRepository<Martian, Long> {

    @Query(value = "SELECT * FROM Martian", nativeQuery = true)
    List<Martian> getMartiansInfo();

    @Query(value = "SELECT * FROM Martian WHERE id = :id", nativeQuery = true)
    Martian findMartianById(@Param("id") Long id);
}
