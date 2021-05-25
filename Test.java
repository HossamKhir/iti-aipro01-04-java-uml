import java.util.function.BiPredicate;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        String s1 = "Hello", s2 = "World!";
        String res = StringUtils.betterString(s1, s2, (t1, t2) -> t1.length() > t2.length());
        System.out.println(res);
        res = StringUtils.betterString(s1, s2, (t1, t2) -> true);
        System.out.println(res);
    }
}