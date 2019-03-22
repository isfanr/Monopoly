import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//inisialisasi player
		Player P1 = new Player(1, 1500);
		Player P2 = new Player(2, 1500);
		Player P3 = new Player(3, 1500);
		Player P4 = new Player(4, 1500);
		
		//inisialisasi board
		Tile go = new Space(0);
		Tile taxJalan = new Space(4);
		Tile jail = new Space(10);
		Tile freeParking = new Space(20);
		Tile goToJail = new Space(30);
		Tile taxIstimewa = new Space(38);
		
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
	}
}
