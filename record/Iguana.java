package record;

  
// //  this record not valid
//  public record Iguana(int age) {
//    private static final int age = 10; }
 
// //    this line is valid
// public final record Gecko() {}
 
// // this is not vaid because of abstract
// public abstract record Chameleon()  {
//    private static String name; }
 
// //    this not valid @Override
// public record BeardedDragon(boolean fun) {
//    @Override public boolean fun() { return false; } }
 
// public record Newt(long size) {
//    @Override public boolean equals(Object obj) { return false; }
//    public void setSize(long size) {
//       this.size = size;
//    } 
   
// }
    

// Record rule	                         Remember
// Record components	           Automatically create private final fields
// Duplicate component field	       Not allowed
// Abstract record	                   Not allowed
// Final record	                        Allowed
// Static fields	                     Allowed
// Change component value	           Not allowed
// Custom accessor	                        Allowed
// Custom equals()	                        Allowed