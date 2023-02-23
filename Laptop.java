
public class Laptop extends Home {

    
        protected String NameLabtop ;
        protected String DetailsLab;
        private double priceLabtop;
        private double price;
        public Laptop(String LabtopName, String LabtopDeyails) {
        }
        public Laptop(String Name, String Details, int Price) {
        }
        public  void Labtop(String _Name, String Details , double price, int priceLabtop)
        {
            
            NameLabtop =  _Name ;
            DetailsLab = Details;
            price = priceLabtop ;
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
        public int getPrice(int priceLabtop) {
            
            return priceLabtop ;

        }

        public void setPrice(double price) {

            this.price = priceLabtop;
        }
    
        public String toString() {
            
            return "Name: " + NameLabtop + ", Details: " + DetailsLab + ", Price: " + price + " SAR";
        }
}
