package com.learning.structure.util;

/**
 * Created by pawel on 15.01.17.
 */
public enum AirportEnum {
    KRK("Krakow"), GDN("Gdansk"), WAW("Warszawa"), BER("BERLIN"), MAD("Madrid"), PAR("Paris");

    private String city;

    AirportEnum(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
