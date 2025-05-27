package prototype.registry;

import java.util.HashMap;
import java.util.Map;

import prototype.shapes.Circle;
import prototype.shapes.Rectangle;
import prototype.shapes.Shape;

public class ShapeRegistry {
    Map<String, Shape> registryMap = new HashMap<>();

    public ShapeRegistry() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 10;
        circle.radius = 45;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 15;
        rectangle.breadth = 100;
        rectangle.length = 75;
        rectangle.color = "blue";

        registryMap.put("blue rectangle", rectangle);
        registryMap.put("red circle", circle);
    }

    public Shape put(String key, Shape shape) {
       return registryMap.put(key, shape);
    }

    public Shape get(String key) {
        return registryMap.get(key).clone();
    }
}
