package com.example.videolibrary.company.domain;

import com.example.videolibrary.movies.domain.Movies;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Company {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy="company")
    private List<Movies> movies;
}
