
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