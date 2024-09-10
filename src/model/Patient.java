package model;

import java.util.Date;

public class Patient extends  User{
    private String grupRh;
    private double height;
    private double weight;
    private Date date;

    public Patient(String name, String lastName, int age, String email, String grupRh, double height, double weight) {
        super(name, lastName, age, email);
        this.grupRh = grupRh;
        this.weight = weight;
        this.height = height;
        this.date = new Date();
    }

    public String getGrupRh() {
        return grupRh;
    }

    public void setGrupRh(String grupRh) {
        this.grupRh = grupRh;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "This is a Patient: " + "\n" + "Sign In: " + getDate();
    }
}
