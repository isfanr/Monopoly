//dadu

import java.util.Random;

Random rand = new Random();

//mendapatkan nilai [0 - 5]
int n = rand.nextInt(6);
int m = rand.nextInt(6);

// nambahin 1 ke nilai random [1 - 6]
int dadu1 = n+1;
int dadu2 = m+1;
int jalan = dadu1 + dadu2;

//////////////////////////////////////////////////////

//kalo player kena rumah
if (lotStatus != playerNum)
{
	if (clusterStatus != 1)
	{
		if ((clusterNum == 1) || (clusterNum == 8))
		{
			if (clusterStatus == 2)
			{
				if (numOfHouse == 0)
				{
					 money = money - 1/4*lotPrice;
				}
				else if (numOfHouse == 1)
				{
					money = money - 1/2*lotPrice;
				}
				else if (numOfHouse == 2)
				{
					money = money - lotPrice;
				}
				else if (numOfHouse == 3)
				{
					money = money = 2*lotPrice;
				}
				else if (numOfHouse == 4)
				{
					money = money = 4*lotPrice;
				}
			}
	}
	else
	{
		money = money - 1/8*lotPrice;
	}
}
else
{
	if(//action beli)
	{
		if (money > lotPrice)
		{
			money = money - lotPrice;
		}
		else
		{
			System.out.println("Ga cukup uang");
		}
	}
	else //action skip
	{}
}

/////////////////////////

//kalo kena railroad
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

///////////////////////

//kalo kena utility
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
