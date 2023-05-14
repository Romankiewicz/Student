package de.iav.studend.model;

public class ArcheologyStudent extends Student implements Citizen{

    private String course;
    int cardNumber;
    String adress;

    public ArcheologyStudent() {
        super();
    }
    public ArcheologyStudent(String course) {
        this.course = course;
    }

    public ArcheologyStudent(String id, String name, int age, boolean isActiveStudent, String course) {
        super(id, name, age, isActiveStudent);
        this.course = course;
    }

    public ArcheologyStudent(String course, int cardNumber, String adress) {
        this.course = course;
        this.cardNumber = cardNumber;
        this.adress = adress;
    }

    public ArcheologyStudent(String id, String name, int age, boolean isActiveStudent, String course, int cardNumber, String adress) {
        super(id, name, age, isActiveStudent);
        this.course = course;
        this.cardNumber = cardNumber;
        this.adress = adress;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public int getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "ArcheologyStudent{" +
                "course='" + course + '\'' +
                ", cardNumber=" + cardNumber +
                ", adress='" + adress + '\'' +
                "} " + super.toString();
    }
}
