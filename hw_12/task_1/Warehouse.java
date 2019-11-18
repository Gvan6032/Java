package hw_12.task_1;

import java.util.Objects;

public class Warehouse {
    private String productName;

    public Warehouse(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return Objects.equals(productName, warehouse.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "productName='" + productName + '\'' +
                '}';
    }
}
