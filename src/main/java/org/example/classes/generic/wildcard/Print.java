package org.example.classes.generic.wildcard;

import java.util.List;

public class Print {

    // generic type method
    public <T extends Vehicle> void setPrintValues(List<T> vehicleList) {

    }

    // wild card method.
    public void setPrintValues1(List<? extends Vehicle> vehicleList) {

    }
}
