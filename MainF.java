public class MainF {

    public static void main(String[] args) {


        Flowers f = () -> {
            System.out.println("Rose");
        };
        f.bloom();

        Flowers f2 = () -> {
            System.out.println("Jasmine");
        };
        f2.bloom();
    }
}
