package week1.day1;

public class Car {
    public void applyBreak() {
		System.out.println("If you have any speed break on road break applying");
		}
    public void applyGear() {
    	System.out.println("If you want to increasing the car speed to apply the gear in sequntional");
    		}
    public void switchOnAc() {
    	System.out.println("Indide the car to resduce the Temperature");
		}
   public void applyAcclerate() {
	   System.out.println("To insrease the car speed");
   }
    
	public static void main(String[] args) {
		Car grandI10=new Car();
		// TODO Auto-generated method stub
		grandI10.applyBreak();
		grandI10.applyGear();
		grandI10.applyAcclerate();
		
	}

}

