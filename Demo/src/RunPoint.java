
public class RunPoint {

	public static void main(String[] args) {
		
		//EntryPoint ep = new EntryPoint();
		ChildPoint cp = new ChildPoint();
		
		cp.comment = "Bla";
		cp.level = 99;
		cp.printAll();
		
		cp.InitEntryPoint();
		cp.printAll();
		
		cp.setCall(6);
		cp.printAll();
		
	}

}
