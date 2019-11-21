package hw_13.task_9;

import java.util.Objects;

public class Phone {
    private String manufacturer;
    private int year;

    public Phone(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return year == phone.year &&
                manufacturer.equals(phone.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, year);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}
