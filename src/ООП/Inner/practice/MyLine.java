/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ООП.Inner.practice;

/**
 *
 * @author User
 */
public class MyLine {
    
    public MyPoint pointStart;
    public MyPoint pointEnd;
       

        public MyLine(int pointStartX, int pointStartY, int pointEndX, int pointEndY) {
            pointStart = new MyPoint(pointStartX, pointStartY);
            pointEnd = new MyPoint(pointEndX, pointEndY);
        }
    
    class MyPoint {
             
        public int x;
        public int y;
        

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        
    }
}
