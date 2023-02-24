package org.helix4444.quarkus.playground.hibernate.sakila.address.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country", schema = "public")
public class Country {

    @Id
    @SequenceGenerator(name = "countryIdSeq",
            sequenceName = "country_country_id_seq",
            schema = "public",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "countryIdSeq")
    @Column(name = "country_id")
    private Integer id;

    @Column(name = "country", nullable = false, length = 50)
    private String title;

    @Column(name = "last_update",
            nullable = false,
            insertable = false,
            updatable = false)
    private LocalDateTime lastUpdate = LocalDateTime.now();

}
