public class Player<N, P, M> { 
	protected N playerNum; 
	protected P playerPos; 
	protected M money; 
	public static numOfPlayer = 0; 
	
	public Player(N playerNum, P playerPos, M money) {
		this.playerNum = playerNum; 
		this.playerPos = playerPos;
		this.money = money; 
	}
	
	public N getPlayer(N playerNum) { 
		return (this.playerNum);
	}
	
	public P getPlayerPos(P playerPos) { 
		return (this.playerPos); 
	}
	
	public M getMoney(M money) { 
		return(this.money);
	}
	
}
