package com.javarush.task.pro.task10.task1016;

/* 
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("В городе " + city.getName() + " сегодня температура воздуха " + city.getTemperature());//напишите тут ваш код
    }

    public static void main(String[] args) {
        City city = new City("Москва", 23);
        showWeather(city);//напишите тут ваш код
    }
}
