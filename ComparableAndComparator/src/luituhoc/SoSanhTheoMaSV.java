package luituhoc;

import java.util.Comparator;

class SoSanhTheoMaSV implements Comparator<SinhVien> {

	public int compare(SinhVien sv1, SinhVien sv2) {
		return sv1.getMaSV().compareTo(sv2.getMaSV());
	}
}
