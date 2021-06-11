package com.vaer.hw3.beans;

import java.util.ArrayList;
import java.util.List;

public class Data {

    /* static field */
    private static Data dataSingleton = null;

    /* class fields */
    private List<String> userEmails;

    private Data(){
        this.userEmails = new ArrayList<>();
        this.userEmails.add("ivanov@gmail.com");
        this.userEmails.add("petrov@gmail.com");
        this.userEmails.add("sidorov@gmail.com");
    }

    /*getters and setters*/
    public List<String> getUserEmails() {
        return userEmails;
    }

    public void setUserEmails(List<String> userEmails) {
        this.userEmails = userEmails;
    }

    public static Data getInstance(){
        if(dataSingleton == null)
            dataSingleton = new Data();

        return dataSingleton;
    }

    /* object methods */
    @Override
    public String toString() {
        return "Data{" +
                "userEmails=" + userEmails +
                '}';
    }
}
