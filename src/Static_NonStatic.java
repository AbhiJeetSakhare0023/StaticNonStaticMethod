public class Static_NonStatic {
    static int shopId=311; // global static
    String shopName="Kranti Book Stores"; // global non-static

    public static void main(String[] args) {


        System.out.println("------Welcome To Shop-----");
        System.out.println("Shop Number : " + shopId);// static var in static method
        System.out.println("--------------------------");
        Static_NonStatic shop1 = new Static_NonStatic();// to call non-static var in static method
        System.out.println("Shop Name : " + shop1.shopName);// non-static in static method

        System.out.println("------Print Ordered BookDetails-----");
        bookDetails();// static method called in static method

        System.out.println("------Print Customer Details-----");
        shop1.custDetails(); // non-static method called in static by creating object
    }
        public static void bookDetails() // static
        {
            int bId = 1;// local
            String bName = "Java";// local
            double bPrice = 1555.5d;// local
            String bAuthor = "James Gosling";// local

            System.out.println("BookID = " + bId);
            System.out.println("BookName = " + bName);
            System.out.println("BookPrice = " + bPrice);
            System.out.println("BookAuthor = " + bAuthor);

        }
        public void custDetails() // non-static
        {
            int cId = 11;// local
            long cPhone = 9503370023l; // local
            String cName = "Abhi";//local
            String cAddress = "ABC";// local

            System.out.println("CustomerID = " + cId);
            System.out.println("CustomerPhone = " + cPhone);
            System.out.println("CustomerName = " + cName);
            System.out.println("CustomerAddress = " + cAddress);


        }

}
