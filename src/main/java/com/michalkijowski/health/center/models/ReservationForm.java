package com.michalkijowski.health.center.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ReservationForm {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastname;
    @Getter
    @Setter
    private String date;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public LocalDate getFormateDate() {

        return LocalDate.parse((CharSequence) date, format);

    }
}
