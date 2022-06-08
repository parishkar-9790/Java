package com.company;
class base1 {
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    base1(){
        System.out.println("hey there this is a constructor");
    }
}
class Derived1 extends base1{
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}

public class c42inhertancequestion {
    public static void main(String[] args){
    base1 b=new base1();
    Derived1 d=new Derived1();
    }
}
