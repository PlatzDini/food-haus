package me.platzeck.foodhaus.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Ingredient extends Base {

    private String name;

}