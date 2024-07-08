import java.util.*;
class product
{
    int pcode;
    String pname;
    Float price;
}
public class Index
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();
        System.out.println("Enter the products code ,name and price");
        p1.pcode = s.nextInt();
        p1.pname=s.next();
        p1.price=s.nextFloat();
        System.out.println("Enter the products code ,name and price");
        p2.pcode = s.nextInt();
        p2.pname=s.next();
        p2.price=s.nextFloat();
        System.out.println("Enter the products code ,name and price");
        p3.pcode = s.nextInt();
        p3.pname=s.next();
        p3.price=s.nextFloat();
        if(p1.price<p2.price && p1.price<p3.price)
        System.out.println("First product with lowest price"+p1.price);
        else if (p2.price<p1.price && p2.price<p3.price)
        System.out.println("Second product with lowest price"+p2.price);
        else
        System.out.println("Third product with lowest price"+p3.price);
    }
}