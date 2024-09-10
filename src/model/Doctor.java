package model;

public class Doctor extends User {
    private String speciality;
    private String company;

    public Doctor(String name, String lastName, int age, String email, String speciality, String company) {
        super(name, lastName, age, email);
        this.speciality = speciality;
        this.company = company;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "This is a Doctor works: " + this.company + "\n" +
                "Specialization: " + this.speciality;
    }
}
