import java.util.Scanner;
import java.util.Random;

public class Main {
	
	//INISIASI BOARD//
		
	
	public int rollDice()
	{
		Random rand = new Random();

		//mendapatkan nilai [0 - 5]
		int n = rand.nextInt(6);

		// nambahin 1 ke nilai random [1 - 6]
		int dadu = n+1;
	
		return(dadu);
	}
	
	public void movePlayer(Player P, int jalan)
	{
		P.playerPos = ((P.playerPos + jalan)%40)-1;
	} 
		
	public void buyLot(Lot L, Player P)
	{ 
		if (P.money > L.lotPrice)
		{
			P.money = P.money - L.lotPrice;
			L.lotStatus = P.playerNum;
		}
		else
		{
			System.out.println("Ga cukup uang");
		}
	}
	
	public void payRentLot(Lot L, Player P)
	{ 
		//BELOM DIBUAT
	}
	
	public void buyRailroad(Railroad R, Player P) 
	{ 
		if (P.money > R.railroadPrice)
		{
			P.money = P.money - R.railroadPrice;
			R.railroadStatus = P.playerNum;
		}
		else
		{
			System.out.println("Ga cukup uang");
		}
	}

	public void payRentRail(Railroad R, Player P)
	{ 
		int cek = R.railroadStatus;
		int railCount = 0;
		if (BandaraKemayoran.railroadStatus == cek)
		{
			railCount = railCount + 1;
		}
		if (TerminalBisSemarang.railroadStatus == cek)
		{
			railCount = railCount + 1;
		}
		if (StasiunPasarTuri.railroadStatus == cek)
		{
			railCount = railCount + 1;
		}
		if (PelabuhanBelawan.railroadStatus == cek)
		{
			railCount = railCount + 1;
		}
	
		if (railCount == 1)
		{
			P.money = P.money - 1/8*R.railroadPrice;
		}
		else if (railCount == 2)
		{
			P.money = P.money - 1/4*R.railroadPrice;
		}
		else if (railCount == 3)
		{
			P.money = P.money - 1/2*R.railroadPrice;
		}
		else if (railCount == 4)
		{
			P.money = P.money - R.railroadPrice;
		}
	}
	
	public void buyUtility(Utility U, Player P) 
	{ 
		if (P.money > U.utilityPrice)
		{
			P.money = P.money - U.utilityPrice;
			U.utilityStatus = P.playerNum;
		}
		else
		{
			System.out.println("Ga cukup uang");
		}
	}
	
	public void payRentUtil(Utility U, Player P)
	{ 
		int cek = U.utilityStatus;
		int utilCount = 0;
		if (Water.utilityStatus == cek)
		{
			utilCount = utilCount + 1;
		}
		if (Listrik.utilityStatus == cek)
		{
			utilCount = utilCount + 1;
		}
	
		if (utilCount == 1)
		{
			P.money = P.money - 1/8*U.utilityPrice;
		}
		else if (utilCount == 2)
		{
			P.money = P.money - 1/2*U.utilityPrice;
		}
	}
	
