/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.List;
import jdbc.model.Voucher;

/**
 *
 * @author thetkhine
 */
public interface VoucherDAO {
    
    List<Voucher> getAllVouchers();
    public Voucher saveVoucher(Voucher voucher);
}
