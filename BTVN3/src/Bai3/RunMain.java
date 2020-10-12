package Bai3;

public class RunMain
{
    public static void main(String[] args)
    {
        HangHoa H1,H2 = new HangHoa();
        H1 = new HangHoa("H001","Bút bi",10,10);
        H1.Xuat();
        H2.setMaHang("H002");
        H2.setTenHang("Oto");
        H2.setDonGia(100);
        H2.setSoLuong(5);
        H2.Xuat();
    }
}
