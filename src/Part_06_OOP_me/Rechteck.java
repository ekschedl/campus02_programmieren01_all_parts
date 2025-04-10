public class Rechteck {
    private double width;
    private  double height;

    public Rechteck(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getAria() {
        return width * height;
    }
    public double getParamiter() {
        return 2*(width + height);
    }
}

