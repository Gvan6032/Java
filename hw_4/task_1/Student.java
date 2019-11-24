package hw_4.task_1;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private static String text = "Hello from static"; // static поля идут раньше других

    // пустая строка не нужна
    public Student() {
        // this("Nick", 21);
        name = "Nick"; // через вызов другого конструктора
        age = 21; // через вызов другого конструктора
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void Show() {
        System.out.println("Name and age: " + name + " " + age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getText() {
        return text;
    }

    // this.text - это компилируется, но некорректно. text - static поле, соот-но Student.text=text;
    public void setText(String text) {
        this.text = text;
    }

}
