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
                        displayEntityMenu("University");
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
                        displayEntityMenu("Category");
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
                    
                    int subjMenu;

                    do {
                        displayEntityMenu("Subject");
                        subjMenu = scanner.nextInt();

                        switch (subjMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create Subject");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View Subject");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update Subject");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete Subject");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (subjMenu != 0);
                    
                    break;
                case 4:
                    System.out.println("---------------------");
                    System.out.println("Teacher Management");
                    System.out.println("---------------------");

                    int teacherMenu;

                    do {
                        displayEntityMenu("Teacher");
                        teacherMenu = scanner.nextInt();

                        switch (teacherMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create Teacher");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View Teacher");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update Teacher");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete Teacher");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (teacherMenu != 0);

                    break;
                /* case 5:
                    System.out.println("---------------------");
                    System.out.println("Student Management");
                    System.out.println("---------------------");
                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("Address Management");
                    System.out.println("---------------------");
                    break; */
                case 5:
                    System.out.println("---------------------");
                    System.out.println("Student Management");
                    System.out.println("---------------------");

                    int studentMenu;

                    do {
                        displayEntityMenu("Student");
                        studentMenu = scanner.nextInt();

                        switch (studentMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create Student");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View Student");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update Student");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete Student");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (studentMenu != 0);

                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("Address Management");
                    System.out.println("---------------------");

                    int addressMenu;

                    do {
                        displayEntityMenu("Address");
                        addressMenu = scanner.nextInt();

                        switch (addressMenu) {
                            case 1:
                                System.out.println("---------------------");
                                System.out.println("Create Address");
                                System.out.println("---------------------");
                                break;
                            case 2:
                                System.out.println("---------------------");
                                System.out.println("View Address");
                                System.out.println("---------------------");
                                break;
                            case 3:
                                System.out.println("---------------------");
                                System.out.println("Update Address");
                                System.out.println("---------------------");
                                break;
                            case 4:
                                System.out.println("---------------------");
                                System.out.println("Delete Address");
                                System.out.println("---------------------");
                                break;
                            default:
                                System.out.println("---------------------");
                                System.out.println("Invalid Menu!");
                                System.out.println("Please choose from 1 to 4");
                                System.out.println("---------------------");
                                break;
                        }
                    } while (addressMenu != 0);

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

    private static void displayEntityMenu(String menuName) {
        System.out.println(String.format("1. Create %s", menuName));
        System.out.println(String.format("2. View %s", menuName));
        System.out.println(String.format("3. Update %s", menuName));
        System.out.println(String.format("4. Delete %s", menuName));
        System.out.println("0. Exit");
        System.out.print("Select Menu: ");
    }
}
