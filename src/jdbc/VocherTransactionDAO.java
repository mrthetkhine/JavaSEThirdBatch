/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.List;
import jdbc.model.VoucherTransaction;

/**
 *
 * @author thetkhine
 */
public interface VocherTransactionDAO {
    List<VoucherTransaction> getAllTransaction();
    VoucherTransaction saveTransaction(VoucherTransaction tran);
    
    List<VoucherTransaction> getTranscationByVoucherId(Long id);
}
