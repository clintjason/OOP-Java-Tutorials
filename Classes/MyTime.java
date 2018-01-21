public class MyTime{
		private int hour = 0;	//By default initialized to 0
		private int minute = 0;
		private int second = 0;
		
		public MyTime(int hour, int minute, int second){
			// validate hour, minute and second
			if ( ( hour >= 0 && hour < 24 ) && ( minute >= 0 && minute < 60 ) &&  ( second >= 0 && second < 60 ) ){
				this.hour = hour;
				this.minute = minute;
				this.second = second;
				}
			else{
				throw new IllegalArgumentException("hour, minute and/or second was out of range" );
				}	
			}
			
		public void setTime(int hour, int minute, int second){
			
			// validate hour, minute and second
			if ( ( hour >= 0 && hour < 24 ) && ( minute >= 0 && minute < 60 ) &&  ( second >= 0 && second < 60 ) ){
				this.hour = hour;
				this.minute = minute;
				this.second = second;
				}
			else{
				throw new IllegalArgumentException("hour, minute and/or second was out of range" );
				}			
			}
		
		public int getHour(){
			return hour;
			}
		
		public int getMinute(){
			return minute;
			}
		
		public int getSecond(){
			return second;
			}
		
		public void setHour(int hour){
			if(hour >= 0 && hour < 24){
				this.hour = hour;
				}
			else{
				throw new IllegalArgumentException("Hour is out of Range");
				}			
			}
		
		public void setMinute(int minute){
			if(minute >= 0 && minute < 60){
				this.minute = minute;
				}
			else{
				throw new IllegalArgumentException("Minute is out of Range");
				}	
			
			}
		
		public void setSecond(int second){
			if(second >= 0 && second < 60){
				this.second = second;
				}
			else{
				throw new IllegalArgumentException("Second is out of Range");
				}	
			
			}
		
		public String toString(){
			return hour + ":" + minute + ":" + second;
			}
		
		public MyTime nextSecond(){
			if(hour==23 && minute==59 && second==59){
				setTime(0,0,0);
				return new MyTime(hour,minute,second);
				}
			else if(second == 59){
				this.minute = minute + 1;
				setTime(hour, minute, 0);
				return new MyTime(hour,minute,second);
				}
			else{
				this.second = second + 1;
				return new MyTime(hour,minute,second);
				}			
			}
		
		public MyTime nextMinute(){
			if(minute == 59){
				this.hour = hour + 1;
				setTime(hour,0,second);
				return new MyTime(hour,minute,second);
				}
			else{
				this.minute = minute + 1;
				return new MyTime(hour,minute,second);
				}			
			}
		
		public MyTime nextHour(){
			if(hour == 23){
				setTime(0,0,0);
				return new MyTime(hour,minute,second);
				}
			else{
				this.hour = hour + 1;
				return new MyTime(hour,minute,second);
				}			
			}
		
		public MyTime previousSecond(){
			if(second==0){
				setTime(hour,minute,59);
				return new MyTime(hour,minute,second);
				}
			else{
				this.second = second - 1;
			    return new MyTime(hour,minute,second);
				}
			}
		
		public MyTime previousMinute(){
			if(minute==0){
				setTime(hour,59,second);
				return new MyTime(hour,minute,second);
				}
			else{
				this.minute = minute - 1;
			    return new MyTime(hour,minute,second);
				}			
			}
		
		public MyTime previousHour(){
			
			if(hour==0){				
				setTime(23,minute,second);
				return new MyTime(hour,minute,second);
				}
			else{
				this.hour = hour - 1;
				return new MyTime(hour,minute,second);
				}			
			}
}
