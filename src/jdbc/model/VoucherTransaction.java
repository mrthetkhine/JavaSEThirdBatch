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
public class VoucherTransaction {
    Long id;
    Long voucherId;
    Long stockId;
    Double quantity;

    String stockName;
    Double price;
    
    public VoucherTransaction()
    {
    }
    public VoucherTransaction(Long id, Long voucherId, Long stockId, Double quantity) {
        this.id = id;
        this.voucherId = voucherId;
        this.stockId = stockId;
        this.quantity = quantity;
    }

    
    public VoucherTransaction(Long voucherId, Long stockId, Double quantity)
    {
        this.voucherId = voucherId;
        this.stockId = stockId;
        this.quantity = quantity;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(Long voucherId) {
        this.voucherId = voucherId;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "VoucherTransaction{" + "id=" + id + ", voucherId=" + voucherId + ", stockId=" + stockId + ", quantity=" + quantity + '}';
    }
    
    
}
