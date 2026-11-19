package functionalinterface;// Functional Interface


@FunctionalInterface 
public interface MyInterface {
    
// one SAM - single abstract method
    void myShow();


   default void method1(){}

   static void method2(){}
        
}