
public class SBI extends Bank{
	
public float ROI()
{ 	
	return 6.5f;
}
public float getROI() {
	return 1.1f;

}
public static void main(String[] args) {
	Bank b=new SBI();
	float r;//=b.ROI();
	r=b.getROI();
	//Bank b1=new Bank();
	//float r1=b1.ROI();
	System.out.println("roi for sbi="+r);
}

}
