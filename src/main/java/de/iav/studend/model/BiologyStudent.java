package de.iav.studend.model;

public class BiologyStudent extends Student implements Citizen {

    public String course;
    int cardNumber;
    String adress;


    public BiologyStudent() {
        super();
    }

    public BiologyStudent(String course) {
        this.course = course;
    }

    public BiologyStudent(String id, String name, int age, boolean isActiveStudent, String course) {
        super(id, name, age, isActiveStudent);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "course='" + course + '\'' +
                "} " + super.toString();
    }

    @Override
    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
