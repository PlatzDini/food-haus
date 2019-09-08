package me.platzeck.foodhaus.repository.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Recipe extends Base {

    private String name;
    private Integer yield;
    @Column(name = "preparation_time_in_minutes")
    private Integer preparationTimeInMinutes;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients = new ArrayList<>();

}
