public class Player { 
	int playerNum; 
	int playerPos; 
	int money; 
	int jail;
	int numOfPlayer = 0; 
	
	public Player(int playerNum, int playerPos, int money, int jail) {
		this.playerNum = playerNum; 
		this.playerPos = playerPos;
		this.money = money; 
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
