package com.example.api.Controllers;

import com.example.api.Models.Kund;
import com.example.api.Models.User;
import com.example.api.Repositories.KundRepository;
import com.example.api.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/kund")
public class KundController {

    @Autowired
    private UserRepository userRepository;

    private final KundRepository kundRepository;

    public KundController(KundRepository kundRepository) {
        this.kundRepository = kundRepository;
    }


    @PostMapping("")
    public String createKund(@RequestBody Kund nyKund) {
        kundRepository.save(nyKund);
        return "Saved: " + nyKund;
    }
    @RequestMapping("/users")
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("")
    public Iterable<Kund> getAllKunder() {
        return kundRepository.findAll();
    }

    @GetMapping("/get")
    public Kund getKund(@RequestParam Long kundId) {
        return kundRepository.findById(kundId).get();
    }

    @GetMapping("{id}")
    public Optional<Kund> getKundById(@PathVariable Long id) {
        return kundRepository.findById(id);
    }

}