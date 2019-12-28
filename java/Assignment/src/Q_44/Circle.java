package Q_44;
/*Create a class  Circle using abstract class Processor  to calculate and 
print area of a circle by overriding the process method*/
public class Circle extends Processor{
public Circle(int i) {
		// TODO Auto-generated constructor stub
	data=i;
	}

int process()
{
int r=data;
	int k =(int) (3.14*r*r);
	return k;
}
}
