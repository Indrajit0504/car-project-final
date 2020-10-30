package fr.efrei.cartp1.repository;
import fr.efrei.cartp1.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    List<Person> findById(Id id);
    List<Person> findByName(String name);
}
