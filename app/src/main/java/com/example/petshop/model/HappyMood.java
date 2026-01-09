package com.example.petshop.model;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMoodDescription() {
        return "Happy";
    }
}
