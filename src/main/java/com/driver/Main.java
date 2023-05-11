package com.driver;

import java.sql.SQLOutput;

public class Main {
         public static void main(String []args){
             Product p=new Product();
             System.out.println(p.product(5,8));
             System.out.println(p.product(1,5,6));
             System.out.println(p.product(9.5,10.2));
         }
}