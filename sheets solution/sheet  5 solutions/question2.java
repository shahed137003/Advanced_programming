import javafx.geometry.Point2D;
public abstract class   General_shape {
 Point2D start;
    public General_shape()
    {
    }
    public General_shape( Point2D startp)
    {
        start=startp;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }
    
   public  abstract void Draw();


}
import javafx.geometry.Point2D;
public class RectangleShape extends General_shape {

private double length;
private double width;

    public RectangleShape( Point2D startp,double length, double weight) {
        super(startp);
        this.length = length;
        this.width = weight;
    }

    public RectangleShape() {
    }

  

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getwidth() {
        return width;
    }

    public void setwidtht(double width) {
        this.width = width;
    }
import javafx.geometry.Point2D;
public class Ellipse extends  General_shape {

private double length;
private double width;

    public Ellipse( Point2D startp,double length, double weight) {
        super( startp);
        this.length = length;
        this.width = weight;
    }

    public Ellipse() {
    }

    

   

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getwidth() {
        return width;
    }

    public void setwidtht(double width) {
        this.width = width;
    }


    @Override
    public void Draw() {
        System.out.println("the informations that is to be included in this shape the length  "+length+"the width of this Ellipse "+width+"  the start point of this shape"+this.getStart()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      
    
}

import javafx.geometry.Point2D;
public class Line extends General_shape {

private Point2D pend;

    public Line() {
//        pstart=new Point2D(8,9);
//        pend=new Point2D(12,23);
        
    }

    public Line(Point2D pstart, Point2D pend) {
        super(pstart);
        this.pend = pend;
    }

 

   
    public Point2D getPend() {
        return pend;
    }

    public void setPend(Point2D pend) {
        this.pend = pend;
    }
    
    
    
    
      @Override
    public void Draw() {
        System.out.println("the shape informations that is included  "+pend+"  the start point of this shape"+this.getStart()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
}


