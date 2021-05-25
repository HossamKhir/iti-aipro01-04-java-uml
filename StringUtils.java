import java.util.function.BiPredicate;

/**
 * StringUtils
 * 
 * @author Hossam Khairullah
 */
public interface StringUtils {

    public static String betterString(String s1, String s2, BiPredicate<String, String> p) {
        return p.test(s1, s2) ? s1 : s2;
    }
}