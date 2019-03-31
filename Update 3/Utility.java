public class Utility extends Property { 
	protected int utilityPrice;  		//Harga beli dari Utility
	protected int numOfUtility;  		//Jumlah jenis Utility yang dimiliki 
	protected int utilityStatus; 		//Status kepemilikan Utility; 0 jika tidak ada yang memiliki dan 1, 2, 3 dst untuk menunjukan dimiliki oleh player ke n
	
	public Utility(int pos, int utilityPrice, int utilityStatus) { 
		super(pos,3);
		this.utilityPrice = utilityPrice; 
		this.utilityStatus = 0; 
	}
	
	public long getUtilityPrice() { 
		return (this.utilityPrice); 
	}
	
	public int getUtilityStatus() {
		return (this.utilityStatus); 
	}
	
}
