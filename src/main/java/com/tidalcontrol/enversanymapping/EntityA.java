package com.tidalcontrol.enversanymapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import java.util.UUID;
import org.hibernate.annotations.Any;
import org.hibernate.annotations.AnyDiscriminator;
import org.hibernate.annotations.AnyDiscriminatorValue;
import org.hibernate.annotations.AnyKeyJavaClass;
import org.hibernate.envers.Audited;

@Audited
@Entity
public class EntityA {

    @Id
    @GeneratedValue
    private Long id;

    @Any
    @AnyKeyJavaClass(UUID.class)
    @AnyDiscriminator(DiscriminatorType.STRING)
    @AnyDiscriminatorValue(discriminator = "EntityB", entity = EntityB.class)
    @JoinColumn(name = "entity_id")
    @Column(name = "entity_type")
    private EntityB entity;
}
