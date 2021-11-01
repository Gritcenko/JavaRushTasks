package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное

В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
В классе MinMaxUtil создай публичные статические методы min() и max(), которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.

Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
Все аргументы методов должны быть типа int.


Requirements:
1. В классе MinMaxUtil должно быть создано 4 перегруженных метода min() в соответствии с условием задания.
2. В классе MinMaxUtil должно быть создано 4 перегруженных метода max() в соответствии с условием задания.
3. Методы min() должны возвращать минимальное из переданных чисел.
4. Методы max() должны возвращать максимальное из переданных чисел.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MinMaxUtil {
    public static int min(int a, int b){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b));
        int min = Collections.min(array);
        return min;
    }

    public static int min(int a, int b, int c) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c));
        int min = Collections.min(array);
        return min;
    }
    public static int min(int a, int b, int c, int d) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c, d));
        int min = Collections.min(array);
        return min;
    }
    public static int min(int a, int b, int c, int d, int e) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c, d, e));
        int min = Collections.min(array);
        return min;
    }
    public static int max(int a, int b){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b));
        int max = Collections.max(array);
        return max;
    }
    public static int max(int a, int b, int c){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c));
        int max = Collections.max(array);
        return max;
    }
    public static int max(int a, int b, int c, int d){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c, d));
        int max = Collections.max(array);
        return max;
    }
    public static int max(int a, int b, int c, int d, int e){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(a, b, c, d, e));
        int max = Collections.max(array);
        return max;
    }//напишите тут ваш код
}
