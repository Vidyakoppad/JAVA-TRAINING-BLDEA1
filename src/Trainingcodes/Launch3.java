package Trainingcodes;
class Horse{
	
	private String name;
	private String color;
	private int cost;
	
	void setData(String name,String color,int cost) {
		this.name = name;
		this.color = color;
		this.cost = cost;
			
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);

	}
}
public class Launch3 {

	public static void main(String[] args) {
		Horse d1=new Horse();
	
		
		d1.setData("Blacky","black", 5000);
		d1.getData();
	//	System.out.println(d1.name);

  
	}

}

