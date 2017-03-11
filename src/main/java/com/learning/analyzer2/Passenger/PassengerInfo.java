package com.learning.analyzer2.Passenger;

import java.util.Date;

/**
 * Created by fd on 02.03.2017.
 */
public class PassengerInfo {
    private String dataSource;
    private String dataSourceType;
    private String country;
    private String dataSourceIdNr;
    private Date dirthdayDate;
    private String randomData;
    private Date expirationDate;

    public PassengerInfo() {
    }

    public PassengerInfo(String dataSource, String dataSourceType, String country, String dataSourceIdNr, Date dirthdayDate, String randomData, Date expirationDate) {
        this.dataSource = dataSource;
        this.dataSourceType = dataSourceType;
        this.country = country;
        this.dataSourceIdNr = dataSourceIdNr;
        this.dirthdayDate = dirthdayDate;
        this.randomData = randomData;
        this.expirationDate = expirationDate;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDataSourceIdNr() {
        return dataSourceIdNr;
    }

    public void setDataSourceIdNr(String dataSourceIdNr) {
        this.dataSourceIdNr = dataSourceIdNr;
    }

    public Date getDirthdayDate() {
        return dirthdayDate;
    }

    public void setDirthdayDate(Date dirthdayDate) {
        this.dirthdayDate = dirthdayDate;
    }

    public String getRandomData() {
        return randomData;
    }

    public void setRandomData(String randomData) {
        this.randomData = randomData;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }



}
