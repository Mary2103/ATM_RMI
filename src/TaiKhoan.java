import java.io.*;

public class TaiKhoan implements Serializable{
    public String SoTaiKhoan;
    public String HoTen;
    public long SoDu;
    public String MatKhau;
    public String SDT;
    public boolean TrangThaiHoatDong;

    public TaiKhoan(String SoTaiKhoan, String HoTen, long SoDu, String MatKhau, String SDT, boolean TrangThaiHoatDong) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTen = HoTen;
        this.SoDu = SoDu;
        this.MatKhau = MatKhau;
        this.SDT = SDT;
        this.TrangThaiHoatDong = TrangThaiHoatDong;
    }
   
    
}