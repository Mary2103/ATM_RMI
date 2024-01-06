import java.io.*;
import java.util.Date;

public class LichSuGiaoDich implements Serializable{
    public int MaCT;
    public Date NgayGiaoDich;
    public long SoTienGiaoDich;
    public String GhiChu;
    public String SoTaiKhoan;

    public LichSuGiaoDich(int MaCT, Date NgayGiaoDich, long SoTienGiaoDich, String GhiChu, String SoTaiKhoan) {
        this.MaCT = MaCT;
        this.NgayGiaoDich = NgayGiaoDich;
        this.SoTienGiaoDich = SoTienGiaoDich;
        this.GhiChu = GhiChu;
        this.SoTaiKhoan = SoTaiKhoan;
    }
}