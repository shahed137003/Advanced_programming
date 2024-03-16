import java.util.Date;
public class Bookstore {
    protected static int ID;
    private String title;
    private Date data=new Date() ;
    private double price ;

    public Bookstore() {
        ID++;
    }

    public Bookstore(String title, double price,int time,Date date) {
        this.title = title;
        this.price = price;
        this.data=date;
        ID++;
    }


    
    
    public static int getID() {
        return ID;
    }

//    public static void setID(int ID) {
//        Bookstore.ID = ID;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
     public void print(){
     
     System.out.println("the ID of the given book "+ID+" the price of this book "+price+"the title of this book "+title +"the date of this book to be sold"+data.toString());
     
     
     }
    
    
    
    
    
}

//the applications that we use:




  public static void main(String[] args) {

int booksNum;
Scanner input= new Scanner(System.in);
System.out.println("enter the desired number of books you need: ");
booksNum=input.nextInt();
ArrayList<Bookstore> booklist=new ArrayList<Bookstore>();
for(int i=0;i<booksNum;i++){
    System.out.println("this is the "+(i+1)+"book");
System.out.println("enter the desied type of books: hint: true for textbook& false for audibooks");
boolean type=input.nextBoolean();

if(type==true)
{
Text_book Textbookdes=new Text_book ();
System.out.println("enter the desied title of books: ");
Textbookdes.setTitle(input.next());
System.out.println("enter the desied date of books: ");
Textbookdes.setData(new Date(input.nextInt()));
System.out.println("enter the desied price of books: ");
Textbookdes.setPrice(input.nextDouble());
System.out.println("enter the desied number of pages of books: ");
Textbookdes.setNumberOfpages(input.nextInt());
booklist.add(Textbookdes);
}
else
{
audio_Books audiobookdes=new audio_Books ();
System.out.println("enter the desied title of books: ");
audiobookdes.setTitle(input.next());
System.out.println("enter the desied date of books: ");
audiobookdes.setData(new Date(input.nextInt()));
System.out.println("enter the desied price of books: ");
audiobookdes.setPrice(input.nextDouble());
System.out.println("enter the desied length  in minutes of books: ");
audiobookdes.setLength(input.nextDouble());
booklist.add(audiobookdes);
}

}
//at the end of the program:
for(int i=0;i<booksNum;i++)
{
booklist.get(i).print();

}    
    
    
    
    
    
  }
 





















