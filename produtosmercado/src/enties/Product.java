package enties;

import java.time.LocalDate;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;
    private LocalDate date = LocalDate.now();

    public Product(String name, Double price, Integer quantity, LocalDate date) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}