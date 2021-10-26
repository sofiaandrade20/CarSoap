package com.bootcamp.car.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "brand"
})
@XmlRootElement(name = "getCarRequest")
public class GetCarRequest {

    @XmlElement(required = true)
    protected String brand;
}
