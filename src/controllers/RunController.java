package controllers;
import models.BasicPersonData;
import models.Student;
import models.Subject;
import models.Teacher;

import java.util.Arrays;
import java.util.Scanner;

public class RunController extends BasicPersonData{
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z opcji: ");
        System.out.println("1. Dodawanie ucznia (wpisz: student) ");
        System.out.println("2. Dodawanie nauczyciela (wpisz: teacher) ");
        System.out.println("3. Dodawanie przedmiotu (wpisz: subject) ");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision){
            case "student"->{
                Student student =new Student();
                System.out.println("Podaj imię ucznia");
                student.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj nazwisko ucznia");
                student.setSurname(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj rok urodzenia ucznia");
                student.setYearOfBirth(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj ID ucznia: ");
                student.setID(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj do jakiej klasy chodzi uczeń: ");
                student.setClasses(String.valueOf(scanner.nextLine()));
                System.out.println(Arrays.toString(student.StudentData()));
            }
            case "teacher"->{
                Teacher teacher= new Teacher();
                System.out.println("Podaj imię nauczyciela: ");
                teacher.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj nazwisko nauczyciela: ");
                teacher.setSurname(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj rok urodzenia nauczyciela: ");
                teacher.setYearOfBirth(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj ID nauczyciela: ");
                teacher.setID(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj pensje nauczyciela: ");
                teacher.setSalary(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(teacher.TeacherData()));
            }
            case "subject"->{
                Subject subject= new Subject();
                System.out.println("Podaj nazwe przedmiotu: ");
                subject.setSubjectName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj ID nauczyciela prowadzącego zajęcia: ");
                subject.setTeacherID(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj liczbę godzin tych zajęć: ");
                subject.setHours(Integer.parseInt(scanner.nextLine()));
                System.out.println("Podaj sale w której odbywają się zajęcia: ");
                subject.setClassroom(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(subject.SubjectData()));
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }
        System.out.println("Zakończono dodawanie");

    }
}
