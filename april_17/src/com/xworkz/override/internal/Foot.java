package com.xworkz.override.internal;

public class Foot {
    private String type;
    private int size;
    public Foot(String type, int size){
        this.type=type;
        this.size=size;
    }
    public void walk(){
        System.out.println(type+" barefoot with size "+size+" walking");
    }
    @Override
    public String toString(){
        return "BareFoot{type='"+type+"', size="+size+"}";
    }
}
