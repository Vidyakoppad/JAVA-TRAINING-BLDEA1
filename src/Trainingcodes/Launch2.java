package Trainingcodes;
class cat{
	
	private String name;
	private String color;
	private int cost;
	
	void setData(String name,String color,int cost) {
		name = name;
		color = color;
		cost = cost;
			
	}
	void getData() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);

	}
}
public class Launch2 {

	public static void main(String[] args) {
		cat d1=new cat();
	
		
		d1.setData("Blacky","black", 5000);
		d1.getData();
	}

}

