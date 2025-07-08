package com.xworkz.string;

public class Name {
    public static void main(String[] args) {
        String name="Maya";
        System.out.println("name:"+name);
        String reversed = "";
        int i ;
        for (i = 0; ; i++) {
            if (name.charAt(i) == '\0') {
                break;
                for (int j = i - 1; j >= 0; j--) {
                    reversed += name.charAt(j);
                }
            }
        }
               System.out.println("Reversed Sentence: " + reversed);
        String updatedName=name.concat("U" );
        System.out.println("updatedName:"+updatedName);
        String u_name="MayaU";
        String o_name="MayaU";
        if(updatedName==u_name){
            System.out.println("matching");
            System.out.println("MayaU");
        }else{
            System.out.println("not matching");
            System.out.println("MayaU");
        }
            }
    }

