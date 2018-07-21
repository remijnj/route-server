package se.joost.route;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import se.joost.route.Stop;

// This will be AUTIMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StopRepository extends CrudRepository<Stop, Long> { }