package se.joost.route;

public class Route {
    private final long id;
    private final String name;

    public Route(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}