	public static void main(String[] args) { 
		
		//INISIASI PLAYER
		Player Player1 = new Player(1,0,1500,0); 
		Player Player2 = new Player(2,0,1500,0);
		
		Lot[] lotList = new Lot[40];
		Railroad[] rrList = new Railroad[40];
		Utility[] utilList = new Utility[40]; 
		Space[] spcList = new Space[40];
		 
		Board<Tile> board = new Board<Tile>();
		
		Space go = new Space (0);
		board.add(go);
		spcList[0] = go; 
		Lot Monas = new Lot (1, 60, 50, 1);
		board.add(Monas);
		lotList[1] = Monas;
		Space communityChest1 = new Space(2);
		board.add(communityChest1);
		spcList[2] = communityChest1;
		Lot TamanMini = new Lot (3, 60, 50, 1);
		board.add(TamanMini);
		lotList[3] = TamanMini;
		Space PajakJalan = new Space(4);
		board.add(PajakJalan);
		spcList[4] = PajakJalan;
		Railroad BandaraKemayoran = new Railroad(5, 200, 0);
		board.add(BandaraKemayoran);
		rrList[5] = BandaraKemayoran;
		Lot RagunanPasarMinggu = new Lot(6, 100, 50, 2);
		board.add(RagunanPasarMinggu);
		lotList[6] = RagunanPasarMinggu;
		Space chance1 = new Space(7);
		board.add(chance1);
		spcList[7] = chance1;
		Lot Binaria = new Lot(8, 100, 50, 2);
		board.add(Binaria);
		lotList[8] = Binaria;
		Lot TamanPluit = new Lot(9, 120, 50, 2);
		board.add(TamanPluit);
		lotList[9] = TamanPluit;
		Space jail = new Space(10);
		board.add(jail);
		spcList[10] = jail;
		Lot KebunRayaBogor = new Lot(11, 140, 100, 3);
		board.add(KebunRayaBogor);
		lotList[11] = KebunRayaBogor;
		Utility Listrik = new Utility(12, 150, 0);
		board.add(Listrik);
		utilList[12] = Listrik;
		Lot PelabuhanRatu = new Lot(13, 140, 100, 3);
		board.add(PelabuhanRatu);
		lotList[13] = PelabuhanRatu;
		Lot TangkubanPerahu = new Lot(14, 160, 100, 3);
		board.add(TangkubanPerahu);
		lotList[14] = TangkubanPerahu;
		Railroad TerminalBisSemarang = new Railroad(15, 200, 0);
		board.add(TerminalBisSemarang);
		rrList[15] = TerminalBisSemarang;
		Lot GedungBatu = new Lot(16, 180, 100, 4);
		board.add(GedungBatu);
		lotList[16] = GedungBatu;
		Space communityChest2 = new Space(17);
		board.add(communityChest2);
		spcList[17] = communityChest2;
		Lot Kopeng = new Lot(18, 180, 100, 4);
		board.add(Kopeng);
		lotList[18] = Kopeng;
		Lot Borobudur = new Lot(19, 200, 100, 4);
		board.add(Borobudur);
		lotList[19] = Borobudur;
		Space freeParking = new Space(20);
		board.add(freeParking);
		spcList[20] = freeParking;
		Lot Prambanan = new Lot(21, 220, 150, 5);
		board.add(Prambanan);
		lotList[21] = Prambanan;
		Space chance2 = new Space(22);
		board.add(chance2);
		spcList[22] = chance2;
		Lot KratonYogya = new Lot(23, 220, 150, 5);
		board.add(KratonYogya);
		lotList[23] = KratonYogya;
		Lot BengawanSolo = new Lot(24, 240, 150, 5);
		board.add(BengawanSolo);
		lotList[24] = BengawanSolo;
		Railroad StasiunPasarTuri = new Railroad(25, 200, 0);
		board.add(StasiunPasarTuri);
		rrList[25] = StasiunPasarTuri;
		Lot Sarangan = new Lot(26, 260, 150, 6);
		board.add(Sarangan);
		lotList[26] = Sarangan;
		Lot Selecta = new Lot(27, 260, 150, 6);
		board.add(Selecta);
		lotList[27] = Selecta;
		Utility Water = new Utility(28, 150, 0);
		board.add(Water);
		utilList[28] = Water;
		Lot GunungKawi = new Lot(29, 280, 150, 6);
		board.add(GunungKawi);
		lotList[29] = GunungKawi;
		Space goToJail = new Space(30);
		board.add(goToJail);
		spcList[30] = goToJail;
		Lot PantaiSanur = new Lot(31, 300, 200, 7);
		board.add(PantaiSanur);
		lotList[31] = PantaiSanur;
		Lot TampakSiring = new Lot(32, 300, 200, 7);
		board.add(TampakSiring);
		lotList[32] = TampakSiring;
		Space communityChest3 = new Space(33);
		board.add(communityChest3);
		spcList[33] = communityChest3;
		Lot TamanLautBanda = new Lot(34, 320, 200, 7);
		board.add(TamanLautBanda);
		lotList[34] = TamanLautBanda;
		Railroad PelabuhanBelawan = new Railroad(35, 200, 0);
		board.add(PelabuhanBelawan);
		rrList[35] = PelabuhanBelawan;
		Space chance3 = new Space(36);
		board.add(chance3);
		spcList[36] = chance3;
		Lot DanauToba = new Lot(37, 350, 200, 8);
		board.add(DanauToba);
		lotList[37] = DanauToba;
		Space taxIstimewa = new Space(38);
		board.add(taxIstimewa);
		spcList[38] = taxIstimewa;
		Lot Brastagi = new Lot(39, 400, 200, 8);
		board.add(Brastagi);
		lotList[39] = Brastagi;
			
		Scanner sc = new Scanner(System.in); 
		
		int Playing = 1; 
		String cmd = sc.next();
		Player tempPlayer = new Player(0,0,0,0);
		boolean Selesai = false; 
		while (!(cmd.equals("END")) && !Selesai ) { 
			if (Playing == 1) { 
				tempPlayer = Player1; 
			}
			else if (Playing == 2) { 
				tempPlayer = Player2; 
			}
			
			//KOCOK DADU
			int sementara = tempPlayer.playerPos;
			int dadu1 = rollDice();
			int dadu2 = rollDice();
			System.out.println("Dadu yang didapat : " + dadu1 + " " + dadu2); 
			int jalan = dadu1 + dadu2;
			
			//PLAYER JALAN / PLAYER DI JAIL
			if (tempPlayer.jail == 0)
			{
				movePlayer(tempPlayer, jalan);
				if ((tempPlayer.playerPos - sementara) < 0)//KALO LEWAT GO DAPET 200
				{
					tempPlayer.money = tempPlayer.money + 200;
				}
			}
			else if (tempPlayer.jail == 3)
			{
				tempPlayer.jail = 0;
				movePlayer(tempPlayer, jalan);
			}
			else //tempPlayer.jail != 0/3
			{
				if (dadu1 == dadu2)
				{
					tempPlayer.jail = 0;
					movePlayer(tempPlayer, jalan);
				}
				else //dadu ga sama
				{
					System.out.println("Mau keluar penjara?"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("MAU"))
					{
						if (tempPlayer.money > 50)
						{
							tempPlayer.jail = 0;
							tempPlayer.money = tempPlayer.money - 50;
							movePlayer(tempPlayer, jalan);
						}
						else
						{
							System.out.println("Uang tidak cukup.");
							tempPlayer.jail = tempPlayer.jail + 1;
						}
					}
					else if (cmd.equals("GAK"))
					{
						tempPlayer.jail = tempPlayer.jail + 1;
					}	
				}
			}
			
			
			if ((board.get(tempPlayer.getPos()).getType()) == 1) { //LOT
				Lot tempL = lotList[(tempPlayer.getPos())]; 
				if (tempL.getLotStatus() == 0) { //BELUM ADA YANG PUNYA
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyLot(tempL, tempPlayer);
					}
					if (cmd.equals("LEAVE")) {
						//do nothing 
					} 
				}
				else if (tempL.getLotStatus == Playing) { //PUNYA SENDIRI
					//BELOM DIBUAT SABAR
				}
				else { //PUNYA ORANG
					payRentLot(tempL, tempPlayer);
				}
			}
			
			else if (board.get(tempPlayer.getPos()).tileType == 2) { //RAILROAD
				Railroad tempR = rrList[(tempPlayer.getPos())]; 
				if (tempR.getRailroadStatus() == 0) { //BELUM ADA YANG PUNYA
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyRailroad(tempR, tempPlayer);
					}
					if (cmd.equals("LEAVE")) { 
						//do nothing
					} 
				}
				else if (tempR.getRailroadStatus == Playing) { //PUNYA SENDIRI
					//do nothing
				}
				else { //PUNYA ORANG
					payRentRail(tempR, tempPlayer); 
				}	
			}
			
