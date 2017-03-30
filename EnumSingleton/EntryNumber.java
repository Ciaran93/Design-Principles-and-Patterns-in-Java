package EnumSingleton;

public enum EntryNumber {
	
	// Define the singletons
	INSTANCE, SECOND;
	
	private int count = 1000;
	
	public synchronized int getNextEntery(){
		return count++;
	}

}
