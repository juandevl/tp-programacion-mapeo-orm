package taller.programacion.tp.orm.ponce.juan.entities;

import jakarta.persistence.*;
import lombok.*;
import taller.programacion.tp.orm.ponce.juan.common.Address;
import taller.programacion.tp.orm.ponce.juan.common.Gender;

import java.util.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String firstName;
    private String lastName;

    private Date birthDate;
    private Gender gender;

    @Embedded
    private Address homeAddress;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

}
