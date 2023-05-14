package de.iav.studend.model;


public class ComputerScienceStudent extends Student implements Citizen{

    private String course;
    int cardNumber;
    String adress;


    public ComputerScienceStudent() {
        super();
    }

    public ComputerScienceStudent(String course) {
        this.course = course;
    }

    public ComputerScienceStudent(String id, String name, int age, boolean isActiveStudent, String course) {
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

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "course='" + course + '\'' +
                ", cardNumber=" + cardNumber +
                ", adress='" + adress + '\'' +
                "} " + super.toString();
    }
}
