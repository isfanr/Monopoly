public abstract class Tile<N> { 
	
	protected int tilePos; 
	protected int tileType; //lot = 1; railroad = 2; utility = 3; space = 4
	
	public Tile (int pos, int type) { 
		this.tilePos = pos;
		this.tileType = type
	}
	
	public int getPos();
}