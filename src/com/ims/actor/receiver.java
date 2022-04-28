package com.ims.actor;

public class receiver {
    public static void main(String[] args){
        Supplier s1 = new Supplier("abcd");
        Address a1=new Address("abcd","abcd","abcd",12244578L);
        s1.displaySupplier();
        a1.displaySupplier1();
    }
}
