package taller.programacion.tp.orm.ponce.juan.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Staff extends Person
{
    private Date joinDate;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    private String[] education;
    private String[] certifications;
    private String[] languages;

}
