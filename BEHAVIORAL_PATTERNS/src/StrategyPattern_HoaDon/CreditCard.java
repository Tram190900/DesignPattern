package StrategyPattern_HoaDon;

import java.util.Date;
import java.util.List;

public class CreditCard implements ThanhToanStrategy{

    String soThe;
    String ten;
    String maBaoMat;
    Date ngayHetHan;

    public CreditCard(String _soThe, String _ten, String _maBaoMat, Date _ngayHetHan){
        this.soThe = _soThe;
        this.ten = _ten;
        this.maBaoMat = _maBaoMat;
        this.ngayHetHan = _ngayHetHan;
    }

    @Override
    public long totalPrice(List<Product> items) {
        long total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    

}