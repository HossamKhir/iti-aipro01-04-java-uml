/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise301;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hossam Khair
 */
public class Exercise301 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        BufferedReader cmdReader 
//                = new BufferedReader(new InputStreamReader(System.in));

        try (BufferedReader cmdReader
                = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter logWriter
                = new BufferedWriter(new FileWriter("./logger.txt"))) {
            String input = null;
            while (true) {
                System.out.print("Enter data: ");
                input = cmdReader.readLine();
                if ("stop".equals(input.replaceAll("\\s+", "").toLowerCase())) {
                    break;
                }
                logWriter.write(input + "\n");
            }
//            do {
//                System.out.print("Enter data: ");
//                input = cmdReader.readLine();
//                logWriter.write(input + "\n");
//            } while (!"stop".equals(input.replaceAll("\\s+", "").toLowerCase()));
        } catch (IOException ex) {
            Logger.getLogger(Exercise301.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
