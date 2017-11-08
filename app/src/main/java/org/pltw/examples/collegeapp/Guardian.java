package org.pltw.examples.collegeapp;

/**
 * Created by rcarpenter on 10/15/17.
 */
public class Guardian extends FamilyMember {

    private String occupation;


    public Guardian() {
        super();
        this.occupation = "unknown";
        super.setEmail("randbgaming7@gmail.com");
    }

    public Guardian(String firstName, String lastname){
        super(firstName, lastname);
        this.occupation = "unknown";
        super.setEmail("randbgaming7@gmail.com");
    }

    public Guardian(String firstName, String lastName, String occupation) {
        super(firstName, lastName);
        this.occupation = occupation;
        super.setEmail("randbgaming7@gmail.com");;
    }

    public Guardian(String firstName, String lastName, String occupation, String email) {
        super(firstName, lastName);
        this.occupation = occupation;
        super.setEmail("randbgaming7@gmail.com");
    }

    public String toString(){
        String output = "Guardian: " + this.getFirstName() + " " + this.getLastName() + "\n\nOccupation: " + this.occupation;
        return output;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    }

