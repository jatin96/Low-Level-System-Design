package prototype;

import prototype.registry.ShapeRegistry;
import prototype.shapes.Shape;

public class Client {
    public static void main(String args[]) {
       ShapeRegistry registry = new ShapeRegistry();
       
       Shape shape1 = registry.get("blue rectangle");
       Shape shape2 = registry.get("red circle");
       Shape shape3 = registry.get("red circle");

       if (shape1 != shape2 && !shape1.equals(shape2)) {
        System.out.println("PASSED: red circle is not equal to blue rectangle");
       }

       if (shape2 != shape3 && shape2.equals(shape3)) {
        System.out.println("PASSED: red circles are different objects with same values");
       }
    }
}
