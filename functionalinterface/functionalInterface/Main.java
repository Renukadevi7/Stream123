package functionalinterface.functionalInterface;


public class Main {

    public static void main(String[] args) {

//    **********1st Method creating FunctionalInterface with SAM creating 2 child class 1,Car and 2.Bike and implements same abstract method start()**********
//    Vehicle v = new Car();
//    v.start();
//
//    Vehicle v2 = new Bike();
//    v2.start();

//   ***********************2nd approach anonymous class*************************************
//    Vehicle v = new Vehicle() {
//        @Override
//        public void start() {
//            System.out.println("Car Engine Started");
//        }
//    };
//    v.start();
//
//    Vehicle v2 = new Vehicle() {
//        @Override
//        public void start() {
//            System.out.println("Bike Engine Started");
//        }
//
//    };
//    v2.start();


//  *****************************Lambda Expression approach ***************************
//        Vehicle v = () -> System.out.println("Car Engine Started");
//         v.start();

//        Vehicle v2 = () -> {
//            System.out.println("Bike Engine Started");
//        };
//        v2.start();

//        not args pass () lambda one sout we dont have to give {} and method should call
        Greeting g1 = () -> System.out.println("Hello Good Morning ");
        g1.greet();

//        if two or more sout we need to provide {} in lambda expression
        Task t1 = () -> {
            System.out.println("Task started");
            System.out.println("Task End");
        };
        t1.execute();


//      when we have 1 passing args in method we need to provide in this example number we should return number*number
//        its one args we dont need {} and last using reference s.methodName(args);
        Square s = number -> number * number;
         System.out.println(s.operate(5));


         Calculator c = (a, b) -> {

             int result = a + b;
             System.out.println("Result :: " + result);
             return result;

         };
          int finalResult = c.add(10 , 18);
          System.out.println("Final Results : " + finalResult);
    }
}

    



