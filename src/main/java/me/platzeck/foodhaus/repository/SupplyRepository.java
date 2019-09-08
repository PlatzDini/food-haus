package me.platzeck.foodhaus.repository;


import me.platzeck.foodhaus.repository.entities.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface SupplyRepository extends JpaRepository<Supply, UUID> {


}
