import java.util.Scanner;

public class App {
    /*
    1. Manage university
    2. Manage category
    3. Manage subject
    4. Manage teacher
    5. Manage student
    6. Manage address
    */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int menu;
        
        do {
            System.out.println("1. Manage University");
            System.out.println("2. Manage Category");
            System.out.println("3. Manage Subject");
            System.out.println("4. Manage Teacher");
            System.out.println("5. Manage Student");
            System.out.println("6. Manage Address");
            System.out.println("0. Exit");
            System.out.print("Select Menu: ");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("---------------------");
                    System.out.println("University Management");
                    System.out.println("---------------------");
                   
                    int uniMenu;
                    
                    do {
                        displayMenu("University");
                        uniMenu = scanner.nextInt();

                        switch (uniMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create University");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View University");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update University");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete University");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (uniMenu != 0);

                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("Category Management");
                    System.out.println("---------------------");

                    int catMenu;
                    
                    do {
                        displayMenu("Category");
                        catMenu = scanner.nextInt();

                        switch (catMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create Category");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View Category");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update Category");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete Category");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (catMenu !=0);

                    break;
                case 3:
                    System.out.println("---------------------");
                    System.out.println("Subject Management");
                    System.out.println("---------------------");
                    break;
                case 4:
                    System.out.println("---------------------");
                    System.out.println("Teacher Management");
                    System.out.println("---------------------");
                    break;
                case 5:
                    System.out.println("---------------------");
                    System.out.println("Student Management");
                    System.out.println("---------------------");
                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("Address Management");
                    System.out.println("---------------------");
                    break;
                default:
                    System.out.println("---------------------");
                    System.out.println("Invalid Menu!");
                    System.out.println("Please choose from 1 to 6");
                    System.out.println("---------------------");
                    break;
            }
        } while (menu != 0);

        scanner.close();
    }

    private static final void displayMenu(String menuName) {
        System.out.println("1. Create " + menuName);
        System.out.println("2. View " + menuName);
        System.out.println("3. Update " + menuName);
        System.out.println("4. Delete " + menuName);
        System.out.println("0. Exit");
        System.out.print("Select Menu: ");
    }
}
