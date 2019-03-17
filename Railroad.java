public class Railroad extends Property { 
	protected long railroadPrice;  		//Harga beli dari Railroad
	protected int numOfRailroad;  		//Jumlah jenis Railroad yang dimiliki 
	protected int railroadStatus; 		//Status kepemilikan Railroad; 0 jika tidak ada yang memiliki dan 1, 2, 3 dst untuk menunjukan dimiliki oleh player ke n
	
	public Railroad(int pos, long railroadPrice, int numOfRailroad, int railroadStatus) { 
		super(pos);
		this.railroadPrice = railroadPrice; 
		this.numOfRailroad = 0; 
		this.railroadStatus = 0; 
	}
	
	public long getRailroadPrice() { 
		return (this.railroadPrice); 
	}
	
	public int getNumOfRailroad() { 
		return (this.numOfRailroad);
	}
	
	public int getRailroadStatus() {
		return (this.railroadStatus); 
	}
	
	public void buyRailroad(int stat) { 
		this.railroadStatus = stat; 
	}
	
	public void sellRailroad() { 
		this.railroadStatus = 0; 
	}
}
