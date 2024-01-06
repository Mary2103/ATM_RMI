
import java.util.*;
import java.rmi.*;
import java.sql.Timestamp;

public interface ITinhToan extends Remote {

    public boolean ktsotaikhoan(String tk) throws RemoteException;

    public boolean ktDangNhap(String tk, String password) throws RemoteException;

    public long getSoDu(String sotaikhoan) throws RemoteException;

    public String getHoTen(String sotaikhoan) throws RemoteException;

    public String getSdt(String sotaikhoan) throws RemoteException;

    public int DoiMatKhau(String newpass, String tk) throws RemoteException;

    public boolean RutTien(long sotienrut, String tk) throws RemoteException;

    public boolean NapTien(long sotiennap, String stk) throws RemoteException;

    public boolean ChuyenTien(String tk1, String tk2, long sotienchuyen) throws RemoteException;

    public long tongtien(String stk) throws RemoteException;

    public ArrayList GetLichSu(String stk) throws RemoteException;

    public int GetTrangThai(String un) throws RemoteException;

    public int SetTrangThai(String tk, int tt) throws RemoteException;
}
