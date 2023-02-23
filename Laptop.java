
public class Laptop {


        protected String NameLabtop ;
        protected String DetailsLab;
        protected int price;
        /*public Laptop(String LabtopName, String LabtopDeyails) {
        }
        public Laptop(String Name, String Details, int Price) {
        }*/
        public Laptop(){}
        public Laptop(String _Name, String Details , int priceLabtop)
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
        public void getPrice() {

            System.out.println("Price : "+price);

        }

        public void setPrice(int price) {

            this.price = price;
        }

        public String toString() {

            return "Name: " + NameLabtop + ", Details: " + DetailsLab + ", Price: " + price + " SAR";
        }
}
