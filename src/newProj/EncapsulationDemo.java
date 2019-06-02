package newProj;
/*
 * Encapsulation -> Binding data with method 
 * its used fo making data private and secure and helps to keep logs of any user activity 
 * methods which are genrally employed are getter and setter 
 * getter is for geting the value of fetching the value from class 
 * setter is for setting the value to the variable 
 * Its general practice to access variable through method
 * In eclips its pretty easyEc;ips will set setter and getter for you 
 */
class Stud1{
	private int StudNo;
	private String StudName;
	
	// to generate this code you need to hit alt+shift+s and needs to select genral getter and setter option
	public int getStudNo() {
		return StudNo;
	}
	public void setStudNo(int studNo) {
		StudNo = studNo;
		System.out.println("User is tring to change variable");
		// such type of data log can be maintained which is not possible without method
	}
	public String getStudName() {
		
		System.out.println("User is trying to access the data");
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	
	
}
public class EncapsulationDemo {
	public static void main (String [] args) {
		
		Stud1 obj = new Stud1();
		obj.setStudNo(2);
		System.out.println(obj.getStudNo());
		obj.setStudName("Parikshit");
		System.out.println(obj.getStudName());
		
		
	}

}
