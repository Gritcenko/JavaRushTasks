package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String [] arraytmp = new String[array.length];
        int h = 0;
        for (String i : array){
            if (i != null){
                arraytmp[h] = i;
                h++;
            }
        }
        System.arraycopy(arraytmp, 0, array, 0, array.length);
    }
}
