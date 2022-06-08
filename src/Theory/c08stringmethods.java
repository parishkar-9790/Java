//package com.company;

public class c08stringmethods {
    public static void main (String [] args)
    {
        String name="parisHkar";
//      String a1= new String("parishkar");
        int value =name.length();
//      Showing the length of the sting
        System.out.println(name);
        System.out.println("the lenght of the sting is ");
        System.out.println(value);
//      applying to lower
        String new1=name.toLowerCase();
        System.out.println("after applying to lower function ");
        System.out.println(new1);
//      applying to upper
        String new2= name.toUpperCase();
        System.out.println("after applying to upper function ");
        System.out.println(new2);
//      trimming strings
        String nonTrimmedString="  parishkar singh ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
//      making a substring out of the same string with indexing
        System.out.println(name.substring(2));
        String hello = name.substring(2);
        System.out.println(hello);
//      indexing the including and excluding string characters
        System.out.println(name.substring(1,5));
//      replacing string with the new characters
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("ris","perer"));
//      Boolean way to to check whether it is starting with the specified substring
        System.out.println(name.startsWith("par"));
        System.out.println(name.startsWith("pakr"));
        System.out.println(name.endsWith("kar"));
        System.out.println(name.endsWith("kara"));
//      it return the index number when it is called
        System.out.println(name.charAt(2));
//      indexing number of the character when it appears first time
        System.out.println(name.indexOf("r"));
//      return index of the given string starting from the index 
        String modifiedName="asuszrtufryzenz";
        System.out.println(modifiedName.indexOf("r",3));
        System.out.println(modifiedName.replace("ryzen","core"));
//        return the last index value of the last character of the given string
        System.out.println(modifiedName.lastIndexOf("r",7));
//        to check whether the string is equal to the required one
        System.out.println(name.equals("parisHkar"));
        System.out.println(name.equalsIgnoreCase("parishkar"));
        System.out.println(modifiedName.equals("asuszrtufryzenz"));




    }
}
