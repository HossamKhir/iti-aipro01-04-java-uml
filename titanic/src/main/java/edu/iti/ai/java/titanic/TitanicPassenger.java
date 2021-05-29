/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iti.ai.java.titanic;

/**
 *
 * @author Hossam Khair
 */
public class TitanicPassenger {

    private int pclass;
    private int survived;
    private String name;
    private String sex;
    private double age;
    private int sibsp;
    private int parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String home_dest;

    public int getPclass() {
        return pclass;
    }

    public void setPclass(int pclass) {
        this.pclass = pclass;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getSibsp() {
        return sibsp;
    }

    public void setSibsp(int sibsp) {
        this.sibsp = sibsp;
    }

    public int getParch() {
        return parch;
    }

    public void setParch(int parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHome_dest() {
        return home_dest;
    }

    public void setHome_dest(String home_dest) {
        this.home_dest = home_dest;
    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "TitanicPassenger{" + "pclass=" + pclass + ", survived="
                + survived + ", name=" + name + ", sex=" + sex + ", age=" + age
                + ", sibsp=" + sibsp + ", parch=" + parch + ", ticket=" + ticket
                + ", fare=" + fare + ", cabin=" + cabin + ", embarked="
                + embarked + ", boat=" + boat + ", body=" + body
                + ", home_dest=" + home_dest + '}';
    }

}
