public interface Shape {
   void draw();
}


public class Rectangle implements Shape {


   public void draw() {
      System.out.println("Inside Rectangle:draw() ");
   }
}

public class Square implements Shape {


   public void draw() {
      System.out.println("Inside Square:draw()");
   }
}

public class ShapeFactory {

   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();

      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();

      }

      return null;
   }
}



public class FactoryPatternclient {

   public static void main(String[] args) {
      ShapeFactory shapeFactory = new ShapeFactory();

      Shape shape1 = shapeFactory.getShape("CIRCLE");


      shape1.draw();


      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      shape2.draw();

   }
}
