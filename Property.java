public class Property extends Tile 
{ 
	public Property(int pos)
	{
		super(pos);
	}
}

/*untuk Lot, Harga rent (tanpa bangunan) adalah ⅛ harga beli Lot. Jika memiliki sekomplek,
maka harganya menjadi ¼. Jika memiliki 1 rumah, harganya menjadi ½ kalinya, 2 rumah
menjadi 1 kali harga beli Lot, 3 rumah menjadi 2 kalinya, dan 4 rumah menjadi 4 kali
harga beli Lot. Untuk membangun rumah, seorang player harus memiliki Lot lainnya
yang terdapat pada 1 komplek. */

/*untuk Utility, Harga rent jika hanya memiliki 1 jenis adalah ⅛ kali harga beli Lot, sedangkan
jika memiliki 2 jenis maka harganya menjadi ½ kali harga beli Lot. */

/*untuk Railroad, Harga rent jika hanya memiliki 1 jenis adalah ⅛ kali harga beli Lot, 2 jenis
menjadi ¼ kali, 3 jenis menjadi ½ kali, dan 4 jenis menjadi 1 kali harga beli Lot. */
