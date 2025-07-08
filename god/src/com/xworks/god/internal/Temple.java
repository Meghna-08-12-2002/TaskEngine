package com.xworks.god.internal;

public class Temple {
    String prasad;
    public Temple() {
        System.out.println("no arg con in temple");
    }
    public void worship(){
        System.out.println("Running in worship");
    }
    public Temple(String prasad){
     this.prasad=prasad;
     System.out.println(prasad);
    }
}
