package com.company;

public class supply {
    int no;
    String name;
    String address;
    Long number;


supply(){
   System.out.println("Watch it");
}
supply(int no,String name,String address,Long number){
this();
    this.no=no;
this.name=name;
this.address=address;
this.number=number;
}
void displaySupply(){
    System.out.println("registered number : "+no+"name "+name+"address "+address+"mobile number"+number);
}
}
