package com.learning.analyzer.ageAnalizer;

/**
 * Created by Cyprian on 2017-01-18.
 */
public class SkrzynkaZKlaskami {

    //TODO: Wyciaganie poszczegolnych narzedzi powinno odbywc sie w metodzie statycznej!


    private DepartureDayAnalizer departureDayAnalizer;

    public DepartureDayAnalizer getDepartureDayAnalizer() {
        return departureDayAnalizer;
    }

    public SkrzynkaZKlaskami() {
        this.departureDayAnalizer = new DepartureDayAnalizer();
    }
}
