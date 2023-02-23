
//class for Phones
class Phone extends Home
{
    
	private static final String Details = null;
	protected String Name;
    protected String DetailsPhone;
	protected int PricePhone ; 
    /**
     * @param _Name
     * @param _Details 
     * @param DetailsPhone
     */
    public Phone(String _Name, String Details , int Price, String _Details)
	{
		Name = _Name;
		Details = _Details;
		int price = Price ; 
	}
    public Phone(String Name, String details, int price) {
	}
	public String getName()
	{
		return Name;
	}
	public void getDetails()
	{
		System.out.println("Details : "+ Details);
	}

	public void PrintPhoneName(int i)
	{
		System.out.println((i+1)+" - Phone Name : "+Name);
	}
    
	public double getPrice(int Price) {
		return Price;
	}
	
	public void PrintPricePhone(Double PricePhone)
	{
		System.out.println( " Price : " + PricePhone);
	}
}