			else if (board.get(tempPlayer.getPos()).tileType == 3) { //UTILITY 
				Utility tempU = utilList[(tempPlayer.getPos())]; 
				if (tempU.getUtilityStatus() == 0) { //BELUM ADA YANG PUNYA
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						buyUtility(tempU, tempPlayer);
					}
					else if (cmd.equals("LEAVE")) {
						//do nothing
					} 
				}
				else if (tempU.getUtilityStatus == Playing) { //PUNYA SENDIRI
					//do nothing
				}
				else { //PUNYA ORANG
					payRentUtil(tempU, tempPlayer); 
				}
			}
			else if (board.get(tempPlayer.getPos()).tileType == 4) { //SPACE
				Random card = new Random();
				if (tempPlayer.getPos() == 0) //GO
				{
					//do nothing
				}
				else if ((tempPlayer.getPos() == 2) || (tempPlayer.getPos() == 17) || (tempPlayer.getPos() == 33)) //COMMUNITY CHANCE
				{
					int community = card.nextInt(4);
					if (community == 0)
					{
						System.out.println("Advance to Go(Collect $200)");
						tempPlayer.playerPos = 0;
						tempPlayer.money = tempPlayer.money + 200;
					}
					else if (community == 1)
					{
						System.out.println("Pay Hospital Fee of $100");
						tempPlayer.money = tempPlayer.money - 100;
					}
					else if (community == 2)
					{
						System.out.println("You buy new shoes - Pay $200");
						tempPlayer.money = tempPlayer.money - 200;
					}
					else if (community == 3)
					{
						System.out.println("Doctors's fees - Pay $50");
						tempPlayer.money = tempPlayer.money - 50;
					}
				}
				else if ((tempPlayer.getPos() == 4) || (tempPlayer.getPos() == 38)) //TAX
				{
					tempPlayer.money = tempPlayer.money - 200;
				}
				else if ((tempPlayer.getPos() == 7) || (tempPlayer.getPos() == 22) || (tempPlayer.getPos() == 36)) //CHANCE
				{
					int chance = card.nextInt(4);
					if (chance == 0)
					{
						System.out.println("Go back 3 spaces");
						tempPlayer.playerPos = tempPlayer.playerPos - 3;
					}
					else if (chance == 1)
					{
						System.out.println("Pay Hospital Fee of $100");
						tempPlayer.money = tempPlayer.money - 100;
					}
					else if (chance == 2)
					{
						System.out.println("Bank Error in your favor - collect $200");
						tempPlayer.money = tempPlayer.money + 200;
					}
				}
				else if (tempPlayer.getPos() == 10) //JAIL
				{
					//do nothing
				}
				else if (tempPlayer.getPos() == 20) //FREE PARKING
				{
					//do nothing
				}
				else if (tempPlayer.getPos() == 30) //GO TO JAIL
				{
					tempPlayer.playerPos = 10;
					tempPlayer.jail = 1;
				}
			}
			
			//PERGANTIAN PEMAIN & PENENTUAN KALAH
			if (Playing == 1) 
			{
				if(tempPlayer.money < 0)
				{
					Selesai = true;
					System.out.println("Pemain kedua menang!");
				}
				else
				{ 
					Playing = 2;
				}  
			}
			else if (Playing == 2) 
			{ 
				if(tempPlayer.money < 0)
				{
					Selesai = true;
					System.out.println("Pemain pertama menang!");
				}
				else
				{ 
					Playing = 1;
				}  
			}
		}		
	}
}
