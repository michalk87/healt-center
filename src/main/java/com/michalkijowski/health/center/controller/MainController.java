package com.michalkijowski.health.center.controller;

import com.michalkijowski.health.center.models.ReservationForm;
import com.michalkijowski.health.center.models.ReservationModel;
import com.michalkijowski.health.center.models.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    ReservationRepository reservationRepository;

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("reserwationForm", new ReservationForm());
        model.addAttribute("reserwations", reservationRepository.findAll());

        return "index";
    }

    @PostMapping("/")
    public String index(@ModelAttribute("reserwationForm") ReservationForm form) {

        reservationRepository.save(new ReservationModel(form));

        return "index";
    }
}
