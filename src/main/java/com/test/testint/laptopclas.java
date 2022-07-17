package com.test.testint;

public class laptopclas {
    private String device;
    private int model;
    private int price;

    public laptopclas(String device, int model, int price) {
        this.device = device;
        this.model = model;
        this.price = price;
    }

    public laptopclas() {
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public int getModel() {
        return this.model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return device+model+price;
    }



}

    