package hw_10.task_3;

    // +
public class BMW implements Auto {
    private String color;
    private String model;
    private String engine;

    public BMW(String model, String color, String engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void infoAuto() {
        String color = getColor();
        String model = getModel();
        String engine = getEngine();
        System.out.println("Main info: " + model + " " + engine + " " + color);
    }

    @Override
    public String toString() {
        return "BMW" + " " + color + " model " + model;
    }
}
