public class Circle {
    float radius;
    String color;

    Circle (float radius, String color){
        this.radius = radius;
        this.color = color;
    }
    float getRadius(){
        return radius;
    }
    String getColor(){
        return color;
    }
    double getArea(){
        return 3.14*(this.radius*this.radius);
    }

    void printData(){
        System.out.print(radius+" "+color+" ");
        System.out.printf("%.4f \n",getArea());
    }

    public static void main(String[] args){
        Circle circle1 = new Circle(0.1f,"red");
        circle1.printData();
        Circle circle2 = new Circle(0.3f, "yellow");
        circle2.printData();
        Circle circle3 = new Circle(0.1f, "blue");
        circle3.printData();

    }
}
