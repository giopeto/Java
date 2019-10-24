package com.example.springboothibernate.martians.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "base_name")
    private String baseName;
    private Date founded;

    public Base(String baseName, Date founded) {
        this.baseName = baseName;
        this.founded = founded;
    }

}
