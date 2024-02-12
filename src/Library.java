import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class Library {
    ArrayList<Book> BookList = new ArrayList<>();
    ArrayList<Student> StudentList = new ArrayList<>();
    ArrayList<Reservation> ReservationList = new ArrayList<>();


    void addBook() {
        Scanner se = new Scanner(System.in);
        Book Enna = new Book();

        System.out.println("Title:");
        Enna.title = se.nextLine();

        System.out.println("Author:");
        Enna.author = se.nextLine();

        System.out.println("ISBN:");
        Enna.N_ISBN = se.nextInt();

        System.out.println("Publication Date:");
        Enna.YearPub = se.nextInt();

        BookList.add(Enna);

        System.out.println("Book is added successfully.");
    }

    public void researchBook() {
        Scanner s = new Scanner(System.in);
        System.out.println("Book's title you want to search on:");
        String title = s.nextLine();
        boolean ckeck= false;

        if (BookList.isEmpty()) {
            System.out.println("The Library is Vide ");
        }
        else {
            for (Book book : BookList) {
                if (book.title.equalsIgnoreCase(title)) {
                    System.out.println("Book exists !");
                    ckeck =true;
                }
            }
        }
        if (!ckeck){
            System.out.println("Book not found.");
        }
    }

    public void ShowBook(){
        if (BookList!= null){

            System.out.println("LIST OF BOOKS :");
            for (int i = 0; i < BookList.size(); i++) {
                System.out.print("N° of book :");
                System.out.println(i+1);
                System.out.println("Book's title :"+ BookList.get(i).title );
                System.out.println("Book's author :"+ BookList.get(i).author );
                System.out.println("Book's ISBN :"+ BookList.get(i).N_ISBN );
                System.out.println("Book's Date of publication :"+ BookList.get(i).N_ISBN );
            }
        }else {
            System.out.print("No books have been added !");
        }
    }

    public void modifyBook() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the Book you want to modify:");
        String title = s.nextLine();
        boolean mod1 = false;

        if (BookList.isEmpty()) {
            System.out.println("the library is empty.");
        } else {
            for (int i = 0; i < BookList.size(); i++) {
                if (BookList.get(i).title.equalsIgnoreCase(title)) {
                    BookList.get(i).Modify1();
                    System.out.println("Modification is successfully completed.");
                    mod1 = true;
                    break;
                }
            }
        }

        if (!mod1) {
            System.out.println("Book not found.");
        }
    }


    public void removeBook() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title of the book you want to delete:");
        String title = s.nextLine();
        boolean remov1 = false;

        if (BookList.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            for (int i = 0; i < BookList.size(); i++) {
                if (BookList.get(i).title.equalsIgnoreCase(title)) {
                    BookList.remove(i);
                    System.out.println("Book is deleted successfully.");
                    remov1 = true;
                    break;
                }
            }
        }

        if (!remov1) {
            System.out.println("Book not found.");
        }
    }


    public void addStudent(){
        Scanner s = new Scanner(System.in);
        Student Emma = new Student();

        System.out.println("Name:");
        Emma.Name = s.nextLine();

        System.out.println("Address:");
        Emma.Address = s.nextLine();

        System.out.println("ID:");
        Emma.ID = s.nextInt();

        StudentList.add(Emma);
        System.out.println("Student is added successfully.");
    }


    public void researchStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Student's name you want to search on:");
        String Name = s.nextLine();
        boolean ckeck= false;

        if (StudentList.isEmpty()) {
            System.out.println("Student's list is Vide ");
        }
        else {
            for (Student student : StudentList) {
                if (student.Name.equalsIgnoreCase(Name)) {
                    System.out.println("Student's name exists !");
                    ckeck =true;
                }
            }
        }
        if (!ckeck){
            System.out.println("Student's name not found.");
        }
    }

    public void ShowStudent(){
        Scanner s = new Scanner(System.in);
        if (StudentList!= null){

            System.out.println("LIST OF STUDENTS :");
            for (int i = 0; i < StudentList.size(); i++) {
                System.out.println("N° of student :");
                System.out.println(i+1);
                System.out.println("Student's Name :"+ StudentList.get(i).Name);
                System.out.println("Student's Adress :"+ StudentList.get(i).Address );
                System.out.println("Student's ID :"+ StudentList.get(i).ID );
            }
        }else {
            System.out.print("No Students have been added !");
        }
    }


    public void modifyStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the student you want to modify:");
        String Name = s.nextLine();
        boolean mod2 = false;

        if (StudentList.isEmpty()) {
            System.out.println("Student's list is empty.");
        } else {
            for (int i = 0; i < StudentList.size(); i++) {
                if (StudentList.get(i).Name.equalsIgnoreCase(Name)) {
                    StudentList.get(i).Modify2();
                    System.out.println("Modification is successfully completed.");
                    mod2 = true;
                    break;
                }
            }
        }

        if (!mod2) {
            System.out.println("Student with the given name not found.");
        }
    }

    public void removeStudent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title of the student you want to delete:");
        String Name = s.nextLine();
        boolean remov2 = false;

        if (StudentList.isEmpty()) {
            System.out.println("The list of students is empty.");
        } else {
            for (int i = 0; i < StudentList.size(); i++) {
                if (StudentList.get(i).Name.equalsIgnoreCase(Name)) {
                    BookList.remove(i);
                    System.out.println("Student is deleted successfully.");
                    remov2 = true;
                    break;
                }
            }
        }

        if (!remov2) {
            System.out.println("Student not found.");
        }
    }


    void AddReservation() {
        Scanner input = new Scanner(System.in);
        Reservation reserv = new Reservation();
        LocalDate currenteDate = LocalDate.now();
        boolean BookFound = false;
        boolean StudentFound = false;
        if (BookList.isEmpty()){
            System.out.println("Library is vide.");

        } else if (StudentList.isEmpty()){

            System.out.println("Library is vide.");

        } else {
            System.out.println("Add a reservation");
            System.out.println("Enter the name of student who reserve : ");
            String CheckStudentName = input.nextLine();
            for (Student ReserveStudent : StudentList){
                if (ReserveStudent.Name.equals(CheckStudentName)){
                    StudentFound = true;
                    System.out.println("Enter book s title to reserve : ");
                    String CheckBookName = input.nextLine();
                    for (Book ReserveBook : BookList){
                        if(ReserveBook.title.equals(CheckBookName)){
                            BookFound = true;
                            if(!ReserveBook.checked) {
                                ReserveStudent.borrowedBooks.add(ReserveBook);
                                reserv.BookReserv = ReserveBook;
                                ReserveBook.currentBorrower = ReserveStudent;
                                reserv.StudentReserv = ReserveStudent;
                                reserv.dateBegin = currenteDate ;
                                System.out.println("Enter the deadline of reservation (YYYY-MM-DD) : ");
                                String FormatterDate = input.nextLine();
                                reserv.dateEnd = LocalDate.parse(FormatterDate, DateTimeFormatter.ISO_DATE);
                                ReservationList.add(reserv);
                                System.out.println("Reservation is successfully complited .");
                                ReserveBook.checked = true;
                            } else {
                                System.out.println("The book is already reserved");
                            }
                            break;
                        }
                    }
                    if (!BookFound){
                        System.out.println("Book not found .");
                    }
                    break;
                }
            }
            if(!StudentFound){
                System.out.println("Students not found!");
            }

        }

    }
    void DisplayReservations() {
        if (ReservationList.isEmpty()) {

            System.out.println(" NO reservation for the moment ! ");
        } else {
            System.out.println("Reservations list :");
            for (int i = 0; i < ReservationList.size(); i++) {
                System.out.println("Reservation ID : " + (i + 1));
                System.out.println("Student's Name : " + ReservationList.get(i).StudentReserv.Name);
                System.out.println("Student's ID : " + ReservationList.get(i).StudentReserv.ID);

                System.out.println("N° of book : " + (i + 1));
                System.out.println(" Book's title reserved : " + ReservationList.get(i).BookReserv.title);
                System.out.println(" Booking start date : " + ReservationList.get(i).dateBegin);
                System.out.println(" Booking end date : " + ReservationList.get(i).dateEnd);
            }
        }
    }
    void ReturnReservation() {
        Scanner scanner = new Scanner(System.in);
        if (ReservationList.isEmpty()) {

            System.out.println(" No reservation for the moment! ");

        } else {
            System.out.println("Cancel the reservation .");
            System.out.println("Enter student's name :");
            String returnStudent = scanner.nextLine();
            boolean foundReservation = false;
            for (int i = 0; i <ReservationList.size(); i++) {
                if (ReservationList.get(i).StudentReserv.Name.equals(returnStudent)) {
                    foundReservation = true;
                    System.out.println(" Book reserved by " + returnStudent + " :");
                    for (Reservation ReturnReservation : ReservationList) {
                        System.out.println("- " + ReturnReservation.BookReserv.title);
                    }
                    System.out.println("Enter the title of book you want to cancel :");
                    String returnBookTitle = scanner.nextLine();
                    for (Book ReturnBook : BookList) {
                        if (ReturnBook.title.equals(returnBookTitle)) {
                            ReturnBook.checked = false;
                            ReturnBook.currentBorrower = null;
                            for (Student ReturnStudent : StudentList){
                                if(ReturnStudent.Name.equals(returnStudent)){
                                    ReturnStudent.borrowedBooks.remove(ReturnBook);
                                }
                            }
                            ReservationList.remove(i);
                            System.out.println("Successful cancellation ");
                            break;
                        }
                    }
                }
            }
            if (!foundReservation) {
                System.out.println("No reservations found !");
            }
        }
    }




}

