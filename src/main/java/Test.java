import java.util.function.Consumer;

public class Test {


    public static void main(String[] args) {
        Consumer<String> obj = s -> System.out.println(s);
        obj.accept("Hello");

    }
}
