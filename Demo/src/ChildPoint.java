
public class ChildPoint extends EntryPoint{

	int getCall() {		
		return this.level;
	}

	void setCall(int level) {
		this.level = level;		
	}
	
	void setComment(String comm){
		System.out.println("Set Comment to: "+ comm);
		this.comment = comm;
	}
	
	void printAll(){
		System.out.println("InfoSet: "+ this.level + ", "+ this.comment + ", "+ this);
	}

}
