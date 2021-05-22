/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.List;
import jdbc.model.Stock;

/**
 *
 * @author thetkhine
 */
public interface StockDAO {
      Stock getById(Long id);  
      public List<Stock> getStocks();
      public Stock saveStock(Stock stock);
      public Stock updateStock(Stock stock);
      public Stock saveOrUpdate(Stock stock);
      boolean deleteStock(Long id);
}
