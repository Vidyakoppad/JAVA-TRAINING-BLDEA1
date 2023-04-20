package ShoppingCart;

import java.util.ArrayList;  
import java.util.Scanner;
public class ShoppingCart 
{
	ArrayList<String> PName = new ArrayList<String>();
	ArrayList<String> PCode = new ArrayList<String>();
	ArrayList<Double> Price = new ArrayList<Double>();
	ArrayList<Integer> Quantity = new ArrayList<Integer>();
	ArrayList<Double> Total_Price = new ArrayList<Double>();
	double totalbill=0.0;
	Scanner ip=new Scanner(System.in);
	static ShoppingCart obj=new ShoppingCart();
	void start()
	{
		System.out.println("*****");
		System.out.println("!!!------------------------------Welcome to More Market-------------------------------!!!");
		System.out.println("*****");
		System.out.println(" If you want see our list of items please type 1");
		int sc=ip.nextInt();
		if(sc==1)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.start();
		}
			
	}
	double bill(double totalbill)
	{
		double dis=0.0;
		if(totalbill>=1000)
		{
			dis=0.05*totalbill;
		}
		return dis;
	}
	void com_method(double total,String PN,String PC,double P,int Q)
	{
		System.out.println(" press 1 for continue shopping");
		System.out.println(" press 2 for stop here and get bill");
		System.out.println(" Press 3 for Exit");
		int press=ip.nextInt();
		if(press==1)
		{
			totalbill=totalbill+total;
			obj.callall(PN,PC,P,Q,total);
			obj.meth1();
		}
		else if(press==2)
		{
			totalbill=totalbill+total;
			obj.callall(PN,PC,P,Q,total);
			System.out.print(" Enter your Name: ");
			ip.nextLine();
			String name=ip.nextLine();
			System.out.print(" Enter your Address: ");
			String add=ip.nextLine();
			String ph="";
			int i=1;
			while(i==1)
			{
				System.out.print(" Enter your Contact No: ");
				String phone=ip.next();
				if(phone.length()==10)
				{
					ph=ph+phone;
					i=0;
				}
				else
				{
					System.out.println(" Please check and enter valid number");
					i=1;
					
				}
				System.out.println();
			}
			obj.meth4(name,add,ph);
		}
		else if(press==3)
		{
			System.out.println();
			obj.meth3(5);
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.com_method(total,PN,PC,P,Q);
		}
	}
	void meth1()
	{
		System.out.println();
		System.out.println(" 1) Mobiles");
		System.out.println(" 2) Laptops");
		System.out.println(" 3) Cosmetics");
		System.out.println(" 4) Groceries");
		System.out.println(" 5) Home Appliances");
		System.out.println(" 6) Exit");
		System.out.println("*****");
		System.out.println(" Please choose your option: ");
		int option=ip.nextInt();
		obj.meth2(option);
	}
	void meth2(int option)
	{
		if(option<=6)
		{
			System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
			int yes=ip.nextInt();
			if(yes==1)
			{
				obj.meth3(option);
			}
			else if(yes==2)
			{
				obj.meth1();
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option either 1 or 2 !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth2(option);
			}
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.meth1();
		}
	}
	void meth3(int option)
	{
		switch(option)
		{
		case 1:
			System.out.println();
			System.out.println(" 101  Redmi note 9---->1-------->RS.19990");
			System.out.println(" 102  Vivo v2020------>1-------->RS.18499");
			System.out.println(" 103  Oppo F19-------->1-------->RS.20199");
			System.out.println(" 104  OnePlus 9------->1-------->RS.39990");
			System.out.println(" 105  RealMe 6-------->1-------->RS.17990");
			System.out.println("*****");
			System.out.println(" Please choose your product code: ");
			int Mcode=ip.nextInt();
			if(Mcode==101)
			{
				obj.redmi(option);
			}
			else if(Mcode==102)
			{
				obj.vivo(option);
			}
			else if(Mcode==103)
			{
				obj.oppo(option);
			}
			else if(Mcode==104)
			{
				obj.oneplus(option);
			}
			else if(Mcode==105)
			{
				obj.realme(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 2:
			System.out.println();
			System.out.println(" 201  HP Pavilion------>1--------->RS.63500");
			System.out.println(" 202  HP Victus-------->1--------->RS.72500");
			System.out.println(" 203  Asus Tuff-------->1--------->RS.55600");
			System.out.println(" 204  Acer Predator---->1--------->RS.62500");
			System.out.println(" 205  Dell Vostor------>1--------->RS.65990");
			System.out.println("*****");
			System.out.println(" Please choose your product code: ");
			int lcode=ip.nextInt();
			if(lcode==201)
			{
				obj.hppav(option);
			}
			else if(lcode==202)
			{
				obj.hpvic(option);
				
			}
			else if(lcode==203)
			{
				obj.asus(option);
			}
			else if(lcode==204)
			{
				obj.acer(option);
			}
			else if(lcode==205)
			{
				obj.dell(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 3:
			System.out.println();
			System.out.println(" 301  Kajal----------->1------->RS.100");
			System.out.println(" 302  Lip Stick------->1------->RS.200");
			System.out.println(" 303  Nail Polish----->1------->RS.250");
			System.out.println(" 304  Face Powder----->1------->RS.150");
			System.out.println(" 305  Face Pack------->1------->RS.100");
			System.out.println("*****");
			System.out.println(" Please choose your product code: ");
			int Ccode=ip.nextInt();
			if(Ccode==301)
			{
				obj.Kajal(option);
			}
			else if(Ccode==302)
			{
				obj.Lip_Stick(option);
				
			}
			else if(Ccode==303)
			{
				obj.Nail_Poslish(option);
			}
			else if(Ccode==304)
			{
				obj.Face_Powder(option);
			}
			else if(Ccode==305)
			{
				obj.Face_Pack(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 4:
			System.out.println();
			System.out.println(" 401  Ariel Complete+--------->1Kg------->RS.200");
			System.out.println(" 402  Maggi FamilyPack------->1pck------->RS.125");
			System.out.println(" 403  Tata Turmaric------>1pck(100g)------->RS.60");
			System.out.println(" 404  Cardamom--------->1pck(100g)------->RS.290");
			System.out.println(" 405  Aashirvaad atta--------->1kg------->RS.70");
			System.out.println("*****");
			System.out.println(" Please choose your product code: ");
			int gcode=ip.nextInt();
			if(gcode==401)
			{
				obj.ariel(option);
			}
			else if(gcode==402)
			{
				obj.maggi(option);
				
			}
			else if(gcode==403)
			{
				obj.tata(option);
			}
			else if(gcode==404)
			{
				obj.card(option);
			}
			else if(gcode==405)
			{
				obj.atta(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 5:
			System.out.println();
			System.out.println(" 501  Blue Star AC--------->1------->RS.45900");
			System.out.println(" 502  Whirlpool Washing machine------->1------->RS.17900");
			System.out.println(" 503  LG Refrigerator------>1------->RS.20990");
			System.out.println(" 504  Sony Bravia Tv--------->1------->RS.57990");
			System.out.println(" 505  Usha Fan--------->1------->RS.2500");
			System.out.println("*****");
			System.out.println(" Please choose your product code: ");
			int hcode=ip.nextInt();
			if(hcode==501)
			{
				obj.air(option);
			}
			else if(hcode==502)
			{
				obj.wash(option);
				
			}
			else if(hcode==503)
			{
				obj.lg(option);
			}
			else if(hcode==504)
			{
				obj.sony(option);
			}
			else if(hcode==505)
			{
				obj.fan(option);
			}
			else
			{
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println(" You entered value is not there , choose correct option !!!");
				System.out.println("-----------------------------------------------------------------------------------------");
				System.out.println();
				obj.meth3(option);
			}
			break;
		case 6:
			totalbill=0.0;
			System.out.println();
			System.out.println(" Successfully Exited");
			System.out.println("#########################################################################################");
			System.out.println();
			System.out.println();
			obj.start();
		}
	}
	void redmi(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Redmi note 9           ";
		String PC="101";
		double P=19990;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.redmi(option);
		}
	}
	void vivo(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Vivo v2020           ";
		String PC="102";
		double P=18499;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.vivo(option);
		}
	}
	void oppo(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Oppo F19           ";
		String PC="103";
		double P=20199;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.oppo(option);
		}
	}
	void oneplus(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="OnePlus 9            ";
		String PC="104";
		double P=39990;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.oneplus(option);
		}
	}
	void realme(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="RealMe 6           ";
		String PC="105";
		double P=17990;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.realme(option);
		}
	}
	void hppav(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="HP Pavilion          ";
		String PC="201";
		double P=63500;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.hppav(option);
		}
	}
	void hpvic(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="HP Victus    ";
		String PC="202";
		double P=72500;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.hpvic(option);
		}
	}
	void asus(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Asus Tuff          ";
		String PC="203";
		double P=55600;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.asus(option);
		}
	}
	void acer(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Acer Predator        ";
		String PC="204";
		double P=62500;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.acer(option);
		}
	}
	void dell(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Dell Vostor           ";
		String PC="205";
		double P=65900;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.dell(option);
		}
	}
	void Kajal(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Kajal           ";
		String PC="301";
		double P=100;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Kajal(option);
		}
	}
	void Lip_Stick(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Lip Stick        ";
		String PC="302";
		double P=200;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Lip_Stick(option);
		}
	}
	void Nail_Poslish(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Nail Polish     ";
		String PC="303";
		double P=250;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Nail_Poslish(option);
		}
	}
	void Face_Powder(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Face Powder     ";
		String PC="304";
		double P=150;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Face_Powder(option);
		}
	}
	void Face_Pack(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Face Pack     ";
		String PC="305";
		double P=100;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.Face_Pack(option);
		}
	}
	void ariel(int option)
	{
		System.out.println("Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Ariel Complete+   ";
		String PC="401";
		double P=200;
		if(s==1)
		{
			System.out.println("How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.ariel(option);
		}
	}
	void maggi(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Turmeric Powder ";
		String PC="402";
		double P=125;
		if(s==1)
		{
			System.out.println("How many packets do yo need?");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.maggi(option);
		}
	}
	void tata(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Tata Turmaric";
		String PC="403";
		double P=60;
		if(s==1)
		{
			System.out.println("How many packets do yo need?");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.tata(option);
		}
	}
	void card(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Cardamom   ";
		String PC="404";
		double P=290;
		if(s==1)
		{
			System.out.println("How many packets do yo need?");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.card(option);
		}
	}
	void atta(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Aashirvaad atta           ";
		String PC="405";
		double P=70;
		if(s==1)
		{
			System.out.println(" How many kgs do yo need?");
			int Q=ip.nextInt();
			double total=Q*70;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.atta(option);
		}
	}
	void air(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Blue Star AC           ";
		String PC="501";
		double P=45900;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.air(option);
		}
	}
	void wash(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Whirlpool Washing machine           ";
		String PC="502";
		double P=17900;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.wash(option);
		}
	}
	void lg(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="LG Refrigerator           ";
		String PC="503";
		double P=20990;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there , choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.lg(option);
		}
	}
	void sony(int option)
	{
		System.out.println(" Are you sure !!!, if yes type 1, if not type 2");
		System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Sony Bravia Tv            ";
		String PC="504";
		double P=57990;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.sony(option);
		}
	}
	void fan(int option)
	{
		System.out.println(" Are you sure !!! , if yes type 1 , if not type 2");
        System.out.println(" If you want to see main list please type 3");
		int s=ip.nextInt();
		String PN="Usha Fan           ";
		String PC="505";
		double P=2500;
		if(s==1)
		{
			System.out.println("Quantity??");
			int Q=ip.nextInt();
			double total=Q*P;
			obj.com_method(total,PN,PC,P,Q);
		}
		else if(s==2)
		{
			obj.meth3(option);
		}
		else if(s==3)
		{
			obj.meth1();
		}
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there ,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.fan(option);
		}
	}
	void meth4(String name,String add,String phone)
	{
		System.out.println("*****");
		System.out.println("!!!------------------------------Welcome to More Market-------------------------------!!!");
		System.out.println("*****");
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(" S.No	 Product Name    	   Product Code       Quantity	    Price     Total Price");
		System.out.println(" ====	 =============    	   ============       ========      ======    ===========");
		for(int i=0;i<PName.size();i++)
		{
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("  "+(i+1)+"   	 "+PName.get(i)+"          "+PCode.get(i)+"		 "+Quantity.get(i)+"	    "+Price.get(i)+"    	 "+Total_Price.get(i));
			System.out.println("-----------------------------------------------------------------------------------------");
		}
		System.out.println();
		System.out.println(" Total bill of purchased items:  "+totalbill);
		double discount=obj.bill(totalbill);
		if(discount>0.0)
			System.out.println(" Hey "+name+" congtrats !!! you received a discount of 5%: "+discount);
		System.out.println(" Sorry "+name+" you are not received any discount...");
		System.out.println(" Your final final bill: "+(totalbill-discount));
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<---Thank you for shopping--->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("*****");
		System.out.println("Customer details:");
		System.out.println("----------------");
		System.out.println(" Name: "+name);
		System.out.println(" Address: "+add);
		System.out.println(" Phone: "+phone);
		System.out.println();
		System.out.println("*****");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("<<<<<-------------------* IF YOU WANT TO DO SHOPPING AGAIN *---------------->>>>>>>");
		System.out.println("-----------------------------------------------------------------------------------------");
		obj.meth5();
	}
	void meth5()
	{
		System.out.println("If yes press 1 or else press 2");
		int press=ip.nextInt();
		if(press==1)
			obj.meth1();
		else if(press==2)
		{	
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("#########################################################################################");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("<<<<<<<<<<,,,,,,,,,,,,,,,,,,,,Once again THANK YOU for Shopping,,,,,,,,,,,,,,,,,>>>>>>>>>");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println("#########################################################################################");
			System.out.println();
			System.out.println();
			System.out.println();
		}	
		else
		{
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println(" You entered value is not there,  choose correct option !!!");
			System.out.println("-----------------------------------------------------------------------------------------");
			System.out.println();
			obj.meth5();
		}
		ip.close();
	}
	void callall(String PN,String PC,double P,int Q,double total)
	{
		PName.add(PN);
		PCode.add(PC);
		Price.add(P);
		Quantity.add(Q);
		Total_Price.add(total);
	}
	public static void main(String[] args) 
	{
		obj.start();
	}
		
}