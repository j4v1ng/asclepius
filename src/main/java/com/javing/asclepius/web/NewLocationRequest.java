package com.javing.asclepius.web;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NewLocationRequest {

    private final String address;
    private final String locationType;

}
