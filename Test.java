package com.example.springboot;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       int a=0;
        ArrayList list=new ArrayList();
       for (int i=0;i<=100;i++){
           if (i%2==0)

           System.out.println(i);
           a=a+i;
       }

       System.out.println("和是："+a);
    }
}
