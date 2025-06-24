package taller.programacion.tp.orm.ponce.juan.entities;

import jakarta.persistence.*;
import lombok.*;
import taller.programacion.tp.orm.ponce.juan.common.Address;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hospital
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Embedded
    private Address address;
    private String phone;

    @OneToMany(mappedBy = "hospital")
    private List<Person> people;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Department> departments;


}
