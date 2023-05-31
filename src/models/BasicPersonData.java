package models;

public abstract class BasicPersonData {
    public String Name;
    public String Surname;
    public int YearOfBirth;

    public int ID;

    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getSurname(){
        return this.Surname;
    }
    public void setSurname(String Surname){
        this.Surname=Surname;
    }
    public String getYearOfBirth(){
        return String.valueOf(this.YearOfBirth);
    }
    public void setYearOfBirth(int YearOfBirth){
        this.YearOfBirth=YearOfBirth;
    }
    public String getID(){
        return String.valueOf(this.ID);
    }
    public void setID(int ID){
        this.ID=ID;
    }
}
