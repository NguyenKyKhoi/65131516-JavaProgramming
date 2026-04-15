package luituhoc;

public class Computer {
	private String cpu;
	private int ram;
	private double dungLuongBoNho;
	private boolean batTat = false;

	public Computer(String cpu, int ram, double dungLuongBoNho, boolean batTat) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.dungLuongBoNho = dungLuongBoNho;
		this.batTat = batTat;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getDungLuongBoNho() {
		return dungLuongBoNho;
	}

	public void setDungLuongBoNho(double dungLuongBoNho) {
		this.dungLuongBoNho = dungLuongBoNho;
	}

	public boolean isBatTat() {
		return batTat;
	}

	public void setBatTat(boolean batTat) {
		this.batTat = batTat;
	}

	public void start() {
		if (!batTat) {
			batTat = true;
			System.out.println("Máy đã bật");
		} else {
			System.out.println("Máy đã bật sẵn !");
		}
	}

	public void shutDown() {
		if (batTat) {
			batTat = false;
			System.out.println("Máy đang tắt");
		} else {
			System.out.println("Máy đã tắt sẵn !");
		}
	}

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", dungLuongBoNho=" + dungLuongBoNho + ", batTat=" + batTat
				+ "]";
	}

}
