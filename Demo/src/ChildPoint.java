
public class ChildPoint extends EntryPoint{

	int getCall() {		
		return this.level;
	}

	void setCall(int level) {
		this.level = level;		
	}
	
	void setComment(String comm){
		this.comment = comm;
		System.out.println("No information here");
	}
	
	void printAll(){
		System.out.println("Updated InfoSet: "+ this.level + ", "+ this.comment + ", "+ this);
		System.out.println("================================================================");		
	}
	
	void addFeature_C(String Ch){
		char tmp = Ch.toCharArray()[0];
		System.out.println("String information: "+Ch + " saved.");
		
	}

}
