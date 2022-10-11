package functional_interface;

public class Main {
    public static void main(String[] args) {
    FunctionalInterfaceDemo ref = (a) -> a*a;
    int ans = ref.square(5);
    System.out.println(ans);
}
}
