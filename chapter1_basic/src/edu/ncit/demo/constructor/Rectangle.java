package edu.ncit.demo.constructor;

public class Rectangle {
    private int legnth;
    private int width;

    public Rectangle(int legnth, int width){
        this.legnth=legnth;
        this.width=width;
    }
    public int calculateArea(){
        return this.legnth*this.width;
    }
    public  int calculatePerimeter(){
        return  2*(this.legnth+this.width);
    }

    public static  void main(String args[]){
        Rectangle rectangle= new Rectangle(10,20);
        System.out.println("Area::"+ rectangle.calculateArea());
        System.out.printf("Perimeter:::"+ rectangle.calculatePerimeter());
    }
}
