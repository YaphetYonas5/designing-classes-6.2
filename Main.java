
 class Main {
 public static void main(String[] args) {
    // Create a Rectangle object
      Rectangle rectangle1 = new Rectangle();

      // Accessing class members
      rectangle1.set(4.2, 6.2);
      System.out.println("Area of Rectangle is "
                         + rectangle1.getArea());
      System.out.println("Perimeter of Rectangle is "
                         + rectangle1.getPerimeter());
  }

}