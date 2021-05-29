/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iti.ai.java.exercise03;

import java.util.List;

/**
 *
 * @author Hossam Khair
 */
public interface CountryDao {

    /**
     *
     * @return
     */
    public List<Integer> getCountriesPopulation();

    /**
     *
     * @return
     */
    public double getAverageCountriesPopulation();

    /**
     *
     * @return
     */
    public int getMaxCountriesPopulation();

    /**
     *
     * @return
     */
    public List<City> getHighestPopulationCitiesPerCountry();
    
    /**
     *
     * @return
     */
    public City getHighestPopulationCapital();
}
