package com.learning.analyzer2.Passenger;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by fd on 02.03.2017.
 */
public class PassengerInfoAnalyzer {
    // TODO: dostep pakietowy?
    PassengerInfo passengerInfo = new PassengerInfo();

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    //TODO: nazwa metody w ogolnie nic nie mowi o tym, co ona robi
    public void analyze(String passengerInformation){
        try{
            //TODO: w ogole po co zapisywac wszystkie info z tego Stringa do obiketu? Skoro tylko data Ci potrzebna?

            //TODO: regexy i patterny wrzuc w prywatne pole finalne
            String[] data = passengerInformation.split("/");
            passengerInfo.setDataSource(data[0]);
            passengerInfo.setDataSourceType(data[1]);
            passengerInfo.setCountry(data[2]);
            passengerInfo.setDataSourceIdNr(data[3]);
            DateFormat dateFormat = new SimpleDateFormat("ddMMMyy", Locale.ENGLISH);
            passengerInfo.setDirthdayDate(dateFormat.parse(data[4]));
            passengerInfo.setRandomData(data[5]);
            passengerInfo.setExpirationDate(dateFormat.parse(data[6]));
        }catch(ParseException e){
            // TODO: dobrze by byly cos zalogowac - jakies info na przyklad czemu sie wywalilo
            e.printStackTrace();
        }
    }
}
