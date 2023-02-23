
public class Laptop extends GFG {

    
        protected String NameLabtop ;
        protected String DetailsLab;
        public Laptop(String LabtopName, String LabtopDeyails) {
        }
        public void Labtop(String _Name, String Details)
        {
            
            NameLabtop =  _Name ;
            DetailsLab = Details;
        }
        public String getNameLabtop()
        {
            return NameLabtop;
        }
        public void getdetailsLab()
        {
            System.out.println("Details : "+DetailsLab);
        }
    
        public void PrintLaptopName(int i)
        {
            System.out.println((i+1)+" - Laptop Name : "+NameLabtop);
        }
    
    
}
