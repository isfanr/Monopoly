public class Railroad extends Property { 
	protected int railroadPrice;  		//Harga beli dari Railroad
	protected int numOfRailroad;  		//Jumlah jenis Railroad yang dimiliki 
	protected int railroadStatus; 		//Status kepemilikan Railroad; 0 jika tidak ada yang memiliki dan 1, 2, 3 dst untuk menunjukan dimiliki oleh player ke n
	
	public Railroad(int pos, int type, int railroadPrice, int railroadStatus) { 
		super(pos,type);
		this.railroadPrice = railroadPrice; 
		this.railroadStatus = 0; 
	}
	
	
	public long getRailroadPrice() { 
		return (this.railroadPrice); 
	}

	
	public int getRailroadStatus() {
		return (this.railroadStatus); 
	}

}
