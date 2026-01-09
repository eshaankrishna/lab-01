package com.example.petshop.model;

import java.util.Date;

public abstract class Mood {

    private Date date;

    // Default constructor (sets current date)
    public Mood() {
        this.date = new Date();
    }

    // Constructor with provided date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    // Abstract method
    public abstract String getMoodDescription();
}
