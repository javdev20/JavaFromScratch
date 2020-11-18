/*
1) Создайте класс MyLine.

2) Создайте внутренний класс MyPoint с public-полями x и y.

3) Добавьте public-поля pointStart, pointEnd, в которых будут храниться объекты класса Point.

4) Создайте конструктор в классе MyLine, в котором должно быть 4 параметра: x и y начальной точки и x и y конечной точки.

5) Внутри конструктора MyLine создайте на их основе два объекта Point и запишите их в соответствующие поля.

6) Создайте объект класса MyLine.

7) Выведите в основном классе в консоль координаты начальной и конечной точки в таком виде: «Начальная точка (5, 7); Конечная точка (10, 3);».
 */
package ООП.Inner.practice;

import ООП.Inner.practice.MyLine.MyPoint;

/**
 *
 * @author User
 */
public class MainClass {
    
    public static void main(String[] args) {
        MyLine e = new MyLine(4, 6, 8, 9);
        System.out.println("Start point: (" + e.pointStart.x + ", " + e.pointStart.y + ")");
        System.out.println("End point: (" + e.pointEnd.x + ", " + e.pointEnd.y + ")");
    }
}
