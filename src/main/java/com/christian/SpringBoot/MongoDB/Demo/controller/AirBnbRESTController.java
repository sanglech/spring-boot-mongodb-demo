package com.christian.SpringBoot.MongoDB.Demo.controller;

import com.christian.SpringBoot.MongoDB.Demo.document.AirBnb;
import com.christian.SpringBoot.MongoDB.Demo.repository.secondary.AirBnbRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/airbnb")
public class AirBnbRESTController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @Autowired
    private final AirBnbRepository airBnbRepository;

    public AirBnbRESTController(AirBnbRepository airBnbRepository) {
        this.airBnbRepository = airBnbRepository;
    }

    @GetMapping("")
    public String helloWorld() {
        return "hello world";
    }
    @GetMapping("/findAll")
    public List<AirBnb> findAll() {
        LOG.info("Getting all Airbnbs.");
        return airBnbRepository.findAll();
    }

    @GetMapping("/{airbnbID}")
    public Optional<AirBnb> getAirBnb(@PathVariable String airbnbID) {
        LOG.info("Getting user with ID: {}.", airbnbID);
        return airBnbRepository.findById(airbnbID);
    }

}
