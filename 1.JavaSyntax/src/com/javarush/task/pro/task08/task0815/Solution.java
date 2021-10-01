package com.javarush.task.pro.task08.task0815;

/* 
Логические операторы
Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30. Изменять можно только логические операторы: && на & и || на |.


Requirements:
1. Нужно, чтобы метод taskForCondition() выводил число 30.
2. В методе taskForCondition() не меняй ничего, кроме логических операторов.
*/

public class Solution {

    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
