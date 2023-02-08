package com.example.spring5recipeapp.repository;

import com.example.spring5recipeapp.model.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

//@RunWith(SpringRunner.class) // brings up the Spring Context for Junit4 it's an alias for the SpringJUnit4ClassRunner
//@ExtendWith(SpringExtension.class) // it's the Junit 5 equivalent
// To be honest, I don't understand it's utility because it does work without any of it;
@DataJpaTest //brings up an embedded DB and will configure Spring Data JPA for us
class UnitOfMeasureRepositoryIT {

    @Autowired//because we bring up the Spring context;
    UnitOfMeasureRepository unitOfMeasureRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescription() {
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Cup");

        assertEquals("Cup", unitOfMeasureOptional.get().getDescription());

    }

    @Test
    void findByDescriptionTea() {
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        assertEquals("Teaspoon", unitOfMeasureOptional.get().getDescription());

    }


}