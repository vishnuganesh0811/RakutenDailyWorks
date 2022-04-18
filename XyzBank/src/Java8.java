import java.util.function.Supplier;

public class Java8 {

    public static void main(String[] args) {

 
        Supplier str = () -> "Saket";

        System.out.println(str.get());

    }

}