package com.test.testint;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.*;

public class jsonParserLogic {

    public static void main(String[] args) throws Exception {

        //Reading from JSON file
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("template/src/main/java/com/test/testint/inputJson.JSON"));
        JSONArray array = new JSONArray();
        array.add(obj);

        //Iterating the array of JSON objects        
        Iterator<JSONArray> it = ((ArrayList) array).iterator();
        
        ArrayList<cityClass> arraAdd= new ArrayList<>();
        while (it.hasNext()) {
            JSONArray jkA = it.next();
            System.out.println("++++"+jkA);
            for (int i = 0; i < jkA.size(); i++) {
                JSONObject jk = (JSONObject) (jkA.get(i));
                System.out.println(jk.get("cityName"));
                cityClass city= new cityClass();
                city.setAirportCode((String) jk.get("airportCode"));
                city.setTravelPeriod((long) jk.get("travelPeriod"));
                city.setCityName((String) jk.get("cityName"));
                city.setDaysFromDeparture((long) jk.get("daysFromDeparture"));
                arraAdd.add(city);
            }
        }

        arraAdd.stream().forEach((c) -> System.out.println(c.getAirportCode()));
        Stream<cityClass> stream = arraAdd.stream();
        List<cityClass> evenNumbersList = stream.filter(i -> i.getCityName().contains("h"))
                                    .sorted()
                                    .collect(Collectors.toList());
                     Iterator<cityClass> newIt= evenNumbersList.iterator();
                     
                     while(newIt.hasNext()){

                            String newVal=newIt.next().getCityName();
                            System.out.println("++++++++++++"+newVal);
                        
                     }


        

    }

}
