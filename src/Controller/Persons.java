package Controller;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.lang.reflect.Array;

import java.util.Scanner;



import Model.Person;
import Model.Student;
import Model.Teacher;

public class Persons {
    ArrayList<Person> persons = new ArrayList<Person>();
    Scanner sc = new Scanner(System.in);

    public boolean checkConflict(int ID){
        for (Person person : persons) {
            if (person.getID() == ID) return false;
        }
        return true;
    }

    public Persons() {
    }

    // 1
    public void displayAll() {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    // 2

    public void inputStudent() {

        System.out.println("Nhap thong tin cho Student: ");
        System.out.println("Nhap ID");
        int ID;
        // Kiem tra ID da ton tai
        do {
            ID  = Integer.parseInt(sc.nextLine());
            if (!checkConflict(ID)) System.out.println("ID da ton tai, vui long nhap lai!!");
            else break;
        }while(true);

        System.out.println("Nhap ten");
        String Name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int Age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi");
        String Address = sc.nextLine();
        System.out.println("Nhap diem toan");
        Double math = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem Ly");
        Double physics = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem Hoa");
        Double chemistry = Double.parseDouble(sc.nextLine());

        
        Student a = new Student(Name, Address, ID, Age, math, physics, chemistry);
        persons.add(a);
    }
    // 3
        public void inputTeacher() {

        System.out.println("Nhap thong tin cho Teacher: ");
        System.out.println("Nhap ID");
        int ID;
        // Kiem tra ID da ton tai
        do {
            ID  = Integer.parseInt(sc.nextLine());
            if (!checkConflict(ID)) System.out.println("ID da ton tai, vui long nhap lai!!");
            else break;
        }while(true);
        System.out.println("Nhap ten");
        String Name = sc.nextLine();
        System.out.println("Nhap tuoi");
        int Age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi");
        String Address = sc.nextLine();
        System.out.println("Nhap kinh nghiem");
        int experience = Integer.parseInt(sc.nextLine());

        
        persons.add(new Teacher(Name, Address, ID, Age, experience));
  
    }
    // 6

    public void removePerson(){
        System.out.println("Nhap ID can xoa");
        int ID = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < persons.size(); i++){
            if (persons.get(i).getID() == ID){
                persons.remove(i);
                System.out.println("Xoa thanh cong!!");
                return;
            }
        }
        System.out.println("ID khong ton tai!");
    }
    // 7
    public void updatePerson(){
        System.out.println("Nhap ID can sua");
        int ID= Integer.parseInt(sc.nextLine());
        for (int i = 0; i < persons.size(); i++) {
            if(persons.get(i).getID()==ID) {

                System.out.println(persons.get(i).toString());

                System.out.println("Nhap ten");
                String Name = sc.nextLine();
                System.out.println("Nhap tuoi");
                int Age = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap dia chi");
                String Address = sc.nextLine();

                if (persons.get(i) instanceof Student){
                    
                    System.out.println("Nhap diem toan");
                    Double math = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhap diem Ly");
                    Double physics = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhap diem Hoa");
                    Double chemistry = Double.parseDouble(sc.nextLine());
                    
                    Student A = new Student(Name, Address, ID, Age, math, physics, chemistry);

                    persons.set(i,A);
                }else{
                    System.out.println("Nhap kinh nghiem");
                    int experience = Integer.parseInt(sc.nextLine());

                    Teacher B = new Teacher(Name, Address, ID, Age, experience);

                    persons.set(i, B);
                }
                System.out.println("Cap nhat thanh cong!!");
                return;
            }

        }
        System.out.println("Khong tim thay ID!!");
    }
    
