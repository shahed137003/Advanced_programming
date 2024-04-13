import java.util.ArrayList;
import javafx.geometry.Point2D;
public class Canvas {
    
    ArrayList <General_shape> shapes ;
    // we create an array of shapes
     public Canvas()
     {
        shapes =new  ArrayList <General_shape>();
     }
    
     public void addshape(General_shape shape )
     {
     
         shapes.add(shape);   
     }
    
    public void removeshape(General_shape shape )
     {
     
         shapes.remove(shape);
     }
    
    public General_shape getshape( Point2D point)
    { General_shape closer=shapes.get(0); // we make assumption that the clsest shape is the first one 
    
    for (int i=0;i<shapes.size();i++)
    {
 Point2D p= shapes.get(i).getStart();
   if( p.distance(point)<closer.getStart().distance(point))
    closer=shapes.get(i);
    }
    
    
    return closer;
    }
    
    
    public void drawshapes(){
    for (int i=0;i<shapes.size();i++)
    {
    
    shapes.get(i).Draw();
    
    }
    
    
    }
    
    
}