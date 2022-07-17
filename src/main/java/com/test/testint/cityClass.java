package com.test.testint;

import java.util.Comparator;

public class cityClass implements Comparable<cityClass>{

    private String airportCode;
    private long travelPeriod;
    private long daysFromDeparture;
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

    public long getTravelPeriod() {
        return this.travelPeriod;
    }

    public void setTravelPeriod(long l) {
        this.travelPeriod = l;
    }

    public long getDaysFromDeparture() {
        return this.daysFromDeparture;
    }

    public void setDaysFromDeparture(long l) {
        this.daysFromDeparture = l;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public int compareTo(cityClass o) {
        // TODO Auto-generated method stub
                return this.getCityName().compareTo(o.getCityName());
    }

    
    
    



}
