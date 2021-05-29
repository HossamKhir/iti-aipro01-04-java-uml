/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iti.ai.java.exercise03;

/**
 *
 * @author Hossam Khair
 */
public class Country {

    private String code;
    private String name;
    private String continent;
    private double surfaceArea;
    private int population;
    private double gnp;
    private int capital;

    private Country() {

    }

    public Country(String[] metadata) {
        this();
        int i = 0;
        this.code = metadata[i++].trim();
        this.name = metadata[i++].trim();
        this.continent = metadata[i++].trim();
        this.population = Integer.parseInt(metadata[i++]);
        this.surfaceArea = Double.parseDouble(metadata[i++]);
        this.gnp = Double.parseDouble(metadata[i++]);
        this.capital = Integer.parseInt(metadata[i++]);
    }

    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getContinent() {
        return continent;
    }

    /**
     *
     * @param continent
     */
    public void setContinent(String continent) {
        this.continent = continent;
    }

    /**
     *
     * @return
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     *
     * @param surfaceArea
     */
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    /**
     *
     * @return
     */
    public int getPopulation() {
        return population;
    }

    /**
     *
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     *
     * @return
     */
    public double getGnp() {
        return gnp;
    }

    /**
     *
     * @param gnp
     */
    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    /**
     *
     * @return
     */
    public int getCapital() {
        return capital;
    }

    /**
     *
     * @param capital
     */
    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "[" + this.code + ", " + this.name + ", " + this.continent + "]";
    }

}
