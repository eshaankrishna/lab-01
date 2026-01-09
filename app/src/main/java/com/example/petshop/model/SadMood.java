package com.example.petshop.model;

import java.util.Date;

public class SadMood extends Mood {

    public SadMood() {
        super();
    }

    public SadMood(Date date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Sad";
    }
}
