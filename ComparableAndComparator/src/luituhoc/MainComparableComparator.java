package luituhoc;

import java.util.Arrays;

public class MainComparableComparator {

	public static void main(String[] args) {
System.out.println("=== INTERFACE THỰC TẾ: COMPARABLE VÀ COMPARATOR ===\n");
        
        SinhVien[] danhSachSV = {
            new SinhVien("SV003", "Nguyễn Văn A", 7.5),
            new SinhVien("SV001", "Trần Thị B", 8.2),
            new SinhVien("SV002", "Lê Văn C", 6.8),
            new SinhVien("SV004", "Phạm Thị D", 9.1)
        };
        
        System.out.println("Danh sách sinh viên ban đầu:");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
        
        // Sắp xếp theo Comparable (điểm TB giảm dần)
        Arrays.sort(danhSachSV);
        System.out.println("\nSắp xếp theo điểm TB (giảm dần):");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
        
        // Sắp xếp theo Comparator (mã SV)
        Arrays.sort(danhSachSV, new SoSanhTheoMaSV());
        System.out.println("\nSắp xếp theo mã SV:");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
        
        // Sắp xếp theo Comparator (tên)
        Arrays.sort(danhSachSV, new SoSanhTheoTen());
        System.out.println("\nSắp xếp theo tên:");
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }
        
        // Sử dụng Lambda Expression với Comparator (Java 8+)
        System.out.println("\nSắp xếp theo điểm TB (tăng dần) dùng Lambda:");
        Arrays.sort(danhSachSV, (sv1, sv2) -> Double.compare(sv1.getDiemTB(), sv2.getDiemTB()));
        for (SinhVien sv : danhSachSV) {
            System.out.println(sv);
        }

	}

}
