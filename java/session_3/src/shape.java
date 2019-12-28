
public abstract class shape {
protected int x,y;
public shape(int x){
	this.x=x;
	
}
public shape(int x,int y) {
	super();
	this.x = x;
	this.y = y;
}

abstract public void area();

}

