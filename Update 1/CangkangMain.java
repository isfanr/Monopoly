import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public void rollDice (Player P) {
		//fungsi untuk melempar dadu
	}
	
	public void movePlayer (Player P) { 
		//fungsi untuk menggerakan player
	}
	
	public void buyLot(Lot L) { 
		//fungsi untuk membeli lot 
	} 
	
	public void buyRailroad(Railroad R) { 
		//fungsi untuk membeli railroad
	}
	
	public void buyUtility(Utility U) { 
		//prosedur untuk membeli utility
	} 
	
	public void payRent() { 
		//prosedur untuk membayar sewa lot dari P1 kepada P2 sebagai pemilik property
	}
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		Player<int,int,int> Player1 = new Player<int,int,int>(1,0,1500); 
		Player<int,int,int> Player2 = new Player<int,int,int>(2,0,1500);
		int RailCount; 
		int UtilCount;
		//inisiasi Tile
		int Playing = 1; 
		String cmd = sc.next();
		Player<int,int,int,> tempPlayer = new Player<int,int,int>(0,0,0); 
		while (!(cmd.equals("END"))) { 
			if (Playing == 1) { 
				tempPlayer = Player1; 
			}
			else if (Playing == 2) { 
				tempPlayer = Player2; 
			}
			rollDice(tempPlayer); 
			movePlayer(tempPlayer);
			
			if (board.get(tempPlayer.getPos())().tileType == 1) { 
				Lot tempL = board.get(tempPlayer.getPos())(); 
				if (tempL.getLotStatus() == 0) { 
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyLot(tempL);
					}
					if (cmd.equals("LEAVE") { 
					} 
				}
				else if (tempL.getLotStatus == Playing) {
				}
				else { 
					PayRent(); 
				}
			}
			
			else if (board.get(tempPlayer.getPos())().tileType == 2) { 
				Railroad tempR = board.get(tempPlayer.getPos())(); 
				if (tempR.getRailroadStatus() == 0) { 
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyRailroad();
					}
					if (cmd.equals("LEAVE") { 
					} 
				}
				else if (tempR.getRailroadStatus == Playing) {
				}
				else { 
					PayRent(); 
				}	
			}
			
			else if (board.get(tempPlayer.getPos())().tileType == 3) { 
				Utility tempU = board.get(tempPlayer.getPos())(); 
				if (tempU.getUtilityStatus() == 0) { 
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyUtility();
					}
					if (cmd.equals("LEAVE") { 
					} 
				}
				else if (tempU.getUtilityStatus == Playing) {
				}
				else { 
					PayRent(); 
				}
			}
			
			else if (board.get(tempPlayer.getPos())().tileType == 4) { 
			}
			
			if (Playing == 1) { 
				Playing = 2;  
			}
			else (Playing == 2) { 
				Playing = 1; 
			}
		}
				
				
			
			
			
			
			
			
			