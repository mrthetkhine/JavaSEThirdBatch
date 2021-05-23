/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author thetkhine
 */
public class Voucher {
    Long id;
    Date date;

    List<VoucherTransaction> transactions = new ArrayList<VoucherTransaction>();
    public Voucher(Long id, Date date) {
        this.id = id;
        this.date = date;
    }

    public Voucher(Date date) {
        this.date = date;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<VoucherTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<VoucherTransaction> transactions) {
        this.transactions = transactions;
    }
    
    @Override
    public String toString() {
        return "Voucher{" + "id=" + id + ", date=" + date + '}';
    }
    
    
}
