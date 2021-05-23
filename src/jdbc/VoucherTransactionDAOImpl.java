/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import jdbc.model.Voucher;
import jdbc.model.VoucherTransaction;

/**
 *
 * @author thetkhine
 */
public class VoucherTransactionDAOImpl implements VocherTransactionDAO{

    @Override
    public List<VoucherTransaction> getAllTransaction() {
        List<VoucherTransaction> transactions = new ArrayList<>();
        try {
            Statement st = DAO.getDAO().getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM voucher_transaction");
            
            while(result.next())
            {
                Long id = result.getLong("Id");
                Long voucherId= result.getLong("voucher_id");
                Long stockId = result.getLong("stock_id");
                Double quantity = result.getDouble("quantity");
                
                VoucherTransaction tran = new VoucherTransaction(id,voucherId,stockId,quantity);
                
                transactions.add(tran);
                
            }
            result.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return transactions;
    }

    @Override
    public VoucherTransaction saveTransaction(VoucherTransaction tran) {
        try {
            PreparedStatement st = DAO.getDAO().getConnection().prepareStatement("INSERT INTO voucher_transaction(voucher_id,stock_id,quantity) VALUES(?,?,?);",
                    Statement.RETURN_GENERATED_KEYS);
            st.setLong(1, tran.getVoucherId());
            st.setLong(2, tran.getStockId());
            st.setDouble(3, tran.getQuantity());
            st.executeUpdate();
            
            ResultSet rs= st.getGeneratedKeys();
	    if(rs.next()){
                tran.setId(rs.getLong(1));
	    }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return tran;
    }
    public static void main(String[] args) {
        VocherTransactionDAO dao = new VoucherTransactionDAOImpl();
        
        VoucherTransaction tran1 = new VoucherTransaction(2L, 1L, 5.0);
        VoucherTransaction tran2 = new VoucherTransaction(2L, 4L, 10.0);
        VoucherTransaction tran3 = new VoucherTransaction(2L, 6L, 12.0);
        
        dao.saveTransaction(tran1);
        dao.saveTransaction(tran2);
        dao.saveTransaction(tran3);
        
        List<VoucherTransaction> transactions = dao.getAllTransaction();
        for(VoucherTransaction tran : transactions)
        {
            System.out.println(tran);
        }
    }
}
