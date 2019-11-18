package hw_12.task_6;

import java.util.Objects;

public class Sportsman implements Comparable<Sportsman> {
    private double speed;
    private String name;
    private Medal medal;

    public Sportsman(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public Sportsman(String name, double speed, Medal medal) {
        this.name = name;
        this.speed = speed;
        this.medal = medal;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Medal getMedal() {
        return medal;
    }

    public void setMedal(Medal medal) {
        this.medal = medal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsman sportsman = (Sportsman) o;
        return Double.compare(sportsman.speed, speed) == 0 &&
                Objects.equals(name, sportsman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, name);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Sportsman sportsman) {
        return (int) (-this.speed + sportsman.getSpeed());
    }
}
