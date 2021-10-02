package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int a = path.indexOf("jdk"); // находим индекс символа начала строки jdk, чтобы вычленить первую подстроку, до jdk
        int b = path.indexOf("/", a); // находим индекс символа начала второй подстроки, после версии jdk
        //напишите тут ваш код
        return (path.substring(0, a) + jdk + path.substring(b)); // при помощи конкатенации соединяем часть строки до jdk + новую версию jdk + оствашуюся часть строки
    }
}
