import java.util.*;

class Home
{

	public Home() {
	}
	public static void main(String[] args)
{

	Product ph1=new Product("IPhone 14 Pro","IOS 16 - 5G - 6.1-inch screen" , 6000 );
	Product ph2=new Product("IPhone 13 Pro","iOS 15, upgradable to iOS 16.3 - 5g - 6.0-inch screen" , 4000);
	Product ph3=new Product("IPhone 12 Pro","IOS 16 - 5G - 6.1-inch screen" , 3900);
	Product ph4=new Product("IPhone 11 Pro","IOS 16 - 5G - 6.1-inch screen" , 2700);
	Product lab5=new Product("Asus TUF Gaming" , " IntelCore i5 -16GB -RAM512 GB -NVMe -M.2 -SSDWindows -11NVIDIA -GeForce 4 GB" , 3800);
	Product lab6=new Product("MacBook Air "    , "13.3 -M1 -8GB RAM -256GB SSD -macOS Big Sur -7 Core GPU"                       , 5200);
    Product lab7=new Product("MacBook Pro 14"  , " -14.2 -M1 Pro -16GB RAM -512GB -macOS Monterey -14Core GPU"                   , 7000);


	Product ph_list[]=new Product[10];
	ph_list[0]=ph1;
	ph_list[1]=ph2;
	ph_list[2]=ph3;
	ph_list[3]=ph4;
	ph_list[4]=lab5;
	ph_list[5]=lab6;
	ph_list[6]=lab7;

	printMenu(ph_list);
}

/**
 * @param ph_list
 * @param lab_list
 */
public static void printMenu(Product[] product_list)
	{
	int index=1;
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println(" ___________________________________________________MATECH ___________________________________________________  ");
		System.out.println(" _______________________ WELCOME TO MY SHOP _______________________ ");
		System.out.println(" _____________ HOME _____________");
		System.out.println(" _____________ Menu _____________ ");
		System.out.println("1-Show Avilable Phones and Laptops");
		System.out.println("2-Add New Phone or Laptop");
		System.out.println("3-Exit");

			int a= sc.nextInt();
			if(a==1){
				    int i=0;
					for(i=0;i<product_list.length;i++){
						if(product_list[i]!=null){
							product_list[i].getName(i);
						}
					}

					System.out.println("Enter Device number to view Details : ");
					int sp=sc.nextInt();
					product_list[sp-1].getProductName();
					product_list[sp-1].getDetails();
					product_list[sp-1].getPrice();

					System.out.println("Enter 2 to buy Device (Add to Cart) -- 4 to exit : ");
					int buy= sc.nextInt();
					if(buy==2){
						System.out.println("Enter Card Number");
						String card=sc.next();
						System.out.println("Your Order Placed Successfully");
						printMenu(product_list);
					}
				}
				if(a==2){
						System.out.println("Enter Product Name");
						String Name=sc.next();
						System.out.println("Enter Product Details");
						String Details=sc.next();
						System.out.println("Enter Product Price");
						Double Price=sc.nextDouble();
						Product ph=new Product(Name,Details, Price);
						product_list[(index+1)]=ph;
						System.out.println("Your Device is Added Successfully");
						printMenu(product_list);
			}
	}
	}
}
