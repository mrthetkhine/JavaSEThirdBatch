/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.model;

/**
 *
 * @author thetkhine
 */
public class Stock {
    Long id;
    String name;
    Double price;
    Double quanity;

    public Stock(Long id, String name, Double price, Double quanity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuanity() {
        return quanity;
    }

    public void setQuanity(Double quanity) {
        this.quanity = quanity;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", name=" + name + ", price=" + price + ", quanity=" + quanity + '}';
    }
    
    
            
}
