package OOP;

public class Printer {
    private String color;
    private String mark;
    private double typeSpeed;
    private double paintVolume;

    public Printer(String color, String mark, double typeSpeed, double paintVolume) {
        this.color = color;
        this.mark = mark;
        this.typeSpeed = typeSpeed;
        this.paintVolume = paintVolume;
    }

    @Override
    public String toString() {
        return "color " + color + " \nmark " + mark + " \ntypeSpeed " + typeSpeed + " \npaintVolume " + paintVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getTypeSpeed() {
        return typeSpeed;
    }

    public void setTypeSpeed(double typeSpeed) {
        this.typeSpeed = typeSpeed;
    }

    public double getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(double paintVolume) {
        this.paintVolume = paintVolume;
    }
}
