package Bai3;

public class HangHoa
{
    private String maHang;
    private String tenHang;
    private float donGia;
    private int soLuong;

    public HangHoa()
    {
    }

    public HangHoa(String maHang, String tenHang, float donGia, int soLuong)
    {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang()
    {
        return maHang;
    }

    public void setMaHang(String maHang)
    {
        this.maHang = maHang;
    }

    public String getTenHang()
    {
        return tenHang;
    }

    public void setTenHang(String tenHang)
    {
        this.tenHang = tenHang;
    }

    public float getDonGia()
    {
        return donGia;
    }

    public void setDonGia(float donGia)
    {
        this.donGia = donGia;
    }

    public int getSoLuong()
    {
        return soLuong;
    }

    public void setSoLuong(int soLuong)
    {
        this.soLuong = soLuong;
    }
    public void Xuat()
    {
        System.out.println("\t\tTHONG TIN HANG HOA");
        System.out.println("\nMa hang: "+maHang
                            +"\nTen hang: "+tenHang
                            +"\nDon gia: "+donGia
                            +"\nSo luong: "+soLuong
                            +"\nThanh tien: "+(donGia*soLuong));
    }
}
