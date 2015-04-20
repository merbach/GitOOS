
public abstract class EntryPoint {

	protected int level;
	protected String comment;
	private int key = 351;
	
	abstract int getCall();
	abstract void setCall(int level);
		
	/**
	 * Normalising the entry parameters
	 * @return	simple return set 0
	 */
	public int InitEntryPoint(){		
		if(level > 20){
			this.setCall(level%15);
		}else{
			this.level = this.getCall();
		}			
		return 0;
	}
	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		this.key = key;
	}
		

}
