package org.example;

public class Wall {

    double width;
    double height;

    public  Wall( double width, double height){

        this.width=width;
        this.height=height;

    }

    public double getWidth(){
        return  width;
    }

    public double getHeight(){
        return  height;
    }


    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double getArea(){
        return  width*height;
    }
}
