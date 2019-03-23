public class Space extends Tile 
{ 
	public Space(int pos, int type)
	{
		super(pos,type);
	}
	
	public int getPos() { 
		return (this.pos); 
	}
}

//untuk Go, setiap lewat program utama player nambah uang
//untuk GoToJail, setiap lewat player langsung pindahin ke jail
//untuk Jail, player lewat doang
//untuk FreeParking player lewat doang
//untuk Tax, player kena minus uang
//untuk Community Chest dan Chance buat algoritma di program utama
