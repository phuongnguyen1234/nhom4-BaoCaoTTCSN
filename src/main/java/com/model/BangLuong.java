package com.model;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class BangLuong {
    private String maBangLuong;
    private String maNhanVien;
    private YearMonth thang;
    private int soNgayCong;
    private int soNgayNghiCoCong;
    private int soNgayNghiKhongCong;
    private int soGioLamThem;
    private int soLuongDonDaTao;
    private int thuongDoanhThu;
    private int luongThucNhan;
    private String ghiChu;
    private String duocPhepChinhSua;

    public BangLuong(){}

    public BangLuong(String maBangLuong, String maNhanVien, YearMonth thang, int soNgayCong,
    int soNgayNghiCoCong, int soNgayNghiKhongCong, int soGioLamThem, int soLuongDonDaTao, int thuongDoanhThu,
    int luongThucNhan, String ghiChu, String duocPhepChinhSua) {
        this.maBangLuong = maBangLuong;
        this.maNhanVien = maNhanVien;
        this.thang = thang;
        this.soNgayCong = soNgayCong;
        this.soNgayNghiCoCong = soNgayNghiCoCong;
        this.soNgayNghiKhongCong = soNgayNghiKhongCong;
        this.soGioLamThem = soGioLamThem;
        this.soLuongDonDaTao = soLuongDonDaTao;
        this.thuongDoanhThu = thuongDoanhThu;
        this.luongThucNhan = luongThucNhan;
        this.ghiChu = ghiChu;
        this.duocPhepChinhSua = duocPhepChinhSua;
    }

    public String getMaBangLuong() {
        return maBangLuong;
    }
    
    public void setMaBangLuong(String maBangLuong) {
        this.maBangLuong = maBangLuong;
    }
    
    public String getMaNhanVien() {
        return maNhanVien;
    }
    
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
    public YearMonth getThang() {
        return thang;
    }
    
    public void setThang(YearMonth thang) {
        this.thang = thang;
    }
    
    public int getSoNgayCong() {
        return soNgayCong;
    }
    
    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
    
    public int getSoNgayNghiCoCong() {
        return soNgayNghiCoCong;
    }
    
    public void setSoNgayNghiCoCong(int soNgayNghiCoCong) {
        this.soNgayNghiCoCong = soNgayNghiCoCong;
    }
    
    public int getSoNgayNghiKhongCong() {
        return soNgayNghiKhongCong;
    }
    
    public void setSoNgayNghiKhongCong(int soNgayNghiKhongCong) {
        this.soNgayNghiKhongCong = soNgayNghiKhongCong;
    }
    
    public int getSoGioLamThem() {
        return soGioLamThem;
    }
    
    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoLuongDonDaTao() {
        return soLuongDonDaTao;
    }

    public void setSoLuongDonDaTao(int soLuongDonDaTao) {
        this.soLuongDonDaTao = soLuongDonDaTao;
    }
    
    public int getThuongDoanhThu() {
        return thuongDoanhThu;
    }
    
    public void setThuongDoanhThu(int thuongDoanhThu) {
        this.thuongDoanhThu = thuongDoanhThu;
    }
    
    public int getLuongThucNhan() {
        return luongThucNhan;
    }
    
    public void setLuongThucNhan(int luongThucNhan) {
        this.luongThucNhan = luongThucNhan;
    }
    
    public String getGhiChu() {
        return ghiChu;
    }
    
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public String getDuocPhepChinhSua() {
        return duocPhepChinhSua;
    }
    
    public void setDuocPhepChinhSua(String duocPhepChinhSua) {
        this.duocPhepChinhSua = duocPhepChinhSua;
    }

    public YearMonth dateSQLToYearMonth(String dateSQL) {
        String[] parts = dateSQL.split("-");
        return YearMonth.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }

    public String yearMonthToDateSQL(YearMonth yearMonth) {
        String formattedDate = yearMonth.atDay(1).format(DateTimeFormatter.ISO_LOCAL_DATE);
        return formattedDate;
    }
}
