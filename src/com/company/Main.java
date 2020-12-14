package com.company;

public class Main {

    public static void main(String[] args) {
        HashTable main=new HashTable();
        main.add("asd");
        main.add("lgr");
        main.add("rfg");
        main.add("ert");
        main.add("qwe");
        System.out.println("-----------------------");

        main.find("asd");
        main.show();
        System.out.println("-----------------------");

        System.out.println("Удалим asd и lgr");
        main.remove("asd");
        main.remove("lgr");
        main.find("asd");
        main.show();
        System.out.println("-----------------------");
        main.add("asd");
        main.add("lgr");
        main.show();
        main.find("lgr");
        main.find("asd");
        main.show();
    }
}