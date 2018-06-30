package se.joost.route;

import org.springframework.data.repository.CrudRepository;

import se.joost.route.Route;

// This will be AUTIMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RouteRepository extends CrudRepository<Route, Long> {

}