package fr.efrei.cartp1.web;


import fr.efrei.cartp1.model.Person;
import fr.efrei.cartp1.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.*;
import java.util.List;

@RestController
public class WebServices {

    PersonRepository personRepository;

    @Autowired
    public WebServices(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public Iterable<Person> getPersons(){
        return personRepository.findAll();
    }

}
