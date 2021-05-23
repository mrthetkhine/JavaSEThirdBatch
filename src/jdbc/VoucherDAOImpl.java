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
import jdbc.model.Stock;
import jdbc.model.Voucher;

/**
 *
 * @author thetkhine
 */
public class VoucherDAOImpl implements VoucherDAO {

    @Override
    public List<Voucher> getAllVouchers() {
        List<Voucher> vouchers = new ArrayList<>();
        try {
            Statement st = DAO.getDAO().getConnection().createStatement();
            ResultSet result = st.executeQuery("SELECT * FROM Voucher");
            
            while(result.next())
            {
                Long id = result.getLong("Id");
                Date date = result.getDate("date");
                
                Voucher voucher = new Voucher(id,date);
                
                vouchers.add(voucher);
                
            }
            result.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return vouchers;
    }

    @Override
    public Voucher saveVoucher(Voucher voucher) {
        try {
            PreparedStatement st = DAO.getDAO().getConnection().prepareStatement("INSERT INTO voucher(date) VALUES(?);",
                    Statement.RETURN_GENERATED_KEYS);
            st.setDate(1, new java.sql.Date(voucher.getDate().getTime()));
            st.executeUpdate();
            
            ResultSet rs= st.getGeneratedKeys();
	    if(rs.next()){
                voucher.setId(rs.getLong(1));
	    }
            rs.close();
            st.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return voucher;
    }
    public static void main(String[] args) {
        VoucherDAO dao = new VoucherDAOImpl();
        
        Voucher voucher = new Voucher(new Date());
        
        dao.saveVoucher(voucher);
        List<Voucher> vouchers = dao.getAllVouchers();
        for(Voucher v : vouchers)
        {
            System.out.println(v);
        }
    }
}
