// Static Initialization (Runs once when the class is loaded)

//Static blocks run only once when the class is loaded into memory
//(Superclass -----> Subclass).Instance blocks run every time an new object is created, before the constructor
//(Superclass instance blocks ----> Superclass constructor -----> Subclass instance blocks ----> Subclass constructor).
//
//class Arachnid {
//    static StringBuilder sb = new StringBuilder();
//    { sb.append("c"); }
//    static
//     { sb.append("u"); }
//     { sb.append("r"); }
//}
//
//
//public class Scorpion extends Arachnid {
//    static
//    { sb.append("q"); }
//    { sb.append("m"); }
//
//
//
//    public static void main(String[] args) {
//        System.out.print(Scorpion.sb + " ");
//        System.out.print(Scorpion.sb + " ");
//        new Arachnid();
//        new Scorpion();
//        System.out.print(Scorpion.sb);
//    }
//}
    

// uq uq uqcrcrm