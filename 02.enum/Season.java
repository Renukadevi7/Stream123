package Enum;
public enum Season {
    
   
   WINTER {
      public String getHours() { return "10am-3pm"; }
   },
   SPRING {
      public String getHours() { return "9am-5pm"; }
   },
   SUMMER {
      public String getHours() { return "9am-7pm"; }
   },
   FALL {
      public String getHours() { return "9am-5pm"; }
   };
   public abstract String getHours();
}
//  What's going on here? It looks like we created an abstract class and a bunch of tiny subclasses. In a way, we did. The enum itself has an abstract method.
    

// 0 1 2
// public class Favorites {
//    enum Flavors {
//       VANILLA, CHOCOLATE, STRAWBERRY
//       static final Flavors DEFAULT = STRAWBERRY;
//   }
//    public static void main(String[] args) {
//       for(final var e : Flavors.values())
//          System.out.print(e.ordinal()+" ");
//   }
// }