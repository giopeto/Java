package com.example.springboothibernate.martians.martian.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MartianDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private Long baseId;
    private Long superId;

}
