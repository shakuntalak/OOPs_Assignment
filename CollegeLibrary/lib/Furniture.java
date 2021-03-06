package CollegeLibrary.lib;

public class Furniture {
	private String type;
	private String material;
	public static int countChair=0;
	public Furniture(String type, String material) {
		super();
		this.type = type;
		this.material = material;
		if(this.type=="chair")
				countChair++;
	}

	public void numberOfChair()
	{
		System.out.println(countChair);
	}
	
	

}
