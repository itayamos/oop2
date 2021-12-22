import java.util.Date;

public class Person {
    private String firstName;
    private String surName;
    private String id;
    private Date birthDate;
    private boolean male;

    public Person(String firstName, String surName, String id, Date birthDate, boolean male){
        this.firstName = firstName;
        this.surName = surName;
        this.id= id;
        this.birthDate = birthDate;
        this.male= male;
    }

    public String getFullName(){
        return this.firstName+ " " +this.surName;
    }
    public String toString(){
        return "first name:"+ this.firstName +"\n"+ "sur name"
                +this.surName+"\n"+ (this.male ? "male" : "female");
    }

}
