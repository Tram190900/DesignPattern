package StrategyPattern_HoaDon;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListHoaDon {
    ThanhToanStrategy thanhToan;
    String idHoaDon;
    Date ngayLap;
    List<Product> lstProduct;

    public ListHoaDon(String _id, Date _ngayLap) {
        lstProduct = new ArrayList<>();
        this.idHoaDon = _id;
        this.ngayLap = _ngayLap;
    }

    public void getPhuongThucThanhToan(ThanhToanStrategy _ThanhToanStrategy) {
        this.thanhToan = _ThanhToanStrategy;
    }

    public void addProduct(Product _product) {
        lstProduct.add(_product);
    }

    public void remove(Product _product) {
        lstProduct.remove(_product);
    }

    public long totalPrice() {
        return thanhToan.totalPrice(lstProduct);
    }
}
