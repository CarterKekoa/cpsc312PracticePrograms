package com.example.cpsc312;

import com.mooring.carter.MyOtherClass;

public class Main {
    public static void main(String[] args) {
        //package: grouping of related types (classes and interfaces)
        //why would you use packages?
        //project structure (folder/file hierarchy)
        //namespace management
        //access modifiers

        //java.lang
        //java.util

        System.out.println(String.class.getPackage());
        System.out.println(Main.class.getPackage());

        //create new package with reverse domain name for your name
        System.out.println(MyOtherClass.class.getPackage());

    }
}
