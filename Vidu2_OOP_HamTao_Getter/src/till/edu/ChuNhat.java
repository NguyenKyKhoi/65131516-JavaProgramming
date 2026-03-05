package till.edu;

public class ChuNhat {
	private double dai;
	private double rong;

	public ChuNhat() {
		dai = 10;
		rong = 5;
	}

	public ChuNhat(double dai, double rong) {
		this.dai = dai;
		this.rong = rong;
	}

	// getter
	double getDai() {
		return dai;
	}

	double getRong() {
		return rong;
	}

	// setter
	void setDai(double daiM) {
		dai = daiM;
	}

	void setRong(double rongM) {
		rong = rongM;
	}

//	void setDai(double dai) { 
//		this.dai = dai; 
//	}
//	
//	void setRong(double rong) {
//		this.rong = rong;
//	}

}
