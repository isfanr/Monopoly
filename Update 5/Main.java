import java.util.Scanner;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.List;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main{
	static int counter = 1;
	static Timer timer;
	static JFrame frame = new JFrame("Monopoly");
        
	
	public static void main(String[] args) { 

		//INISIASI PLAYER
		Player Player1 = new Player(1,0,1500,0); 
		Player Player2 = new Player(2,0,1500,0);
		
		//INISIASI ARRAY PROPERTY
		Lot[] lotList = new Lot[40];
		Railroad[] rrList = new Railroad[40];
		Utility[] utilList = new Utility[40]; 
		Space[] spcList = new Space[40];
		
		//INISIASI BOARD
		Board<Tile> board = new Board<Tile>();
		
		//INISIASI PROPERTY
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
		
		//INISIASI MULAI
		int Playing = 1; 
		Player tempPlayer = new Player(0,0,0,0);
		Player tempMusuh = new Player(0,0,0,0);
		Board<Property> tempList = new Board<Property>();
		boolean Selesai = false;
		
		//SCANNER	
		Scanner sc = new Scanner(System.in);
				
		//INISIASI COMMAND
		ImageIcon icon = new ImageIcon(Main.class.getResource("Monopoly.jpg"));
		JOptionPane.showMessageDialog(null,"", "Welcome", JOptionPane.INFORMATION_MESSAGE, icon);
		String nama1 = JOptionPane.showInputDialog(null, "Pemain 1: ", "New Game", JOptionPane.QUESTION_MESSAGE);
		String nama2 = JOptionPane.showInputDialog(null, "Pemain 2: ", "New Game", JOptionPane.QUESTION_MESSAGE);
		String cmd = JOptionPane.showInputDialog(null, "Ketik 'MULAI' ", "New Game", JOptionPane.QUESTION_MESSAGE);
		
		//LOOPING PROGRAM 
		if (cmd.equals("MULAI")){
                Monopolyboard mb = new Monopolyboard();
                JFrame frame = new JFrame();
                frame.setSize(1100, 650); // Set the size of the window
                frame.add(mb);
                frame.setVisible(true);
                
                //CMD TARO DI NO 7
		while (!(cmd.equals("END")) && !Selesai ) {
                        
                        //THREAD TIMER
                        TimerTask timerTask = new TimerTask()

                        {

                                public void run() 

                                {

                                        counter++;           

                                }

                        };
                        Thread t = new Thread(new Runnable() 
                        {
                                public void run() 
                                {
                                        while (true) 
                                        {
                                                try 
                                                {														
                                                        if ((counter == 30)) 
                                                        {
                                                                counter = 0;                            
                                                                System.out.println("Ganti pemain");
                                                                //TARO DI NO 9
                                                        }
                                                        Thread.sleep(1000);
                                                } 
                                                catch (InterruptedException ex) 
                                                {}
                                        }
                                }
                        });
                        timer = new Timer("MyTimer");
                        t.start();
                        
                        if (Playing == 1) { 
				tempPlayer = Player1;
				tempMusuh = Player2;
				System.out.println(nama1); //TARO DI NO 1
			}
			else if (Playing == 2) { 
				tempPlayer = Player2;
				tempMusuh = Player1;
				System.out.println(nama2); //TARO DI NO 1
			}
			
                        //TARO DI NO 2
                        System.out.println(nama1);
			System.out.println("Sisa uang: " + Player1.money); 
			System.out.println("Tempat berada: " + Player1.playerPos);
                        
                        //TARO DI NO 3
                        System.out.println(nama2);
			System.out.println("Sisa uang: " + Player2.money); 
			System.out.println("Tempat berada: " + Player2.playerPos);
			
                        //TARO DI NO 5
                        System.out.println("Properti " + nama1);
                        for(int i = 0; i < Player1.playerProp.size(); i++) 
                        {   
                             System.out.println("Nomor tanah: " + Player1.playerProp.get(i).getPos());
                        }  
                        
                        //TARO DI NO 6
                        System.out.println("Properti " + nama2);
                        for(int i = 0; i < Player2.playerProp.size(); i++) 
                        {   
                             System.out.println("Nomor tanah: " + Player2.playerProp.get(i).getPos());
                        } 
                        
                        //KOCOK DADU
			int sementara = tempPlayer.playerPos;
			Random rand = new Random();
			//mendapatkan nilai [0 - 5]
			int n = rand.nextInt(6);
			int m = rand.nextInt(6);
			// nambahin 1 ke nilai random [1 - 6]
			int dadu1 = n+1;
			int dadu2 = m+1;
                        //TARO DI NO 4
			System.out.println("Dadu yang didapat : " + dadu1 + " " + dadu2); 
			int jalan = dadu1 + dadu2 + 1;
			
			//PLAYER JALAN / PLAYER DI JAIL
			if (tempPlayer.jail == 0)
			{
				tempPlayer.playerPos = ((tempPlayer.playerPos + jalan)%40)-1;
				System.out.println("Posisi sekarang: " + tempPlayer.playerPos);
				if ((tempPlayer.playerPos - sementara) < 0)//KALO LEWAT GO DAPET 200
				{
					tempPlayer.money = tempPlayer.money + 200;
					System.out.println("Selamat mendapat 200");
				}
			}
			else if (tempPlayer.jail == 3)
			{
				tempPlayer.jail = 0;
				tempPlayer.playerPos = ((tempPlayer.playerPos + jalan)%40)-1;
				System.out.println("Posisi sekarang: " + tempPlayer.playerPos);
			}
			else //tempPlayer.jail != 0/3
			{
				if (dadu1 == dadu2)
				{
					tempPlayer.jail = 0;
					tempPlayer.playerPos = ((tempPlayer.playerPos + jalan)%40)-1;
					System.out.println("Posisi sekarang: " + tempPlayer.playerPos);
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
							tempPlayer.playerPos = ((tempPlayer.playerPos + jalan)%40)-1;
							System.out.println("Posisi sekarang: " + tempPlayer.playerPos);
						}
						else
						{
							System.out.println("Uang tidak cukup.");
							tempPlayer.jail = tempPlayer.jail + 1;
							System.out.println("Posisi sekarang: " + tempPlayer.playerPos);
						}
					}
					else if (cmd.equals("GAK"))
					{
						tempPlayer.jail = tempPlayer.jail + 1;
						System.out.println("Yaudah");
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
						if (tempPlayer.money > tempL.lotPrice)
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice;
							tempL.lotStatus = tempPlayer.playerNum;
							tempPlayer.playerProp.add(tempL);
							System.out.println("Pembelian lot " + tempPlayer.getPos() + " berhasil");
						}
						else
						{
							System.out.println("Ga cukup uang");
						}
					}
					if (cmd.equals("LEAVE")) {
						System.out.println("Yaudah");
					} 
				}
				else if (tempL.getLotStatus() == Playing) { //PUNYA SENDIRI
					int cekRumah = 0;
					if (tempL.clusterNum == 1)
					{
						if (lotList[1].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[3].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 2)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 50;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}							
					}
					else if (tempL.clusterNum == 2)
					{
						if (lotList[6].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[8].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[9].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 50;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}				
					}
					else if (tempL.clusterNum == 3)
					{
						if (lotList[11].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[13].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[14].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 100;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
					else if (tempL.clusterNum == 4)
					{
						if (lotList[16].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[18].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[19].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 100;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
					else if (tempL.clusterNum == 5)
					{
						if (lotList[21].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[23].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[24].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 150;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
					else if (tempL.clusterNum == 6)
					{
						if (lotList[26].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[27].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[29].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 150;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
					else if (tempL.clusterNum == 7)
					{
						if (lotList[31].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[32].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[34].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 3)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 200;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
					else if (tempL.clusterNum == 8)
					{
						if (lotList[37].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (lotList[39].lotStatus == tempL.lotStatus)
						{
							cekRumah = cekRumah + 1;
						}
						if (cekRumah == 2)
						{
							System.out.println("Mau beli rumah?"); 
							System.out.print("Command : "); 
							cmd = sc.next(); 
							if (cmd.equals("RUMAH"))
							{
								if(tempPlayer.money > tempL.housePrice)
								{
									if(tempL.numOfHouse < 4)
									{
										tempPlayer.money = tempPlayer.money - 200;
										tempL.numOfHouse = tempL.numOfHouse + 1;
										System.out.println("Pembelian rumah berhasil");
									}
									else
									{
										System.out.println("Rumah sudah maks");
									}
								}
								else
								{
									System.out.println("Uang gak cukup"); 
								}
							}
							else if (cmd.equals("TIDAK"))
							{
								System.out.println("Yaudah");
							}
						}
						else
						{
							System.out.println("Belum bisa beli rumah"); 
						}
					}
				}
				else { //PUNYA ORANG
					System.out.println("Yah kena punya orang");
					int cekLot = 0;
					if (tempL.clusterNum == 1)
					{
						//CEK CLUSTER
						if (lotList[1].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[3].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 2)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 2)
					{
						//CEK CLUSTER
						if (lotList[6].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[8].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[9].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 3)
					{
						//CEK CLUSTER
						if (lotList[11].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[13].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[14].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 4)
					{
						//CEK CLUSTER
						if (lotList[16].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[18].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[19].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 5)
					{
						//CEK CLUSTER
						if (lotList[21].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[23].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[24].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								 tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 6)
					{
						//CEK CLUSTER
						if (lotList[26].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[27].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[29].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 7)
					{
						//CEK CLUSTER
						if (lotList[31].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[32].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[34].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 3)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
					else if (tempL.clusterNum == 8)
					{
						//CEK CLUSTER
						if (lotList[37].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						if (lotList[39].lotStatus == tempL.lotStatus)
						{
							cekLot = cekLot + 1;
						}
						
						//BAYAR
						if(cekLot == 2)
						{
							if (tempL.numOfHouse == 0)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/4;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/4;
							}
							else if (tempL.numOfHouse == 1)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice/2;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice/2;
							}
							else if (tempL.numOfHouse == 2)
							{
								tempPlayer.money = tempPlayer.money - tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice;
							}
							else if (tempL.numOfHouse == 3)
							{
								tempPlayer.money = tempPlayer.money - 2*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*2;
							}
							else if (tempL.numOfHouse == 4)
							{
								tempPlayer.money = tempPlayer.money - 4*tempL.lotPrice;
								tempMusuh.money = tempMusuh.money + tempL.lotPrice*4;
							}
						}
						else
						{
							tempPlayer.money = tempPlayer.money - tempL.lotPrice/8;
							tempMusuh.money = tempMusuh.money + tempL.lotPrice/8;
						}
					}
				}
			}
			
			else if (board.get(tempPlayer.getPos()).tileType == 2) { //RAILROAD
				Railroad tempR = rrList[(tempPlayer.getPos())]; 
				if (tempR.getRailroadStatus() == 0) { //BELUM ADA YANG PUNYA
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian?"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						if (tempPlayer.money > tempR.railroadPrice)
						{
							tempPlayer.money = tempPlayer.money - tempR.railroadPrice;
							tempR.railroadStatus = tempPlayer.playerNum;
							tempPlayer.playerProp.add(tempR);
							System.out.println("Pembelian railroad " + tempPlayer.getPos() + " berhasil");
						}
						else
						{
							System.out.println("Ga cukup uang");
						}
					}
					if (cmd.equals("LEAVE")) { 
						System.out.println("Yaudah");
					} 
				}
				else if (tempR.getRailroadStatus() == Playing) { //PUNYA SENDIRI
					System.out.println("Punya sendiri");
				}
				else { //PUNYA ORANG
					System.out.println("Yah kena punya orang");
					int cekr = tempR.railroadStatus;
					int railCount = 0;
					if (rrList[5].railroadStatus == cekr)
					{
						railCount = railCount + 1;
					}
					if (rrList[15].railroadStatus == cekr)
					{
						railCount = railCount + 1;
					}
					if (rrList[25].railroadStatus == cekr)
					{
						railCount = railCount + 1;
					}
					if (rrList[35].railroadStatus == cekr)
					{
						railCount = railCount + 1;
					}
				
					if (railCount == 1)
					{
						tempPlayer.money = tempPlayer.money - tempR.railroadPrice/8;
						tempMusuh.money = tempMusuh.money + tempR.railroadPrice/8;
					}
					else if (railCount == 2)
					{
						tempPlayer.money = tempPlayer.money - tempR.railroadPrice/4;
						tempMusuh.money = tempMusuh.money + tempR.railroadPrice/4;
					}
					else if (railCount == 3)
					{
						tempPlayer.money = tempPlayer.money - tempR.railroadPrice/2;
						tempMusuh.money = tempMusuh.money + tempR.railroadPrice/2;
					}
					else if (railCount == 4)
					{
						tempPlayer.money = tempPlayer.money - tempR.railroadPrice;
						tempMusuh.money = tempMusuh.money + tempR.railroadPrice;
					}
				}	
			}
			
			else if (board.get(tempPlayer.getPos()).tileType == 3) { //UTILITY 
				Utility tempU = utilList[(tempPlayer.getPos())]; 
				if (tempU.getUtilityStatus() == 0) { //BELUM ADA YANG PUNYA
					System.out.println("Property dijual, apakah mau melakukan transaksi pembelian?"); 
					System.out.print("Command : "); 
					cmd = sc.next(); 
					if (cmd.equals("BUY")) { 
						if (tempPlayer.money > tempU.utilityPrice)
						{
							tempPlayer.money = tempPlayer.money - tempU.utilityPrice;
							tempU.utilityStatus = tempPlayer.playerNum;
							tempPlayer.playerProp.add(tempU);
							System.out.println("Pembelian utility " + tempPlayer.getPos() + " berhasil");
						}
						else
						{
							System.out.println("Ga cukup uang");
						}
					}
					else if (cmd.equals("LEAVE")) {
						System.out.println("Yaudah");
					} 
				}
				else if (tempU.getUtilityStatus() == Playing) { //PUNYA SENDIRI
						System.out.println("Punya sendiri");
				}
				else { //PUNYA ORANG
					System.out.println("Yah kena punya orang");
					int ceku = tempU.utilityStatus;
					int utilCount = 0;
					if (utilList[12].utilityStatus == ceku)
					{
						utilCount = utilCount + 1;
					}
					if (utilList[28].utilityStatus == ceku)
					{
						utilCount = utilCount + 1;
					}
				
					if (utilCount == 1)
					{
						tempPlayer.money = tempPlayer.money - tempU.utilityPrice/8;
						tempMusuh.money = tempMusuh.money + tempU.utilityPrice/8;
					}
					else if (utilCount == 2)
					{
						tempPlayer.money = tempPlayer.money - tempU.utilityPrice/2;
						tempMusuh.money = tempMusuh.money + tempU.utilityPrice/2;
					}
				}
			}
			else if (board.get(tempPlayer.getPos()).tileType == 4) { //SPACE
				Random card = new Random();
				if (tempPlayer.getPos() == 0) //GO
				{
					System.out.println("Kamu di go");
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
					System.out.println("Yah kena tax:(");
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
					System.out.println("Kamu di jail");
				}
				else if (tempPlayer.getPos() == 20) //FREE PARKING
				{
					System.out.println("Kamu di free parking");
				}
				else if (tempPlayer.getPos() == 30) //GO TO JAIL
				{
					System.out.println("GO TO JAIL");
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
					JOptionPane.showMessageDialog(null, nama2 + " menang!\n\n" + "CREDIT\n" + "1. Firdausi Aditya D\n" + "2. Yudhistira Qasthari P\n" + "3. M. Isfan Rahadi\n" + "4. Ihsan Faisal R", "Game Over"  , JOptionPane.INFORMATION_MESSAGE);
					
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
					JOptionPane.showMessageDialog(null, nama1 + " menang!\n\n" + "CREDIT\n" + "1. Firdausi Aditya D\n" + "2. Yudhistira Qasthari P\n" + "3. M. Isfan Rahadi\n" + "4. Ihsan Faisal R", "Game Over"  , JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{ 
					Playing = 1;
				}  
			}
		}		
	}
    }
}