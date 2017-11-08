package org.pltw.examples.collegeapp;

/**
 * Created by rcarpenter on 10/15/17.
 */
public class Sibling extends FamilyMember{

    public Sibling (){
        super();
        super.setEmail("randbgaming7@gmail.com");
    }
    public Sibling (String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        super.setEmail("randbgaming7@gmail.com");
    }

    public String toString(){
        String output = "Sibling: " + this.getFirstName() + " " + this.getLastName();
        return output;
    }


}
