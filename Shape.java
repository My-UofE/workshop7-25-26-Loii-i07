public abstract class Shape{

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this.color = "red";
    }

    public String getColor() {
        return color;
    }

    public abstract double area();
    public abstract double perimeter();
}