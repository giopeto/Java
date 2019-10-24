package com.example.springboothibernateusersandvehicles;

import lombok.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "vehicles")
public class Vehicles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "users2vehicles",
            joinColumns = @JoinColumn(name = "vehicle_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Users user;

    public Vehicles(String name, Users user) {
        this.name = name;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "id=" + id +
                ", name='" + name + '}';
    }
}

@Repository
interface VehiclesRepository extends JpaRepository<Vehicles, Long> {

    Vehicles findByName(String name);
}
