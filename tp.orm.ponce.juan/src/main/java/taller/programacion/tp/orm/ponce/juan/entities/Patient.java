package taller.programacion.tp.orm.ponce.juan.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Patient extends Person
{
    private Integer age;
    private Date accepted;

    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;
}
