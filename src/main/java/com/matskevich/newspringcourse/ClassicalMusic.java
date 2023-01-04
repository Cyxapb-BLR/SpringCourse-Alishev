package com.matskevich.newspringcourse;

public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("doing my destruction");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
