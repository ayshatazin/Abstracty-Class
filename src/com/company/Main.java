package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rattre rattre = new Rattre();

        Human onu = new Human() {
            @Override
            void works() {

                System.out.println("clean");

            }
        };//object create
        rattre.sleep();
        rattre.works();

        onu.sleep();
        onu.works();

    }
}
