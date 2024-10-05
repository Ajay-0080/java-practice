import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
class Book {
    String bookName;
    String bookAuthor;
    float bookPrice;
    public Book(String bookName, String bookAuthor, float bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

}
class HashTableDemo {
    public static void main(String [] args) {
        Map <Integer,Book> table = new Hashtable <Integer,Book> ();
        int bookId;
        String bookName;
        String bookAuthor;
        float bookPrice;
        char choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter the book id");
            bookId=sc.nextInt();
            sc.nextLine();
            System.out.println("enter the book name");
            bookName=sc.nextLine();
            System.out.println("enter the book author");
            bookAuthor=sc.nextLine();
            System.out.println("enter the book price");
            bookPrice=sc.nextFloat();
            table.put(bookId,new Book(bookName,bookAuthor,bookPrice));
            System.out.println("do you want to continue");
            choice=sc.next().charAt(0);
            if(choice=='y' || choice=='Y') {
                continue;
            }
            else {
                break;
            }

        } while (true);

        System.out.println("bookId \t bookName \t bookAuthor \t bookPrice");
        for(Map.Entry<Integer,Book> entry: table.entrySet()) {
            int key = entry.getKey();
            Book book = entry.getValue();
            System.out.println(key+"\t"+book.bookName+"\t"+book.bookAuthor+"\t"+book.bookPrice);



        }


    }
    
}
