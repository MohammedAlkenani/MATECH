
//class for Phones
class Phone extends GFG
{
    private static final String Details = null;
	protected String Name;
    protected String DetailsPhone;
    public Phone(String _Name, String DetailsPhone)
	{
		Name = _Name;
		DetailsPhone = Details;
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

}
                                     //Class for Laptops