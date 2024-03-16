public class Text_book extends Bookstore {
    private int numberOfpages;

//    public Text_book(int numberOfpages) {
//        this.numberOfpages = numberOfpages;
//        ID++;
//    }
//
//    public Text_book(int numberOfpages, String title, double price, int time, Date date) {
//        super(title, price, time, date);
//        this.numberOfpages = numberOfpages;
//        ID++;
//    }

    public int getNumberOfpages() {
        return numberOfpages;
    }

    public void setNumberOfpages(int numberOfpages) {
        this.numberOfpages = numberOfpages;
    }
    

    @Override
    public void print() {
        super.print(); 
        System.out.println("the numberOfBages of this book "+numberOfpages);
    }
}