    public void sortPerson(){
        System.out.println("Nhap thuoc tinh can sap xep: ");
        System.out.println("1. Tang ID ");
        System.out.println("2. Giam ID ");
        System.out.println("3. Tang Name ");
        System.out.println("4. Giam Name ");
        System.out.println("5. Tang Age ");
        System.out.println("6. Giam Age ");
        System.out.println("7. Tang Address ");
        System.out.println("8. Giam Address ");
        System.out.println("9. Sắp xếp các *Teacher* ở trước *Student*, *Teacher* sắp xếp theo Experience, *Student* sắp xếp theo điểm trung bình 3 môn ");
        
        int choose=Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Tang ID ");
                persons.sort((a,b)-> a.getID() - b.getID());                               
                break;
            case 2:
                System.out.println("2. Giam ID ");
                persons.sort((a,b)-> b.getID() - a.getID());                
                break;
            case 3:
                System.out.println("3. Tang Name ");
                persons.sort((a,b)-> a.getName().compareTo(b.getName()));            
                break;
            case 4:
                System.out.println("4. Giam Name ");
                persons.sort((a,b)-> b.getName().compareTo(a.getName()));           
                break;
            case 5:
                System.out.println("5. Tang Age ");
                persons.sort((a,b)-> a.getAge() - b.getAge());                               
                break;
            case 6:
                System.out.println("6. Giam Age ");
                persons.sort((a,b)-> b.getAge() - a.getAge());                               
                break;
            case 7:
                System.out.println("7. Tang Address ");
                persons.sort((a,b)-> a.getAddress().compareTo(b.getAddress()));                         
                break;
            case 8:
                System.out.println("8. Giam Address ");
                persons.sort((a,b)-> b.getAddress().compareTo(a.getAddress()));                                        
                break;
            case 9:
                System.out.println("9. Sắp xếp các *Teacher* ở trước *Student*, *Teacher* sắp xếp theo Experience, *Student* sắp xếp theo điểm trung bình 3 môn ");
                persons.sort((a,b)-> {
                    if(a instanceof Student && b instanceof Teacher){
                        return -1;
                    }
                    if(a instanceof Student && b instanceof Student ){
                        return (int)(((Student)a).getMath()-((Student)b).getMath());                   
                    }
                    if(a instanceof Teacher && b instanceof Teacher){
                        return ((Teacher)a).getExperience()-((Teacher)b).getExperience();
                    }                          
                    return 1;
                    
                });
                
                break;
            default:
                break;
        }

      
        // for (int i = 0; i < persons.size(); i++) {
        //     for (int j = i+1; j < persons.size(); j++) {
        //         // if(persons.get(i).getID() > persons.get(j).getID()){
        //         //     Person temp = new Person();
                    
                
        //     }
        // }
        // persons.sort((a,b)-> {
        //     int res = 0;
        //     res = a.getID() - b.getID();
        //     return res;
        // });
       
    }
    
    public void findPerson(){
        System.out.println("Nhap thuoc tinh can tim");
        System.out.println("1. Tim theo ID");
        System.out.println("2. Tim theo ten");
        System.out.println("3. Tim theo tuoi");
        System.out.println("4. Tim theo dia chi");
        int choose=Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhap ID can tim: ");
                int ID=Integer.parseInt(sc.nextLine());
                for (int i = 0; i < persons.size(); i++) {
                    if(persons.get(i).getID()==ID){
                        System.out.println(persons.get(i).toString());
                        return;
                    }
                }
                System.out.println("ID khong hop ton tai!");
                break;
            case 2:
                    System.out.println("Nhap ten can tim: ");
                    String name = sc.nextLine();
                    for (int i = 0; i < persons.size(); i++) {
                        if(persons.get(i).getName().equals(name)){
                        System.out.println(persons.get(i).toString());
                        return;
                        }
                    }
                    System.out.println("Ten khong ton tai!");

                break;
            case 3:
                    System.out.println("Nhap tuoi can tim: ");
                    int age = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < persons.size(); i++) {
                        if(persons.get(i).getAge()==age){
                            System.out.println(persons.get(i).toString());
                            return;
                        }                                                     
                    }
                    System.out.println("Tuoi khong ton tai!");
                break;
            case 4:
                    System.out.println("Nhap dia chi can tim: ");
                    String address =sc.nextLine();
                    for (int i = 0; i < persons.size(); i++) {
                        if(persons.get(i).getAddress()==address){
                            System.out.println(persons.get(i).toString());
                            return;                               
                        }                
                    }
                    System.out.println("Dia chi khong ton tai!");        
                break;
            default:
            System.out.println("Vui long nhap dung!");
                break;
        }
    }
}
