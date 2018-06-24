package se.joost.route;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;

@RestController
public class RouteController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/new", method = RequestMethod.PUT)
    @ApiOperation(
        value = "Create a new route",
        notes = "This creates a route to which stops can be added later.")
    public Route newroute(@RequestParam(value="name") String name) {
        return new Route(counter.incrementAndGet(), name);
    }

    @RequestMapping(value = "/load", method = RequestMethod.GET)
    @ApiOperation(
        value = "Load an existing route",
        notes = "Loads a route from the system by name (MUID?).")
    public void load(@RequestParam(value="name") String name) {
        // do nothing for now

    }

}