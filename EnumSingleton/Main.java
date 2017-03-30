package EnumSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the cound of instance
		System.out.println(EntryNumber.INSTANCE.getNextEntery());
		System.out.println(EntryNumber.INSTANCE.getNextEntery());
		System.out.println(EntryNumber.INSTANCE.getNextEntery());
		
		//get the count from the second instance
		System.out.println(EntryNumber.SECOND.getNextEntery());
		System.out.println(EntryNumber.SECOND.getNextEntery());
	}

}
