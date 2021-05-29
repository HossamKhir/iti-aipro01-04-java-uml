/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iti.ai.java.exercise03;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Hossam Khair
 */
public class Exercise03 {

    public static void main(String[] args) {
        String csvCities = "src/main/resources/Cities.csv";
        String csvCountries = "src/main/resources/Countries.csv";
        List<City> cities = citiesFromMetadata(readCSVFile(csvCities));
        List<Country> countries = countriesFromMetadata(readCSVFile(csvCountries));
        Map<String, List<City>> mpCountryCities = new HashMap<>();
//        long count
//                = cities.stream().filter(t
//                        -> t.getCountryCode().equals("AFG")).count();
//        System.out.println("count = " + count);
        countries.stream().forEach((Country c) -> {
            List<City> collected
                    = cities.stream().filter((City t)
                            -> t.getCountryCode().equals(c.getCode()))
                            .collect(Collectors.toList());
            mpCountryCities.put(c.getCode(), collected);
        });
        System.out.println(mpCountryCities.get("AFG"));

    }

    /**
     *
     * @param fileName
     * @return
     */
    public static List<String[]> readCSVFile(String fileName) {
        try (CSVReader reader = new CSVReader(new FileReader(fileName));) {
            return reader.readAll();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Exercise03.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | CsvException ex) {
            Logger.getLogger(Exercise03.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param metadata
     * @return
     */
    public static List<Country> countriesFromMetadata(List<String[]> metadata) {
        return metadata.stream().map(Country::new).collect(Collectors.toList());
//        List<Country> collected = metadata.stream().map(Country::new).collect(Collectors.toList());
//        return collected.toArray(new Country[collected.size()]);
    }

    /**
     *
     * @param metadata
     * @return
     */
    public static List<City> citiesFromMetadata(List<String[]> metadata) {
        return metadata.stream().map(City::new).collect(Collectors.toList());
//        return collected.toArray(new City[collected.size()]);
    }
}
