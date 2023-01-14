package com.driver;

public class Main {

    public static class A{
        String meth(String s){
            return "Invoking method from class A";
        }

    }
   public static class B extends A{
       @Override
       String meth(String s) {
           return "Method is overridden in Extendend class B";
       }
   }


    public static void main(String[] args){
        B b=new B();
        b.meth("aman");
       // System.out.println(ans);

    }
  
}