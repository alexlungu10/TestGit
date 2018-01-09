import java.util.stream.Stream;

public class TestGit {
public static void main(String[] args) {
	System.out.println("test");
	Stream.of("ABC","DEF").forEach(System.out::println);;
}
}
