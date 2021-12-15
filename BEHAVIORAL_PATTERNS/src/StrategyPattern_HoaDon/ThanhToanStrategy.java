package StrategyPattern_HoaDon;

import java.util.Date;
import java.util.List;

public interface ThanhToanStrategy {
    public long totalPrice(List<Product> items);
}
