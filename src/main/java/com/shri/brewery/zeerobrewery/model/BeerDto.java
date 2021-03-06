package com.shri.brewery.zeerobrewery.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto implements Serializable {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long utc;

    private OffsetDateTime createdOn;
    private OffsetDateTime lastModifiedOn;
}
