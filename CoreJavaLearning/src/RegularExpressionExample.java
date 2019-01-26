import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {
    public static void main(String[] args) {
        String content = "hello world and hello java";
        String patternStr = null;
        patternStr = ".*WoRld.*";
        Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        boolean isMatched = matcher.matches();
        System.out.println("Is it a Match? " + isMatched);
    }
}
