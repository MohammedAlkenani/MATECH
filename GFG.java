import java.util.*;
class Home 
{

	public Home() {
	}
	public static void main(String[] args)
{
	
	Phone ph1=new Phone("IPhone 14 Pro","IOS 16 - 5G - 6.1-inch screen" , 6000 );
	Phone ph2=new Phone("IPhone 13 Pro","iOS 15, upgradable to iOS 16.3 - 5g - 6.0-inch screen" , 4000);
	Phone ph3=new Phone("IPhone 12 Pro","IOS 16 - 5G - 6.1-inch screen" , 3900);
	Phone ph4=new Phone("IPhone 11 Pro","IOS 16 - 5G - 6.1-inch screen" , 2700);

	Laptop lab5=new Laptop("Asus TUF Gaming" , " IntelCore i5 -16GB -RAM512 GB -NVMe -M.2 -SSDWindows -11NVIDIA -GeForce 4 GB" , 3800);
	Laptop lab6=new Laptop("MacBook Air "    , "13.3 -M1 -8GB RAM -256GB SSD -macOS Big Sur -7 Core GPU"                       , 5200);
    Laptop lab7=new Laptop("MacBook Pro 14"  , " -14.2 -M1 Pro -16GB RAM -512GB -macOS Monterey -14Core GPU"                   , 7000);


	Phone ph_list[]=new Phone[10];
	ph_list[0]=ph1;
	ph_list[1]=ph2;
	ph_list[2]=ph3;
	ph_list[4]=ph4;
	printMenu(ph_list);
	
	Laptop lab_list[]=new Laptop[10];
	lab_list[0]=lab5;
	lab_list[1]=lab6;
	lab_list[2]=lab7;
	printMenu(lab_list);
}

private static void printMenu(Phone[] ph_list) {
	}
private static void printMenu(Laptop[] lab_list) {
	}
/**
 * @param ph_list
 * @param lab_list
 */
public static void printMenu(Phone[] ph_list, Laptop lab_list[])
	{
	int index=1;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println(" ___________________________________________________MATECH ___________________________________________________  ");
		System.out.println(" _______________________ WELCOME TO MY SHOP _______________________ ");
		System.out.println(" _____________ HOME _____________ /n ");
		System.out.println(" _____________ Menu _____________ ");
		System.out.println("1-Show Avilable Phones and Laptops");
		System.out.println("2-Add New Phone or Laptop");
		System.out.println("3-Exit");

			int a= sc.nextInt();
			if(a==1){
					for(int i=0;i<ph_list.length;i++){
						if(ph_list[i]!=null){
							ph_list[i].PrintPhoneName(i);
						}
					}
					for(int i=0;i<lab_list.length;i++){
						if(lab_list[i]!=null){
							lab_list[i].PrintLaptopName(i);
						}
					}
					System.out.println("Enter Device number to view Details : ");
					int sp=sc.nextInt();
					ph_list[sp-1].PrintPhoneName(sp-1);
					ph_list[sp-1].getDetails();
					lab_list[sp-1].PrintLaptopName(sp-1);
					lab_list[sp-1].getdetailsLab();
					System.out.println("Enter 2 to buy Device (Add to Cart) -- 4 to exit : ");
					int buy= sc.nextInt();
					if(buy==2){
						System.out.println("Enter Card Number");
						String card=sc.next();
						System.out.println("Your Order Placed Successfully");
						printMenu(ph_list , lab_list);
					}
				}
				if(a==2){
						System.out.println("Enter Device Name");
						String Name=sc.next();
						System.out.println("Enter Device Details");
						String Details=sc.next();

						Phone ph=new Phone(Name,Details, a);
						ph_list[(index+1)]=ph;
						System.out.println("Your Device is Added Successfully");
						printMenu(ph_list , lab_list);
			}
	}
	}
}

