package com.michalkijowski.health.center.models;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "person")
@NoArgsConstructor
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastname;
    private LocalDate date;

    public ReservationModel(ReservationForm form){
        name = form.getName();
        lastname = form.getLastname();
        date = form.getFormateDate();
    }
}
