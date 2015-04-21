
public class ChildPoint extends EntryPoint{

	int getCall() {		
		return this.level;
	}

	void maxCall(){
		this.level = 99;
	}
	
	void setCall(int level) {
		System.out.println("Set Level to: "+ level);
		// Commentary input
		this.level = level;		
	}
	
	void setComment(String comm){
		System.out.println("Set Comment to: "+ comm);
		// Commentary input
		this.comment = comm;
	}
	
	void printAll(){
		System.out.println("InfoSet: "+ this.level + ", "+ this.comment + ", "+ this);
	}

}
