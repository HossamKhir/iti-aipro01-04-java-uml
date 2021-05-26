/**
 * Exercise02
 * 
 * @author Hossam Khairullah
 */
public class Exercise02 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(isalpha(str));
        str = "World!";
        System.out.println(isalpha(str));
    }

    public static boolean isalpha(String str) {
        try {
            return !str.isEmpty() && str.chars().allMatch(Character::isLetter);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            return false;
        }
    }
}