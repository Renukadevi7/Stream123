//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AutoClosable {

    public static String show() {
        return "123";
    }


   public static void main(String... xyz) {
            try (MyFileClass bookReader = new MyFileClass(1);
                 MyFileClass movieReader = new MyFileClass(2)) {
//                System.out.println(show());
                System.out.println("Try Block");
                throw new RuntimeException();
            } catch (Exception e) {
                System.out.println("Catch Block");
            } finally {
                System.out.println("Finally Block");
            }
        }


}