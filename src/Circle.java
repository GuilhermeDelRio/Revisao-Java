public class Circle {
    public double radius;
    public String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double raio) {
        return Math.PI * raio * raio;
    }
}
