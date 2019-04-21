public class Player { 
	int playerNum; 
	int playerPos; 
	int money; 
	int jail;
	static int numOfPlayer = 0; 
	List<Property> playerProp;
	
	public Player(int playerNum, int playerPos, int money, int jail) {
		this.playerNum = playerNum; 
		this.playerPos = playerPos;
		this.money = money; 
		this.jail = jail;
		this.playerProp = new ArrayList<Property>();
	}
	
	public int getPlayer(){ 
		return (this.playerNum);
	}
	
	public int getPos(){ 
		return (this.playerPos); 
	}
	
	public int getMoney(){ 
		return(this.money);
	}
	
	public int getJail(){
		return(this.jail);
	}
}
