package taller.programacion.tp.orm.ponce.juan.common;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address
{
    @Column(name = "address_street")
    private String street;
    @Column(name = "address_city")
    private String city;
    @Column(name = "address_number")
    private int number;
}
