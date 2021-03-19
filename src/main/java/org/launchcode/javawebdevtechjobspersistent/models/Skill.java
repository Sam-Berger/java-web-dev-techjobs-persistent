package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}