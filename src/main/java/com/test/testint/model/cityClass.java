package com.test.testint.model;

public class cityClass {

    private String airportCode;
    private int travelPeriod;
    private int daysFromDeparture;
    private String cityName;


    public cityClass() {
    }
   
    public cityClass(String airportCode, int travelPeriod, int daysFromDeparture, String cityName) {
        this.airportCode = airportCode;
        this.travelPeriod = travelPeriod;
        this.daysFromDeparture = daysFromDeparture;
        this.cityName = cityName;
    }
    

    public String getAirportCode() {
        return this.airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public int getTravelPeriod() {
        return this.travelPeriod;
    }

    public void setTravelPeriod(int travelPeriod) {
        this.travelPeriod = travelPeriod;
    }

    public int getDaysFromDeparture() {
        return this.daysFromDeparture;
    }

    public void setDaysFromDeparture(int daysFromDeparture) {
        this.daysFromDeparture = daysFromDeparture;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    



}
