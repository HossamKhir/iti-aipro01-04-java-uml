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
public class City {

    private int id;
    private String name;
    private int population;
    private String countryCode;
    
    private City() {
        
    }
    
    public City(String[] metadata) {
        this();
        int i = 0;
        this.id = Integer.parseInt(metadata[i++]);
        this.name = metadata[i++].trim();
        this.population = Integer.parseInt(metadata[i++]);
        this.countryCode = metadata[i++].trim();
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
    public String getCountryCode() {
        return countryCode;
    }

    /**
     *
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "[" + this.name + ", " + this.countryCode + "]";
    }

    
    
}
