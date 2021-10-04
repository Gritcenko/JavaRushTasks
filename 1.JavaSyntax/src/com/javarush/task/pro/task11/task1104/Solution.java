package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/



public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double dbl = Double.parseDouble(string);
        long x = Math.round(dbl);
        System.out.println(x);//напишите тут ваш код
    }
}
