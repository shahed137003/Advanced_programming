import java.util.Scanner;
import java.lang.Math.*;
public class Vector {
    private double x;
    private double y;
    Vector(){
    x=0;
    y=0;
    }
     Vector(double inX,double inY){
    x=inX;
    y=inY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double magnitude(){ 
    return Math.sqrt(x*x+y*y); 
    }
    
    public double angle()
    {  
    return Math.tan(y/x); 
    }
   public void print(){
   
   System.out.print("the vector is represrnted as = "+x+"i +"+y+"j");  
   } 
    Vector add(Vector v1)
    { Vector vr =new Vector();
         vr.x=this.x+v1.x;
         vr.y=this.y+v1.y;
    return vr;
    }
      Vector sub(Vector v1)
    { Vector vr =new Vector();
         vr.x=this.x-v1.x;
         vr.y=this.y-v1.y;
    return vr;
    }
static Vector[ ] CreatingAray(int size){
Vector arr[]=new Vector[size];
for(int i=0;i<size;i++)
{
  arr[i]=new Vector();
  arr[i].x=Math.random()*10;
  arr[i].y=Math.random()*10;
}
return arr;
}      
    
static void printVectorArray(Vector [] arr)
{
    System.out.println("the vector coordinate of each element in the array");
    for(int i=0;i<arr.length;i++){
    System.out.printf("%-15s%-30f\n","the magnitude if the "+(i+1)+" is = ",arr[i].magnitude());
    }

}
static Vector add(Vector v1,Vector v2)    
{
Vector vr=new Vector();
vr.x=v1.x+v2.x;
vr.y=v1.y+v2.y;
return vr;

}
}
 public static void main(String[] args) {
System.out.println("lab2:) ");
double resVect;
Vector vectorArr[]=new Vector[10];

vectorArr=Vector.CreatingAray(res);
//resVect=average(vectorArr);
//Vector.printVectorArray(vectorArr);
//System.out.println("the sum of these magnitudes "+resVect);
//System.out.println("//============================================================================="); 
//System.out.println("lab3:) ");
Vector vr1=new Vector();
Vector vr2=new Vector(4,6);
//
Vector vr3=new Vector();
vr3=Vector.add(vr1, vr2);
System.out.println("the x coordinate of this vector is"+vr3.getX()+"  and the y coordinate if this vector"+vr3.getY());


    
 }