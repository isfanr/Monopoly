public class Lot extends Tile { 
	protected long lotPrice;  		//Harga beli dari Lot
	protected int numOfHouse;  		//Jumlah rumah yang dimiliki di Lot tersebut 
	protected long housePrice; 		//Harga beli rumah pada Lot
	protected int lotStatus; 		//Status kepemilikan Lot; 0 jika tidak ada yang memiliki dan 1, 2, 3 dst untuk menunjukan dimiliki oleh player ke n
	protected int clusterStatus; 	//Status yang menunjukan apakah cluster dari Lot ini dimiliki oleh 1 orang; 0 jika tidak dan 1 jika iya 
	protected int clusterNum; 
	
	public Lot(int pos, long lotPrice, long housePrice, int clusterNum) { 
		super(pos);
		this.lotPrice = lotPrice; 
		this.numOfHouse = 0; 
		this.housePrice = housePrice;
		this.lotStatus = 0; 
		this.clusterStatus = 0; 
		this.clusterNum = clusterNum;
	}
	
	public long getLotPrice() { 
		return (this.lotPrice); 
	}
	
	public int getHouse() { 
		return (this.numOfHouse);
	}
	
	public long getHousePrice() { 
		return (this.housePrice); 
	}
	
	public int getLotStatus() {
		return (this.lotStatus); 
	}
	
	public int getClusterStatus() { 
		return (this.clusterStatus); 
	}
	
	public int getClusterNum() { 
		return (this.clusterNum); 
	}
	
	public void buyHouse(int house) { 
		this.numOfHouse = house; 
	}
	
	public void buyLot(int stat) { 
		this.lotStatus = stat; 
	}
	
	public void setClusterStatus(int stat) { 
		this.clusterStatus = stat; 
	}
	
	public void sellLot() { 
		this.lotStatus = 0; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	