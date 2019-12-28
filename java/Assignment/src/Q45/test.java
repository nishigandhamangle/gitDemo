package Q45;

public class test {
public static void main(String[] args) {
Employee t=new Employee(1,"nishi",125000);
System.out.println("employee incometax="+t.calcTax());
Product p=new Product(2,1200.00,5.0);
System.out.println("product salesTax="+p.calcTax());
}
}
