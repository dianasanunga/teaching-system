import dto.Student;
import dto.Subject;
import dto.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int option = 0;
        Scanner sc = new Scanner(System.in);
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();

        do{
            System.out.println("----Teaching System-----");
            System.out.println("1. Create a Student");
            System.out.println("2. Create a Teacher");
            System.out.println("3. Create a Subject");
            System.out.println("4.  Exit");

            option = sc.nextInt();

            switch(option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
            }
        } while (option != 5);
    }
    public static Student createStudent(){
        Scanner scStudent = new Scanner(System.in);
        System.out.println("please enter a name;");
        String name = scStudent.next();
        System.out.println("please enter a lastName:");
        String lastName = scStudent.next();
        System.out.println("please enter age:");
        int age = scStudent.nextInt();
        String studentCode = scStudent.next();
        System.out.println("please enter student's code");



    }

}
