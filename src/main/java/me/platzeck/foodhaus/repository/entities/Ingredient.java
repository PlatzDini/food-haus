package me.platzeck.foodhaus.repository.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import me.platzeck.foodhaus.Measurement;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Ingredient {

    @Getter
    @Setter
    @Embeddable
    @AllArgsConstructor
    @EqualsAndHashCode
    public static class IngredientId implements Serializable {
        @Column(name = "fk_supply")
        @MapsId("supplyId")
        protected UUID SupplyId;
        @Column(name = "fk_recipe")
        @MapsId("recipeId")
        protected UUID RecipeId;
    }

    @EmbeddedId
    private IngredientId id;

    @ManyToOne
    @JoinColumn(name = "fk_supply", insertable = false, updatable = false)
    private Supply supply;

    @Enumerated(EnumType.STRING)
    private Measurement measurement;
    private BigDecimal quantity;

    @ManyToOne
    @JoinColumn(name = "fk_recipe", insertable = false, updatable = false)
    private Recipe recipe;

}
