
public class book {

	int bkId;
	String bkname;
	float bkprice;
	static int count;
	public book(int bkId,String bkname,float bkprice)
	{
		this.bkId=bkId;
		this.bkname=bkname;
		this.bkprice=bkprice;
		count++;
	}
	
	@Override
	public String toString() {
		return "book [bkId=" + bkId + ", bkname=" + bkname + ", bkprice=" + bkprice + "]";
	}
	public static void getCount()
	{
		System.out.println("count="+count);
	}
	static
	{
		System.out.println("static block executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
book b=new book(1,"balguruswami",450);
book b1=new book(2,"c++",650);
System.out.println(b);
System.out.println(b1);
book.getCount();


	}

}
