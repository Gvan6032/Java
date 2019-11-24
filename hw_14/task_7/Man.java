package hw_14.task_7;

import java.util.Objects;

public class Man {
    private Object name;
    private Object surname;
    private Object phoneNumber;

    public Man(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Man(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public Man(Object name, Object surname) {
        this.surname = surname;
        this.name = name;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return name.equals(man.name) &&
                surname.equals(man.surname) &&
                phoneNumber.equals(man.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, phoneNumber);
    }

    @Override
    public String toString() {
        return "Man{" +
                "name=" + name +
                ", surname=" + surname +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
