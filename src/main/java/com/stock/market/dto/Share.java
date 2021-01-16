package com.stock.market.dto;

/**
 * Created by mmuzichenko on 11/9/2017.
 */
public class Share {

    private String name;

    private double price;

    private double change;

    private double changePercent;

    public Share() {
    }

    public Share(String name, double price, double change, double changePercent) {
        this.name = name;
        this.price = price;
        this.change = change;
        this.changePercent = changePercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(double changePercent) {
        this.changePercent = changePercent;
    }

    @Override
    public String toString() {
        return "Share{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", change=" + change +
                ", changePercent=" + changePercent +
                '}';
    }
}
