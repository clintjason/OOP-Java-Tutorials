public class TestMyTime{
	public static void main(String[] args){
		try{
			MyTime t1 = new MyTime(1,10,30);
			}
		catch(IllegalArgumentException e){
			System.out.printf("Exception %s\n\n", e.getMessage());
			}
		System.out.println(t1);
		try{
			t1.setTime(10,45,58);
			}
		catch(IllegalArgumentException e){
			System.out.printf("Exception %s\n\n", e.getMessage());
			}
		System.out.println("Hour " + t1.getHour() + "\nMinute" + t1.getMinute() + "\nSecond " + t1.getSecond());
		try{
			t1.setHour(22);
			}	
		catch(IllegalArgumentException e){
			System.out.printf("Exception %s\n\n", e.getMessage());
			}
		try{
			t1.setMinute(59);
			}
		catch(IllegalArgumentException e){
			System.out.printf("Exception %s\n\n", e.getMessage());
			}
		try{
			t1.setSecond(59);
			}
		catch(IllegalArgumentException e){
			System.out.printf("Exception %s\n\n", e.getMessage());
			}
		System.out.println(t1.toString());
		
		System.out.println(t1.nextMinute());
		System.out.println(t1.nextHour());
		System.out.println(t1.nextSecond());
		System.out.println();
		
		System.out.println(t1.previousHour());
		System.out.println(t1.previousMinute());
		System.out.println(t1.previousSecond());
	}
}
