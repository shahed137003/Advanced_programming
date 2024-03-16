public class audio_Books extends Bookstore{
    private double length;

//    public audio_Books(double length) {
//        this.length = length;
//    }
//
//    public audio_Books(double length, String title, double price, int time, Date date) {
//        super(title, price, time, date);
//        this.length = length;
//        ID++;
//    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
     @Override
    public void print() {
        super.print(); 
        System.out.println("the length in minutes "+length);
    } 
    
    
    
    
}
