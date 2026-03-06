public class Rectangle extends Shape { 
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        super();
        this.width = 1.0;
        this.height = 1.0;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width; 
    }

    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height; 
    }

    @Override
    public double perimeter() { 
        return 2 * (width + height);
    }

    @Override
    public double area() { 
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,height=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
                width, height, getColor(), area(), perimeter());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.width == other.width && 
                   this.height == other.height && 
                   this.getColor().equals(other.getColor());
        }
        return false;
    }
}