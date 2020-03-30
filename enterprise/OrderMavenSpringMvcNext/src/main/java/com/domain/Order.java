package com.domain;

import java.util.Objects;

public class Order {
    private Integer id;
    private String title;
    private Double price;

    public Order(){
        this.id = 1;
        this.title = "Spring MVC";
        this.price = 45.21;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(getId(), order.getId()) &&
                Objects.equals(getTitle(), order.getTitle()) &&
                Objects.equals(getPrice(), order.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getPrice());
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
