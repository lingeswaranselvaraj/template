package com.test.testint;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class CodingChallenge {
    public String sayHello() {
        return "Hello";
    }

    public static int test (int a, int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        test(1,2);
        testSetObj();
        
    }
    static ArrayList<laptopclas> araObj= new ArrayList<>();
    public static ArrayList<laptopclas> testSetObj(){
        laptopclas laptcla1= new laptopclas("",1,23);
        laptopclas laptcla2= new laptopclas("",1,24);
        laptopclas laptcla3= new laptopclas("",1,23);
        
        araObj.add(laptcla1);
        araObj.add(laptcla2);
        araObj.add(laptcla3);
        for (laptopclas laptopclas : araObj) {
            System.out.println("----------------"+laptopclas.toString());    
        }
        
        return araObj;


    }

    public laptopclas testGetObj(){
        laptopclas laptcla= new laptopclas();
        laptcla.getDevice();
        laptcla.getModel();
        laptcla.getPrice();
        return laptcla;


    }

}
