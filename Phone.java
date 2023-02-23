
class Phone
{
	protected String Name;
    protected String DetailsPhone;
    protected int price;
    public Phone(String _Name, String _DetailsPhone,int _Price)
	{
		Name = _Name;
		DetailsPhone = _DetailsPhone;
		price = _Price;
	}
    public String getName()
	{
		return Name;
	}
	public void getDetails()
	{
		System.out.println("Details : "+ DetailsPhone);
	}

	public void PrintPhoneName(int i)
	{
		System.out.println((i+1)+" - Phone Name : "+Name);
	}
    public void PrintPhonePrice()
	{
		System.out.println("Phone Price : "+price);
	}
}
                       
