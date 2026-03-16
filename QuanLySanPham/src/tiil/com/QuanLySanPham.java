package tiil.com;

import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {
	private List<SanPham> danhSachSP;

	public QuanLySanPham() {
		danhSachSP = new ArrayList<>();
	}

	// thêm sản phẩm nè - add()
	public void themSP(SanPham sp) {
		danhSachSP.add(sp);
		System.out.println("Sản Phẩm đã thêm : " + sp.getTenSP());
	}

}
