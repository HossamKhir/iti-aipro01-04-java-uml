/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iti.ai.java.titanic;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.CategoryStyler;
import org.knowm.xchart.style.Styler;

/**
 *
 * @author Hossam Khair
 */
public class Main {

    public static void main(String[] args) {
        Main cmain = new Main();
        cmain.graphPassengerSurvivedGender(cmain.getAllPassengers());
    }

    public List<TitanicPassenger> getAllPassengers() {
        try {
            ObjectMapper om = new ObjectMapper();
            om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                    false);
            FileInputStream fis
                    = new FileInputStream("src/main/resources/titanic_csv.json");
            return om.readValue(fis, new TypeReference<List<TitanicPassenger>>() {
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void graphPassengerAges(List<TitanicPassenger> passengers) {
        List<Double> pAges = passengers.stream().map(TitanicPassenger::getAge).limit(8).collect(toList());
        List<String> pNames = passengers.stream().map(TitanicPassenger::getName).limit(8).collect(toList());
        CategoryChart chart
                = new CategoryChartBuilder().width(1024).height(768)
                        .title("Age Histogram").xAxisTitle("Names")
                        .yAxisTitle("Age").build();

        final CategoryStyler styler = chart.getStyler();
        styler.setLegendPosition(Styler.LegendPosition.InsideNW);
        styler.setHasAnnotations(true);
        styler.setStacked(true);

        chart.addSeries("Passenger's Ages", pNames, pAges);
        new SwingWrapper(chart).displayChart();
    }

    public void graphPassengerClass(List<TitanicPassenger> passengers) {
        Map<Integer, Long> result
                = passengers.stream().collect(
                        Collectors.groupingBy(TitanicPassenger::getPclass,
                                Collectors.counting())
                );

        PieChart chart
                = new PieChartBuilder().width(800).height(600)
                        .title(getClass().getSimpleName()).build();

        Color[] sliceColours = new Color[]{
            new Color(180, 68, 50),
            new Color(130, 105, 120),
            new Color(80, 143, 160)
        };
        chart.getStyler().setSeriesColors(sliceColours);

        chart.addSeries("First class", result.get(1));
        chart.addSeries("Second class", result.get(2));
        chart.addSeries("Third class", result.get(3));

        new SwingWrapper(chart).displayChart();
    }

    public void graphPassengerSurvived(List<TitanicPassenger> passengers) {
        Map<Integer, Long> survived
                = passengers.stream().collect(Collectors.groupingBy(
                        TitanicPassenger::getSurvived, Collectors.counting())
                );

        PieChart chart
                = new PieChartBuilder().width(800).height(600)
                        .title(getClass().getSimpleName()).build();

        Color[] sliceColours = new Color[]{
            new Color(180, 68, 50),
            new Color(130, 105, 120),
            new Color(80, 143, 160)
        };
        chart.getStyler().setSeriesColors(sliceColours);

        chart.addSeries("Survived", survived.get(1));
        chart.addSeries("Drowned", survived.get(0));

        new SwingWrapper(chart).displayChart();
    }

    public void graphPassengerSurvivedGender(List<TitanicPassenger> passengers) {
        Map<String, Long> gender
                = passengers.stream().filter(p -> p.getSurvived() == 1)
                        .collect(Collectors.groupingBy(
                                TitanicPassenger::getSex, Collectors.counting())
                        );

        PieChart chart
                = new PieChartBuilder().width(800).height(600)
                        .title(getClass().getSimpleName()).build();

        Color[] sliceColours = new Color[]{
            new Color(180, 68, 50),
            new Color(130, 105, 120),
            new Color(80, 143, 160)
        };
        chart.getStyler().setSeriesColors(sliceColours);

        chart.addSeries("Males", gender.get("male"));
        chart.addSeries("Females", gender.get("female"));

        new SwingWrapper(chart).displayChart();
    }
}
