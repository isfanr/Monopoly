import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public void rollDice (Player P) {
	Random rand = new Random();

	//mendapatkan nilai [0 - 5]
	int n = rand.nextInt(6);
	int m = rand.nextInt(6);

	// nambahin 1 ke nilai random [1 - 6]
	int dadu1 = n+1;
	int dadu2 = m+1;
	int jalan = dadu1 + dadu2;

	}
	
	public void movePlayer (Player P) { 
		//fungsi untuk menggerakan player
	}
	
	public void buyLot(Lot L) { 
		//fungsi untuk membeli lot 
	} 
	
	public void buyRailroad(Railroad R) { 
	if (railroadStatus == 0)
	{
		if(//action beli)
		{
			if (money > lotPrice)
			{
				money = money - lotPrice;
				railroadStatus = playerNum;
			}
			else
			{
				System.out.println("Ga cukup uang");
			}
		}
		else //action skip
		{}
	}
	else if (railroadStatus != playerNum)
	{
		int cek = railroadStatus;
		railCount = 0;
		if (/*1.railroadStatus*/ == cek)
		{
			railCount = railCount + 1;
		}
		if (/*2.railroadStatus*/ == cek)
		{
			railCount = railCount + 1;
		}
		if (/*3.railroadStatus*/ == cek)
		{
			railCount = railCount + 1;
		}
		if (/*4.railroadStatus*/ == cek)
		{
			railCount = railCount + 1;
		}
	
		if (railCount == 1)
		{
			money = money - 1/8*railroadPrice;
		}
		else if (railCount == 2)
		{
			money = money - 1/4*railroadPrice;
		}
		else if (railCount == 3)
		{
			money = money - 1/2*railroadPrice;
		}
		else if (railCount == 4)
		{
			money = money - railroadPrice;
		}
	}
	else //(railroadStatus == playernum)
	{}
	}
	
	public void buyUtility(Utility U) { 
		if (utilityStatus == 0)
	{
		if(//action beli)
		{
			if (money > lotPrice)
			{
			money = money - lotPrice;
			utilityStatus = playerNum;
			}
			else
			{
			System.out.println("Ga cukup uang");
			}
		}
		else //action skip
		{}
	}
	else if (utilityStatus != playerNum)
	{
		int cek = utilityStatus;
		utilCount = 0;
		if (/*1.utilityStatus*/ == cek)
		{
			utilCount = utilCount + 1;
		}
		if (/*2.utilityStatus*/ == cek)
		{
			utilCount = utilCount + 1;
		}
	
		if (utilCount == 1)
		{
			money = money - 1/8*railroadPrice;
		}
		else if (utilCount == 2)
		{
		money = money - 1/2*railroadPrice;
		}
	}
	else //(utilityStatus == playernum)
	{}
	} 
	
	public void payRentLot() { 
		//prosedur untuk membayar sewa lot dari P1 kepada P2 sebagai pemilik property
	}
	
	
	public static void main(String[] args) { 
		//inisialisasi player
		Player P1 = new Player(1, 1500);
		Player P2 = new Player(2, 1500);
		
		//inisialisasi board
		List<Tile> board = new ArrayList<Tile>;
		Space go = new Space (0);
		board.add(go);
		Lot Monas = new Lot (1, 60, 50, 1);
		board.add(Monas);
		Space communityChest1 = new Space(2);
		board.add(communityChest1);
		Lot TamanMini = new Lot (3, 60, 50, 1);
		board.add(TamanMini);
		Space PajakJalan = new Space(4);
		board.add(PajakJalan);
		Railroad BandaraKemayoran = new Railroad(5, 200, 0);
		board.add(BandaraKemayoran);
		Lot RagunanPasarMinggu = new Lot(6, 100, 50, 2);
		board.add(RagunanPasarMinggu);
		Space chance1 = new Space(7);
		board.add(chance1);
		Lot Binaria = new Lot(8, 100, 50, 2);
		board.add(Binaria);
		Lot TamanPluit = new Lot(9, 120, 50, 2);
		board.add(TamanPluit);
		Space jail = new Space(10);
		board.add(jail);
		Lot KebunRayaBogor = new Lot(11, 140, 100, 3);
		board.add(KebunRayaBogor);
		Utility Listrik = new Utility(12, 150, 0);
		board.add(Listrik);
		Lot PelabuhanRatu = new Lot(13, 140, 100, 3);
		board.add(PelabuhanRatu);
		Lot TangkubanPerahu = new Lot(14, 160, 100, 3);
		board.add(TangkubanPerahu);
		Railroad TerminalBisSemarang = new Railroad(15, 200, 0);
		board.add(TerminalBisSemarang);
		Lot GedungBatu = new Lot(16, 180, 100, 4);
		board.add(GedungBatu);
		Space communityChest2 = new Space(17);
		board.add(communityChest2);
		Lot Kopeng = new Lot(18, 180, 100, 4);
		board.add(Kopeng);
		Lot Borobudur = new Lot(19, 200, 100, 4);
		board.add(Borobudur);
		Space freeParking = new Space(20);
		board.add(freeParking);
		Lot Prambanan = new Lot(21, 220, 150, 5);
		board.add(Prambanan);
		Space chance2 = new Space(22);
		board.add(chance2);
		Lot KratonYogya = new Lot(23, 220, 150, 5);
		board.add(KratonYogya);
		Lot BengawanSolo = new Lot(24, 240, 150, 5);
		board.add(BengawanSolo);
		Railroad StasiunPasarTuri = new Railroad(25, 200, 0);
		board.add(StasiunPasarTuri);
		Lot Sarangan = new Lot(26, 260, 150, 6);
		board.add(Sarangan);
		Lot Selecta = new Lot(27, 260, 150, 6);
		board.add(Selecta);
		Utility Water = new Utility(28, 150, 0);
		board.add(Water);
		Lot GunungKawi = new Lot(29, 280, 150, 6);
		board.add(GunungKawi);
		Space goToJail = new Space(30);
		board.add(goToJail);
		Lot PantaiSanur = new Lot(31, 300, 200, 7);
		board.add(PantaiSanur);
		Lot TampakSiring = new Lot(32, 300, 200, 7);
		board.add(TampakSiring);
		Space communityChest3 = new Space(33);
		board.add(communityChest);
		Lot TamanLautBanda = new Lot(34, 320, 200, 7);
		board.add(TamanLautBanda);
		Railroad PelabuhanBelawan = new Railroad(35, 200, 0);
		board.add(PelabuhanBelawan);
		Space chance3 = new Space(36);
		board.add(chance3);
		Lot DanauToba = new Lot(37, 350, 200, 8);
		board.add(DanauToba);
		Space taxIstimewa = new Space(38);
		board.add(taxIstimewa);
		Lot Brastagi = new Lot(39, 400, 200, 8);
		board.add(Brastagi);
		
		//kalo lewat bagian GO
		if ((P1.count % 40) == 0)
			P1.money = P1.money + 200;
		if ((P2.count % 40) == 0)
			P2.money = P2.money + 200;
		if ((P3.count % 40) == 0)
			P3.money = P3.money + 200;
		if ((P4.count % 40) == 0)
			P4.money = P4.money + 200;

		//kalo kena bagian taxJalan
		if (P1.playerPos == 4)
			P1.money = P1.money - 200;
		if (P2.playerPos == 4)
			P2.money = P2.money - 200;
		if (P3.playerPos == 4)
			P3.money = P3.money - 200;
		if (P4.playerPos == 4)
			P4.money = P4.money - 200;
			
		//kalo kena bagian taxIstimewa	
		if (P1.playerPos == 38)
			P1.money = P1.money - 300;
		if (P2.playerPos == 38)
			P2.money = P2.money - 300;
		if (P3.playerPos == 38)
			P3.money = P3.money - 300;
		if (P4.playerPos == 38)
			(P4.money = P4.money - 300;
		
		//kalo kena bagian goToJail	
		if (P1.playerPos == 30)
		{
			P1.playerPos = 10;
			P1.count = P1.count - 20;
		}
		if (P2.playerPos == 30)
		{
			P2.playerPos = 10;
			P2.count = P2.count - 20;
		}
		if (P3.playerPos == 30)
		{
			P3.playerPos = 10;
			P3.count = P3.count - 20;
		}
		if (P4.playerPos == 30)
		{
			P4.playerPos = 10;
			P4.count = P4.count - 20;
		}
		
		//kalo kena bagian jail
		if (P1.playerPos == 10)
		{
		
		}
		if (P2.playerPos == 10)
		{
			
		}
		if (P3.playerPos == 10)
		{
			
		}
		if (P4.playerPos == 10)
		{
			
		}
			 
	private ArrayList<Card> chance, communityChest;	
	public Card drawChance()
	{
		Card c = chance.get(0);
		chance.add(chance.remove(0));
		return c;
	}
	public Card drawCommunityChest()
	{
		Card c = communityChest.get(0);
		communityChest.add(communityChest.remove(0));
		return c;
	}
	private void initCard()
	{
		chance = new ArrayList<>();
		communityChest = new ArrayList<>();
	}
	private void giftCard()
	{
		//CommunityChest Card
		communityChest.add(new Card("Community Chest", "Advance to Go(Collect $200)"));
		communityChest.add(new Card("Community Chest", "Pay Hospital Fee of $100"));
		communityChest.add(new Card("Community Chest", "Bank Error in your favor - collect $200"));
        	communityChest.add(new Card("Community Chest", "Doctors's fees - Pay $50"));
		//Chance Card
		chance.add(new Card("Chance", "Go back 3 spaces"));
		chance.add(new Card("Chance", "Pay Poor tax of $15"));
		chance.add(new Card("Chance", "Bank pays you dividend of $50"));
	}	
			
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
				
				
			
			
			
			
			
			
			
