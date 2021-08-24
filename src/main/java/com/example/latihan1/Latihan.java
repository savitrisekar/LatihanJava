package com.example.latihan1;

public class Latihan { //nama class
    public static void main(String[] args) {
        //Tipe Data
        /*
         *
         * byte 1 byte = -128 to 127
         * short 2 bytes = -32,768 to 32,767
         * int 4 bytes = -2,147,...,648 to 2,147,...,647
         * long 8 bytes = -9,223... to 9,223...
         * float 4 bytes = 6 to 7 decimal digits
         * boolean 1 bit = true or false
         * double 8 bytes = for storing 15 decimal digits
         * char 2 bytes = single character/letter/ASCII value
         *
         * */
        //Example
        /*long lng = -9222777090l; //tambahkan 'l'
        float flt = 4.5f; //tambahkan 'f'
        double dbl = 3.4d; //tambahkan 'd'
        char chr = 's'; //single character
        String str = "sekar"; //multiple character*/

        //VARIABLE DIGUNAKAN UNTUK MENAMPUNG NILAI
        /*String name = "Sekar";
        int age = 24;
        String job = "Android Developer";

        System.out.println("Name : " + name + "\nYour Age: " + age + "\nYour Job : " + job);*/

        //Casting
        /*
         * casting : mengubah value yang berada di type data A ke B
         * widening casting : mengurutkan dari kecil ke besar bersifat otomatis
         * narrowing casting : mengurutkan dari besar ke kecil bersifat manual
         * */

        //Widening casting
        /* int age = 24;
        float myAge = age; //otomatis

        System.out.println(age);
        System.out.println(myAge);*/

        //Narrowing casting
        /* float ages = 24f;
        int yourAge = (int) ages; //manual

        System.out.println(ages);
        System.out.println(yourAge);*/

        //Operator
        /*int a = 256;
        int b = 8;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int z = 237;
        z++;
        int x = 237;
        x--;

        System.out.println(z);
        System.out.println(x);*/

        //IF ELSE
        //Tipe Data String
        /*String animal = "Tiger";

        if (animal.equals("Lion")) { //equals untuk string
            System.out.println(animal);
        } else {
            System.out.println("It's wrong!!");
        }*/

        //Tipe Data Boolean
        /*boolean fish = false;
        //pengujian nya secara berurutan
        if (fish) { //cek apakah T -> result NO
            System.out.println("Great");
        } else { //next checking it's F -> result YES
            System.out.println("Wrong");
        }*/

        //Tipe Data Int
        /* int number = 93;

        if (number == 93) {
            System.out.println("Great the number is " + number);
        } else {
            System.out.println("Wrong!");
        }*/

        //Switch
       /* int result = 3;

        switch (result) {
            case 1:
                System.out.println("Not Match");
                break;
            case 2:
                System.out.println("Try Again");
                break;
            case 3:
                System.out.println("Good Job");
                break;
            default:
                System.out.println("Can not find the result!");
        }*/

        //While
      /*  int i = 1;

        while (i < 5) { //statement di awal
            System.out.println(i); //nilai 1 di print terlebih dulu
            i++;  //kemudian ditambah dan kembali ke statemen apakah memenuhi
        }

        while (i < 5) {
            i++; //terjadi penambahan terlebih dulu i+1 jadi start value 2
            System.out.println(i); //kemudian di cetak dan dikembalikan ke statement apakah memenuhi
        }

        do {
            System.out.println(i);
            i++;
        } while (i < 5); //kondisi statement di akhir pada bagian while

        do {
            i++;
            System.out.println(i);
        } while (i < 5);*/

        //For (mengambil data berulang-ulang sampai kondisi menjadi salah(stop))
        /*for (int i = 1; i < 17; i++) { //sama seperti while, do-while
            System.out.println(i);
        }*/

        //Array (menampung banyak data. Dimulai dari indeks ke 0)
        /*String[] color = {"RED", "BLACK", "YELLOW", "WHITE"};

        System.out.println(color[2]);

        int[] age = {17, 21, 24, 27, 30};

        System.out.println(age[4]);

        for (int i = 0; i < color.length; i++) { //color.length berarti menghitung berapa panjang array dari color
            System.out.println(color[i]);
        }*/

        //Break and Continue in For
       /* for (int i = 0; i < 10; i++) {
            System.out.println(i); //akan mencetkan angka 0-9 karna di array start dari 0
        }*/

        //Break
       /* for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; //akan di stop pada if
            }

            System.out.println(i); //hasil nya 0-4 karna di stop pada angka 5
        }*/

        //Continue
        /*for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue; //angka 6 akan hilang karena di stop dulu baru kemudian continue ke angka selanjutnya
            }

            System.out.println(i); //hasil yg ditampilkan 0-5 kemudian continue 7-9
        }*/

        //Exception statement (menampilkan dari data dari server)
        /*try {

            int[] i = {3, 5, 7, 9};
            System.out.println(i[4]);

        } catch (Exception e) { //dijalankan ketika terjadi error
            e.printStackTrace();
            System.out.println("Periksa inputan anda");
        }*/

        //Manipulasi FOR
       /* int[] prima = {2, 3, 5, 7, 11, 13, 19};

        for (int i : prima) {
            System.out.println(i);
        }

        System.out.println("FOR biasa");

        for (int i = 0; i < prima.length; i++) {
            System.out.println(prima[i]);
        }*/

        //Manipulasi IF
        int a = 7;
        String right = "Good";
        String wrong = "Wrong";

        String result = a > 5 ? right : wrong;
        System.out.println(result);

        System.out.println("IF Biasa");
        if (a > 7) {
            System.out.println(right);
        } else {
            System.out.println(wrong);
        }

    }
}
