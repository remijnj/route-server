package se.joost.route;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity // This tells Hibernate to make a table out of this class
public class Stop {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="route_id")
    @JsonBackReference
    private Route route;

    private static final long serialVersionUID = 2L;
    private String name;
    private String street;
    private String houseNumber;
    private String postalCode;
    private String placename;
    private String extra;
    private double latitude;
    private double longitude;
    private boolean done;
    private boolean badAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String housenumber) {
        this.houseNumber = housenumber;
    }

    public String getExra() {
        return extra;
    }

    public void setExtra(String name) {
        this.extra = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double lat) {
        this.latitude = lat;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double lon) {
        this.longitude = lon;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isBadAddress() {
        return badAddress;
    }

    public void setBadAddress(boolean badAddress) {
        this.badAddress = badAddress;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }


}