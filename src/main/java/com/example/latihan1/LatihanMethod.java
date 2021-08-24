package com.example.latihan1;

public class LatihanMethod {
    //multi method (ada di dalam class tetapi diluar main)
    //public : bisa diakses oleh class lain
    //private : hanya diakses class itu sendiri

    public static void main(String[] args) {
//        initMethod();
//        initMethodInt();
//        initMethodString("My String Method");
//        initMethodFloat(2.5f);
//        initMethodDouble(12d, 9d);
//        System.out.println("Nilai Matematika " + initMethodChar('A'));
        newMethod(4);
        newMethod(2, 7);
        newMethod(3.5d, 6d);
        newMethod(25d, 12);
    }

    /*private static void initMethod() { //void tidak dapat mengembalikan nilai
        System.out.println("result method");
    }

    private static int initMethodInt() {

        System.out.println(2);

        return 1; //private+tipe data harus ada pengembalian nilai nya yaitu 'return'
    }

    private static String initMethodString(String method) {
        System.out.println(method);

        return method;
    }

    private static Float initMethodFloat(Float f) {
        System.out.println(f);
        return f;
    }

    private static void initMethodDouble(double i, double j) {
        System.out.println(i * j);
    }

    private static char initMethodChar(char nilai) {
        return nilai;
    }*/

    //Overloading (sebuah method dengan nama yg sama dalam 1 class *lebih dari 1 tetapi dengan tipe data yang berbeda)
    private static void newMethod(int i) {
        System.out.println(i);
    }

    private static void newMethod(int i, int j) {
        System.out.println(i + j);
    }

    private static void newMethod(double x, double y) {
        System.out.println(x * y);
    }

    private static void newMethod(double a, int b) {
        System.out.println(a % b);
    }
}
