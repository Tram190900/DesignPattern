package State_MayBanHang;

public class Demo {
	public static void main(String[] args) {
		Cline cline1 = new Cline();
		cline1.getState(new Oder());
		System.out.println(cline1.applyState());
		
		cline1.getState(new KhongDuTien());
		System.out.println(cline1.applyState());
	}
}
