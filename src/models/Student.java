package models;
import interfaces.BasicInterface;
import interfaces.StudentInterface;

public class Student extends BasicPersonData implements BasicInterface, StudentInterface{
    private String classes;

    public String getClasses(){
        return this.classes;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String[] StudentData(){
        return new String[]{
            "Dodano ucznia: "+
            "imię: "+this.getName(),
            "nazwisko: "+this.getSurname(),
            "rok urodzenia: "+ this.getYearOfBirth(),
            "ID ucznia: "+this.getID(),
            "klasa: "+ this.getClasses(),
        };

    }

    @Override
    public void start(String opt) {
        System.out.println(START + opt);
    }
}
