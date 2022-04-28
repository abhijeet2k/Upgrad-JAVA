package com.ims.actor;

public class Supplier {
    int id;
    String name;
    Address address;

    Supplier(String name){
        this();
        this.name=name;

        System.out.println("Assignments Done");
    }
    Supplier(){
        System.out.println("Supplier Constructed !!");
    }
void displaySupplier(){

        System.out.print(id+" "+name+" ");
}
}
