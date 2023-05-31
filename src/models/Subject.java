package models;

public class Subject {
    public String SubjectName;
    public int TeacherID;
    public int Hours;
    public int Classroom;

    public String getSubjectName() {
        return this.SubjectName;
    }
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }
    public int getTeacherID(){
        return this.TeacherID;
    }
    public void setTeacherID(int TeacherID){
        this.TeacherID=TeacherID;
    }
    public String getHours(){
        return String.valueOf(this.Hours);
    }
    public void setHours(int Hours){
        this.Hours=Hours;
    }
    public String getClassroom(){
        return String.valueOf(this.Classroom);
    }
    public void setClassroom(int Classroom){
        this.Classroom=Classroom;
    }
    public String[] SubjectData(){
        return new String[]{
                "Dodano przedmiot: "+
                        "nazwa przedmiotu: "+this.getSubjectName(),
                "ID prowadzącego: "+this.getTeacherID(),
                "liczba godzin: "+ this.getHours(),
                "sala: "+ this.getClassroom(),
        };

    }


}
