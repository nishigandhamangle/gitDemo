package Interface2;

public final class immutable {
final String pan;

public immutable(String pan) {
	
	this.pan = pan;
}
public String getPan()
{
	return pan;
}
public static void main(String[] args) {
	
	immutable i=new immutable("111");
	immutable i1=new immutable("112");
	System.out.println(i.getPan());
	System.out.println(i1.getPan());
}

}
