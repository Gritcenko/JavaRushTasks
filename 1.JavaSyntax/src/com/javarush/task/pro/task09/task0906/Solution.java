package com.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двоичный конвертер
Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Задача — реализовать эти методы.
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {

        int scale = 2;
        String result = "";
        if (decimalNumber <= 0){
            return result;
        }

        while (decimalNumber > 0){
            int tmp = decimalNumber % scale;
            result = tmp + result;
            decimalNumber = decimalNumber/scale;

                //напишите тут ваш код
            }
        return result;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNumber = 0;
        if (binaryNumber == null){
            return decimalNumber;
        }
        for (int x = 0; x < binaryNumber.length(); x++){
            int a = binaryNumber.charAt(x) - '0'; // берём цифру из двоичного числа, поскольку char возвращает код символа, а нам нужна цифра 1 или 0, то нужно отнять 0, поскольку код символа 1 больше на 1, чем код 0
            int b = binaryNumber.length()-1-x; // степень
            int c = (int) Math.pow(2, b); // возводим 2 в степень
            decimalNumber =decimalNumber + a*c;
        }
        return decimalNumber;
    }
}
