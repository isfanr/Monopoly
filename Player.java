public class Player { 
	protected int playerNum; 
	protected int playerPos; 
	protected long money; 
	public static numOfPlayer = 0; 
	
	public Player(int playerNum; long money) {
		this.playerNum = playerNum; 
		this.playerPos = 0; 
		this.money = money; 
	}
	
	public int getPlayer(int playerNum) { 
		return (this.playerNum);
	}
	
	public int getPlayerPos(int playerPos) { 
		return (this.playerPos); 
	}
	
	public int getMoney(int money) { 
		return(this.money);
	}
	
	public int movePlayer(int move) { 
		for (int i = 0; i < move; i++) { 
			if (this.playerPos < 39) { 
				playerPos += 1; 
			}
			else { 
				playerPos = 0; 
			}
		}
	}
}