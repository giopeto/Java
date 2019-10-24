package com.example.springboothibernateusersandvehicles;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users2vehicles",
            joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
    private Collection<Vehicles> vehicles = new ArrayList<>();

    public Users(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }
}


@Repository
interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);
}