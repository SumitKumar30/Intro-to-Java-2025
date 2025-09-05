class Circle{
    // declare and define class state and behavior
    private double radius;          // class variable
    private String color;          // class variable

    // define a default constructor
    Circle() {
      radius = 0.0; // initializing radius to 0.0
      color = "blue"; // initializing color to blue
    }

    // parameterized constructor
    // Circle(double r, String c) {
    //     radius = r;
    //     color = c;
    // }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    
    // define some behaviors
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String rotateCircle(){
        return "Rotating the circle";
    }

    public String createSound(){
        return "Circle makes a sound";
    }

    // add setters for class variables
    public void setRadius(double r) {
        this.radius = r;
    }

    public void setColor(String c) {
        this.color = c;
    }

    // add getters for class variables
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();      
        
        System.out.println("Class variable radius: " + circle.radius);
        System.out.println("Class variable color: " + circle.color);

        // print the values inside the circle class using its reference variable
        System.out.println("circle object contains these values:"+circle);

        Circle circle3 = new Circle(10.0, "red");
        System.out.println("Circle3 radius: " + circle3.radius);


        Circle circle2 = circle;

        circle = null;
        
        circle2.radius = 5.0; // setting the radius

        System.out.println("Value of radius: " + circle2.radius);

        // call to class behaviors
        System.out.println("Area of circle: " + circle2.getArea());
        System.out.println(circle2.rotateCircle());
        System.out.println(circle2.createSound());

        circle2 = null; // dereferencing the object

        // updating the circle3 object values using setters 
        circle3.setRadius(25);
        circle3.setColor("green");

        // printing the updated values using getters
        System.out.println("Circle3 radius: " + circle3.getRadius());
        System.out.println("Circle3 color: " + circle3.getColor());
    }
}