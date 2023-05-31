package models;

import interfaces.BasicInterface;
import interfaces.TeacherInterface;

public class Teacher extends BasicPersonData implements BasicInterface, TeacherInterface {
    private int salary;

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] TeacherData() {
        return new String[]{
                "Dodano nauczyciela: " +
                        "imię: " + this.getName(),
                "nazwisko: " + this.getSurname(),
                "rok urodzenia: " + this.getYearOfBirth(),
                "ID nauczyciela: " + this.getID(),
                "pensja: " + this.getSalary(),
        };

    }

    @Override
    public void start(String opt) {
        System.out.println(START + opt);
    }
}
