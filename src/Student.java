import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String Name;
    String Address;
    int ID;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    void Modify2(){
        Scanner s =new Scanner(System.in);
        Student student = new Student();
        System.out.println(" Name :");
        this.Name=s.nextLine();

        System.out.println(" Address :");
        this.Address = s.nextLine();

        System.out.println(" ID :");
        this.ID = s.nextInt();

        System.out.print("Modification is successfully completed");
    }

}