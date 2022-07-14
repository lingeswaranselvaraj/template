package com.test.testint;

public class CodingChallenge {
    public String sayHello() {
        return "Hello";
    }

    public void test (int a, int b){
        int sum = a+b;
        
    }

    public static void main(String[] args) {
        test t=new test();
        int valy= t.sum(1,2);
        System.out.println(valy);
    }
}
