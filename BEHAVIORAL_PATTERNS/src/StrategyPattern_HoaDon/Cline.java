package StrategyPattern_HoaDon;

import java.util.Date;

public class Cline {
    public static void main(String[] args) {
        ListHoaDon lst = new ListHoaDon("HD01", new Date(2021,9, 23));
        lst.addProduct(new Product("P01", "A", 2000));
        lst.addProduct(new Product("P02", "B", 2000));
        lst.getPhuongThucThanhToan(new CreditCard("132434", "tram", "234234", new Date(2022, 3, 12)));

        System.out.println("Tong tien cua hoa don: "+lst.totalPrice());
    }
}
