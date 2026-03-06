public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super(); 
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    @Override
    public double perimeter() { 
        return a + b + c;
    }

    @Override
    public double area() { 
        double s = perimeter() / 2.0; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
                a, b, c, getColor(), area(), perimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle other = (Triangle) obj;
            return this.a == other.a && 
                   this.b == other.b && 
                   this.c == other.c && 
                   this.getColor().equals(other.getColor());
        }
        return false;
    }
}