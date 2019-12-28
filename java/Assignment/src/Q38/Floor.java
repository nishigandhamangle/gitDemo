package Q38;

public class Floor {
	int length;
	int height;

	@Override
	public String toString() {
		return "Floor [length=" + length + ", height=" + height + "]";
	}

	public Floor(int length, int height) {
		super();
		this.length = length;
		this.height = height;
	}
	public int totalTiles(Tile t)
	{
		int area=length* height;
		int n= area/t.elength;
		return n;
		
	}
	public static void main(String[] args) {
		Floor f= new Floor(100,200);
		Tile t= new Tile(10);
		System.out.println("The total no. of tiles:"+f.totalTiles(t));
		

	}

}
