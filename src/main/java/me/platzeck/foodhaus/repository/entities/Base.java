package me.platzeck.foodhaus.repository.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class Base {

    @Id
    private UUID id;

    @Column(name="created_at", columnDefinition = "timestamptz")
    private OffsetDateTime createdAt;
    @Column(name="updated_at", columnDefinition = "timestamptz")
    private OffsetDateTime updatedAt;
    private boolean removed;

    @PrePersist
    public void prePersist(){
        this.id = UUID.randomUUID();
        this.createdAt = OffsetDateTime.now();
        this.removed = false;
    }

    @PreUpdate
    public void preUpdate(){
        this.updatedAt = OffsetDateTime.now();
    }


}
