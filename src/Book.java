import java.util.Scanner;

public class Book {
    String title;
    String author;
    int N_ISBN;
    int YearPub;
    Student currentBorrower ;
    Boolean checked = false;
    public void Modify1(){

        Scanner se =new Scanner(System.in);

        System.out.println("new title :");
        this.title=se.nextLine();

        System.out.println("new author :");
        this.author = se.nextLine();

        System.out.println("new ISBN :");
        this.N_ISBN = se.nextInt();

        System.out.println("new publication date :");
        this.YearPub = se.nextInt();

    }
}




