package luituhoc;

import java.util.Comparator;

class SoSanhTheoTen implements Comparator<SinhVien> {
	@Override
	public int compare(SinhVien sv1, SinhVien sv2) {
		return sv1.getHoTen().compareTo(sv2.getHoTen());
	}
}
