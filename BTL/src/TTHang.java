import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TTHang {
    private String loaiMP;
    private String tenMP;
    private String mauMP;
    private double khoiLuong;
    private int soLuong;
    private double giaNhap;

    public void Input()
    {
        try {
            FileInputStream file = new FileInputStream("C:/Java/BTL/KhoHang.txt");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
