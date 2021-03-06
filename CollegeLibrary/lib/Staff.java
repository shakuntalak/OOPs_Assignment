package CollegeLibrary.lib;

public class Staff {
	private int age;
	private String fname;
	private String lname;
	public static int countStaff=0;
	public static int eldestStaff=0;
	public static String fnameStaff;
	public static String lnameStaff;
	public Staff(int age, String fname, String lname) {
		super();
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		countStaff++;

		if(this.age>=eldestStaff) {
			eldestStaff = this.age;
			fnameStaff = this.fname;
			lnameStaff = this.lname;
		}
	}

	public void staffCount(){
		System.out.println(countStaff);
	}

	public void getEldestStaff()
	{
		System.out.println("Age : "+eldestStaff+"\nFirst Name: "+fnameStaff+"\nLast Name : "+lnameStaff);
	}
	

}
