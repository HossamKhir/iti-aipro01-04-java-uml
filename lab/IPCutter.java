/**
 * 
 */
package lab;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * IPCutter
 * 
 * @author Hossam Khair
 */
public class IPCutter {
    /**
     * 
     * @param ip
     * @return
     */
    public static int[] seperate(String ip) {
        StringTokenizer tokeniser = new StringTokenizer(ip, "\\.");
        int[] result = new int[tokeniser.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(tokeniser.nextToken());
        }
        return result;
    }

    public static void main(String[] args) {
        String ip = "163.121.12.30";
        // System.out.println(Arrays.toString(IPCutter.seperate(ip)));
        int[] parts = IPCutter.seperate(ip);
        for (int part : parts) {
            System.out.println(part);
        }
    }
}
