package session_6;

import java.util.regex.Pattern;

public class regexDemo {
public static void main(String[] args) {
	System.out.println(Pattern.matches(".s", "as"));
	System.out.println(Pattern.matches("[^abc]", "as"));
	System.out.println(Pattern.matches("\\d", "as"));
}
}
