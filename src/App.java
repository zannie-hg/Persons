import java.util.Scanner;

import Controller.Persons;
import Model.Teacher;

public class App {

    public static void menuView(){
        
    }
    public static void main(String[] args) throws Exception {

        Persons persons = new Persons();
        Scanner sc = new Scanner(System.in);
        int choose=-1;


        while (true){
            System.out.println("+-----------Menu---------------+");
            System.out.println("|1. In tat ca cac Person       |");
            System.out.println("|2. Them mot Student           |");
            System.out.println("|3. Them mot Teacher           |");
            System.out.println("|4. In tat ca cac Person       |");
            System.out.println("|5. In tat ca cac Person       |");
            System.out.println("|6. In tat ca cac Person       |");
            System.out.println("|7. Update Person theo ID      |");
            System.out.println("|8. In tat ca cac Person       |");
            System.out.println("|9. In tat ca cac Person       |");
            System.out.println("|0. Thoat khoi chuong trinh    |");
            System.out.println("+------------------------------+");
            // yeu cau nhap lai khi nhap sai cu phap
            try {
                choose = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Phai nhap ki tu trong Menu!!!");
                continue;
            }
            switch (choose) {
                case 1:
                    persons.displayAll();
                    break;
                case 2:
                    persons.inputStudent();
                    break;
                case 3:
                    persons.inputTeacher();
                    break;
                case 4:
                    persons.sortPerson();
                    break;
                case 5:
                    persons.findPerson();
                    break;
                case 7:
                    persons.updatePerson();
                    break;
                case 0:
                    System.out.println("Bai baiii!!");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }


    }
}
