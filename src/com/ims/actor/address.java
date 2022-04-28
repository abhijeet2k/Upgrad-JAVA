package com.ims.actor;

 class Address {
    String buildingNumber;
    String streetName ;
    String city;
    Long pincode;

    Address(){

    }
    Address(String buildingName, String streetName, String city, Long pincode){
        this.buildingNumber=buildingName;
        this.streetName=streetName;
        this.city=city;
        this.pincode=pincode;
    }
     void displaySupplier1(){

         System.out.print(buildingNumber+" "+streetName+" "+city+" "+pincode);
     }


}
