public class Utility extends Property { 
	protected long utilityPrice;  		//Harga beli dari Utility
	protected int numOfUtility;  		//Jumlah jenis Utility yang dimiliki 
	protected int utilityStatus; 		//Status kepemilikan Utility; 0 jika tidak ada yang memiliki dan 1, 2, 3 dst untuk menunjukan dimiliki oleh player ke n
	
	public Utility(int pos, long utilityPrice, int numOfUtility, int utilityStatus) { 
		super(pos);
		this.utilityPrice = utilityPrice; 
		this.numOfUtility = 0; 
		this.utilityStatus = 0; 
	}
	
	public long getUtilityPrice() { 
		return (this.utilityPrice); 
	}
	
	public int getNumOfUtility() { 
		return (this.numOfUtility);
	}
	
	public int getUtilityStatus() {
		return (this.utilityStatus); 
	}
	
	public void buyUtility(int stat) { 
		this.utilityStatus = stat; 
	}
	
	public void sellUtility() { 
		this.utilityStatus = 0; 
	}
}
