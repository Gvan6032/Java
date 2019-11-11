package hw_10.task_1;

public class Generic<T> {
    private T id;

    public Generic() {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void getClass(T id) {
        System.out.println("Class of generic: " + id.getClass().getName());
    }
}
