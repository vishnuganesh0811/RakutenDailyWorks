[12:18 pm] Pariwesh(trainer) (Guest)
@FunctionalInterface

interface MyFunctionalInterface{​​​​​

    void count();

}​​​​​ class Impl1 implements MyFunctionalInterface{​​​​​     @Override

    public void count() {​​​​​

        System.out.println("called");

    }​​​​​

}​​​​​ public class Test {​​​​​

    public static void main(String[] args) {​​​​​

        MyFunctionalInterface impl = () -> System.out.println("called");

        impl.count();

    }​​​​​

}​​​​​

