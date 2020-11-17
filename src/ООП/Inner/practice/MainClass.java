/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
