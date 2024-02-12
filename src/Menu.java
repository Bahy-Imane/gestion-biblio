import java.util.Scanner;

class Menu {
    public  void menu() {
        int choice;
        Library Enaa = new Library();
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("*********** Menu *************");
            System.out.println("Press [1] if you want to add a Book.");
            System.out.println("Press [2] if you want to add a Student.");
            System.out.println("Press [3] if you want to research on a Book.");
            System.out.println("Press [4] if you want to research on a Student.");
            System.out.println("Press [5] if you want to show a Book.");
            System.out.println("Press [6] if you want to show a Student.");
            System.out.println("Press [7] if you want to modify a Book.");
            System.out.println("Press [8] if you want to modify a Student.");
            System.out.println("Press [9] if you want to remove a Book.");
            System.out.println("Press [10] if you want to remove a Student.");
            System.out.println("Press [12] if you want to add a reservation.");
            System.out.println("Press [13] if you want to show the list of reservations.");
            System.out.println("Press [14] if you want to return a book.");
            System.out.println("Press [0] if you want to quit.");

            System.out.println("Your choice:");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    Enaa.addBook();
                    break;
                case 2:
                    Enaa.addStudent();
                    break;
                case 3:
                    Enaa.researchBook();
                    break;
                case 4 :
                    Enaa.researchStudent();
                    break;
                case 5:
                    Enaa.ShowBook();
                    break;
                case 6:
                    Enaa.ShowStudent();
                    break;
                case 7:
                    Enaa.modifyBook();
                    break;
                case 8:
                    Enaa.modifyStudent();
                    break;
                case 9:
                    Enaa.removeBook();
                    break;
                case 10:
                    Enaa.removeStudent();
                    break;
                case 11:
                    Enaa.AddReservation();
                    break;
                case 12:
                    Enaa.DisplayReservations();
                    break;
                case 13:
                    Enaa.ReturnReservation();
                    break;

                case 0:
                    System.out.println("Have a good day.");
                    break;
                default:
                    System.out.println("Your choice is invalid.");
            }
        }while (choice != 0);
    }
}