package me.platzeck.foodhaus.supply;

import lombok.Getter;
import lombok.Setter;
import me.platzeck.foodhaus.repository.entities.Supply;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class SupplyForm {

    @NotBlank(message = "Supply name cannot be null")
    private String name;

    public static Supply entity(SupplyForm supplyForm){
        Supply supply = new Supply();
        supply.setName(supplyForm.getName());
        return supply;
    }
}
