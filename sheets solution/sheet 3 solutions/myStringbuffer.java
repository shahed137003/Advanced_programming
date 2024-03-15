public class MyStringBuffer {
   private char arr[]=new char [3000];
private int  arrSize;

    public MyStringBuffer() {
        //arr=new char[6];

    }

    public MyStringBuffer(String str) {    
    arr=str.toCharArray();
    }
   void print(){
   
   System.out.println(arr);
   }
   
   
  int   indexOf(char d)
  { int flag=0; int i;
  for( i=0;i<arr.length;i++)
  {
  if(arr[i]==d)
  { flag=1;
  break;
  }
  }
  if(flag==0)
  return -1;
  else
      return i;
  }
  
  
  
  int length(){
  return arr.length;
  
  }
//   void  erase(int index, int length){
//   {int wanted=index+length;
//  for(int i=index;i<wanted;i++){
//  arr[i]=' ';
//  }
//   for(int i=wanted;i<arr.length;i++ ){
// arr[i-length]=arr[i];
// arr[i]=' ';
//   } 
   // arr.length-=length;
//   }
void erase (int index, int length){

if(index>arr.length||length>arr.length)
System.out.println("that is not a valid index , please try again");
else
{  // get the new array :
    char arrNew[]=new char [100];
String str=String.valueOf(arr);
 str.getChars(0, index, arrNew, 0);// here we add the first part in the array
 
 str.getChars(index+length,arr.length, arrNew, index); // adding the second part in the char array
arr=arrNew;
}
    
}
//    public char[] getArr() {
//           arr=new char [100];
//        return arr;
//    }
void insert(int index, String str){
    if(index>arr.length) System.out.println("that isnot a valid index , please try again");
    else{
 char arrNew[]=new char [100];
String strArr=String.valueOf(arr);
 strArr.getChars(0, index, arrNew, 0);// here we add the first part in the array

 str.getChars(0, str.length(), arrNew, index);

strArr.getChars(index,arr.length , arrNew, str.length()+index);
arr=arrNew;
    }
}
//    public void setArr(char[] arr) {
//        this.arr=new char [100];
//        this.arr = arr;
//    }
//   
   
}
public static void main(String[] args) {
    MyStringBuffer trial= new MyStringBuffer("hello there this ");
trial.print();
System.out.println(trial.indexOf('r'));
trial.insert(3,"this is me ");
trial.print();
trial.erase(2, 5);
trial.print();
   
}
