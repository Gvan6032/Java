package spring;

public class Dog {
    private String name;
    private String kind;

    public Dog(){
        name="Marc";
        kind = "Dingo";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
