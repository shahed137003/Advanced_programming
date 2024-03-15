public class MyStringBuffer {
   private char arr[];
private int  arrSize;
    public MyStringBuffer() {
        arr=new char[6];
       arr[0]='h';
       arr[1]='e';
       arr[2]='l';
       arr[3]='l';
       arr[4]='o';
       arr[5]='\0';
    }

    public MyStringBuffer(char[] arr) {
        this.arr = arr;
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
   void  erase(int index, int length)
   {int wanted=index+length;
  for(int i=index;i<wanted;i++){
  arr[i]=' ';
  }
   for(int i=wanted;i<arr.length;i++ ){
 arr[i-length]=arr[i];
 arr[i]=' ';
   } 
   // arr.length-=length;
   }

//    public char[] getArr() {
//           arr=new char [100];
//        return arr;
//    }
void inset(int index, String str){
int strLength=str.length();
char arrChar[]=new char [300];
arrChar=str.toCharArray();
int wanted=strLength+index;
for(int i=index;i<wanted;i++)
{ 
    arr[i]=arrChar[i-index];
}
    
    
}
    public void setArr(char[] arr) {
        this.arr=new char [100];
        this.arr = arr;
    }
   
   
}
