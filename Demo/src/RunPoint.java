
public class RunPoint {

	public static void main(String[] args) {
		
		System.out.println("Testing Git for lecture. Merge feature. Beep");
		System.out.println("Loading Branch Plan_BB. This is Batman approved.");
		
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
