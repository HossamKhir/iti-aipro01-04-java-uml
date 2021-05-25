/**
 * 
 */
package pyramids;

import java.util.List;
import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * PyramidCSVDAO
 * 
 * @author Hossam Khair
 */
public class PyramidCSVDAO {
    /**
     * 
     */
    public static final int PHARAOH = 0;
    public static final int MODERN_NAME = 2;
    public static final int SITE = 4;
    public static final int HEIGHT = 7;

    /**
     * 
     */
    public PyramidCSVDAO() {

    }

    public static void main(String[] args) {
        PyramidCSVDAO dao = new PyramidCSVDAO();
        List<Pyramid> pyramids = dao.readPyramidsFromCSV("./pyramids.csv");
        System.out.println(pyramids);
    }

    /**
     * 
     * @param fileName
     * @return
     */
    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        final List<Pyramid> pyramids = new ArrayList<>();
        // (new Thread(new Runnable() {
        // @Override
        // public void run() {
        // // TODO Auto-generated method stub
        // try (BufferedReader csvReader = new BufferedReader(new FileReader(fileName)))
        // {
        // csvReader.readLine(); // get rid of metadata
        // while (true) {
        // String record = csvReader.readLine();
        // if (record == null) {
        // break;
        // }
        // // System.out.println(record);
        // String[] metadata = record.split("\\,");
        // // System.out.println(Arrays.toString(metadata));
        // Pyramid pyramid = createPyramid(metadata);
        // if (pyramid == null) {
        // continue;
        // }
        // // System.out.println(pyramid.toString());
        // pyramids.add(pyramid);
        // }
        // } catch (Exception ex) {
        // ex.printStackTrace();
        // }
        // }
        // })).start();
        // System.out.println(pyramids);
        // while (pyramids.isEmpty()) {
        // try {
        // Thread.sleep(100);
        // } catch (InterruptedException ie) {
        // ie.printStackTrace();
        // }
        // }
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try (BufferedReader csvReader = new BufferedReader(new FileReader(fileName))) {
                    csvReader.readLine(); // get rid of metadata
                    while (true) {
                        String record = csvReader.readLine();
                        if (record == null) {
                            break;
                        }
                        // System.out.println(record);
                        String[] metadata = record.split("\\,");
                        // System.out.println(Arrays.toString(metadata));
                        Pyramid pyramid = createPyramid(metadata);
                        if (pyramid == null) {
                            continue;
                        }
                        // System.out.println(pyramid.toString());
                        pyramids.add(pyramid);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        th.start();
        try {
            th.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        return pyramids;
    }

    /**
     * 
     * @param metadata
     * @return
     */
    public Pyramid createPyramid(String[] metadata) {
        if (metadata[HEIGHT].equals("")) {
            return null;
        }
        return new Pyramid(metadata[PHARAOH], metadata[MODERN_NAME], metadata[SITE],
                Double.parseDouble(metadata[HEIGHT]));
    }
}