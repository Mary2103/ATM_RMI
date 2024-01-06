
import java.util.*;
import javax.swing.table.*;

public class NapBang {

    public static DefaultTableModel NapDuLieuVaoBang(ArrayList ds, int socot) {
        try {
            int SoCot = 4;//masv, hoten va Dtb
            DefaultTableModel m = new DefaultTableModel(0, SoCot);

            String[] ColName = {"Mã chi tiết", "Ngày giao dịch", "Số tiền giao dịch", "Ghi Chú"};

            m.setColumnIdentifiers(ColName);
            Object[] t = new Object[socot];
            for (int i = 0; i < ds.size(); i++) {
                LichSuGiaoDich ls = (LichSuGiaoDich) ds.get(i);
                t[0] = ls.MaCT;
                t[1] = String.valueOf(ls.NgayGiaoDich);
                t[2] = String.valueOf(ls.SoTienGiaoDich);
                t[3] = ls.GhiChu;
                m.addRow(t);
            }
            return m;
        } catch (Exception tt) {
            System.out.print("Loi roi" + tt);
            return null;
        }
    }

}
