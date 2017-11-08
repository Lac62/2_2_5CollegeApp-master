package org.pltw.examples.collegeapp;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by rcarpenter on 10/15/17.
 */
public class Profile {

    private String firstName, lastName;
    private Date birthday;
    private String mEmail;
    public String objectId;

    public String getPhotoFilename(){
        return"IMG_PROFILE.jpg";
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public void Profile() {
        birthday = new GregorianCalendar(1986, 5, 15).getTime();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        if (birthday != null)
        {
        return birthday;
        }
        else{
            birthday = new GregorianCalendar(1986, 5, 15).getTime();
            return birthday;
        }
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
