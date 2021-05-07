/**
 * Exercise
 * 
 * @author Hossam Khair
 */
public class Exercise implements Runnable {

    private String name;

    private Exercise() {

    }

    public Exercise(String name) {
        this();
        this.name = name;
    }

    public static void main(String[] args) {
        Thread th1 = new Thread(new Exercise("Ex. 1"));
        Thread th2 = new Thread(new Exercise("Ex. 2"));
        th1.start();
        th2.start();
        for (int i = 1; i < 32; i <<= 1) {
            System.out.println("main " + i);
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(name);
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 1; i < 1024; i <<= 1) {
            System.out.println(name + " " + i);
        }
    }
}