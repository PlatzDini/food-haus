package me.platzeck.foodhaus.supply;

import me.platzeck.foodhaus.repository.SupplyRepository;
import me.platzeck.foodhaus.repository.entities.Supply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/supplies")
public class SupplyController {

    @Autowired
    private SupplyRepository supplyRepository;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Valid SupplyForm supplyForm){
        Supply supply = supplyRepository.save(SupplyForm.entity(supplyForm));
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id")UUID id){
        Supply supply = new Supply();
        supply.setRemoved(true);
        supply.setId(id);
        supplyRepository.save(supply);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Supply>> list(){
        return ResponseEntity.ok(supplyRepository.findAll());
    }

}
