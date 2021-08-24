package com.example.latihan1;

//Overriding (dilakukan dalam dua class yang berbeda)
public class ParentOverriding extends ChildOverriding {
    public static void main(String[] args) {

        ChildOverriding childOverriding = new ChildOverriding();
        childOverriding.sameMethod();
        childOverriding.difMethod();

    }
}
