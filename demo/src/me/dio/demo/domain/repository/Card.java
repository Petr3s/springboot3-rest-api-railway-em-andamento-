package me.dio.demo.domain.repository;
import jakarta.persistence.*;
@Entity(name = "tb_card")
public class Card {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    private double limit;
    private double availableLimit;
    private String brand;

    public Card() {}

    public Card(String number, double limit, double availableLimit, String brand) {
        this.number = number;
        this.limit = limit;
        this.availableLimit = availableLimit;
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(double availableLimit) {
        this.availableLimit = availableLimit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", limit=" + limit +
                ", availableLimit=" + availableLimit +
                ", brand='" + brand + '\'' +
                '}';
    }
}