package com.javarush.task.pro.task17.task1716;

/* 
Дорожное движение
Классы Car и Bus имплементируют интерфейс Vehicle. При этом имплементации некоторых его методов у них сходятся.
Реализуй эти методы как default в самом интерфейсе Vehicle, а из классов Car и Bus их убери.
*/

public interface Vehicle {
    default public void start()  {
        System.out.println("Начинаю движение.");
    };
    default public void move() {
        System.out.println("Еду со средней скоростью 50 км/ч.");
    }
    default public void stop() {
        System.out.println("Останавливаюсь.");
    }
}
