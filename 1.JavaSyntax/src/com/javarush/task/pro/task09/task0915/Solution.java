package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer t = new StringTokenizer(query, delimiter);
        String[] tmp = new String[6];
        int i = 0;
        while (t.hasMoreTokens()) {
                tmp[i++] = t.nextToken();
        }
        return tmp;
    }
}
