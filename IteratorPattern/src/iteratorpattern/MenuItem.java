/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratorpattern;

/**
 *
 * @author Administrator
 */
public class MenuItem {
    String tenMon;
    String moTa;
    boolean nguoiAnChay;
    double gia;

    public MenuItem(String tenMon, String moTa, boolean nguoiAnChay, double gia) {
        this.tenMon = tenMon;
        this.moTa = moTa;
        this.nguoiAnChay = nguoiAnChay;
        this.gia = gia;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getMoTa() {
        return moTa;
    }

    public boolean isNguoiAnChay() {
        return nguoiAnChay;
    }

    public double getGia() {
        return gia;
    }
    
    
}
