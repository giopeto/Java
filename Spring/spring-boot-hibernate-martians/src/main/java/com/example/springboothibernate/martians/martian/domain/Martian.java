package com.example.springboothibernate.martians.martian.domain;

import com.example.springboothibernate.martians.base.Base;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Martian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "base_id")
    private Base base;

    @OneToOne
    @JoinColumn(name = "super_id")
    @JoinTable()
    private Martian supervisor;

    public Martian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Martian(String firstName, String lastName, Base base, Martian supervisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.base = base;
        this.supervisor = supervisor;
    }

}
