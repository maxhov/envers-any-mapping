package com.tidalcontrol.enversanymapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class EntityB {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "entity")
    private Set<EntityA> entityASet;
}
