public class Mavenproject1 {
static double area(double length,double width){
return length*width;
}
static double area(double rad){
return Math.PI*rad*rad;
}
static int sumArr(int arr[]){
    int sum=0;
for(int i=0;i<arr.length;i++)
sum+=arr[i];
return sum;
}

    public static void main(String[] args) {
      System.out.println("the first question");
double areaRea=area(4,5.5);
 double areaCir=area(5);   
System.out.println("the area of rectangle = "+areaRea+" and the area of circle = "+areaCir);
System.out.println("the second question");
for(int i=0;i<10;i++){ 
 if (i%2 == 0) 
continue; // in this case it will print only the aodd numbers and itd=s square
 System.out.println(i+ " " + i * i); 
 } 
 System.out.println("by replacing it by break statement");
   for(int i=0;i<10;i++){ 
if (i%2 == 0) 
break; //nothing will be printed
 System.out.println(i+ " " + i * i); 
}     
 System.out.println("//------------------------------------------------------------");       
   for(int i=0;i<5;i++){
  for(int j=0;j<=i;j++)
  {
  System.out.print("*");

   }
   System.out.println("");
   }
    }
}