public class MyDate{
	private int year;
	private int month;
	private int day;
	private String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	private String[] strDays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	private int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year){
		if(year%400=0){
			return true;
			}
		}
	
	public boolean isValidDate(int day, int month, int year){
		if()
		}
	}
	
	public int getDayOfWeek(int year, int month, int day){
		
		}
	
	public MyDate(int year, int month, int day){
		setDate(year, monthn, day);
		}
	
	public void setDate(int year, int month, int day){
		if(isValidDate(year,month,day)){
			this.year = year;
			this.month = month;
			this.day = day;
			}
		else{
			throw new IllegalArgumentException("Invalid year, month, or day!");
		}	
		
	}
	
	public void setYear(int year){
		if(0<year<2000){
			this.year = year;
			}
			else{
				throw new IllegalArgumentException("Invalid Year");
				}
		}
		
	public void setMonth(int month){
		if(0<month<13){
			this.month = month;
			}
		else{
			throw new IllegalArgumentException("Invalid Month");
			}
		}
	
	public void setDay(int day){
		
		}
