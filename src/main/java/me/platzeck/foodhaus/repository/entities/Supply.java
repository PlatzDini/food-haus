package me.platzeck.foodhaus.repository.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Supply extends Base {

    private String name;

}
