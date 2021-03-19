package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    //@OneToMany(mappedBy = "employer")
    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    @NotNull(message = "Location must be set")
    @Size(min = 2, max = 100, message = "Location must be between 2 and 200 characters")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
