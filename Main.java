
public class Main {
	public static Laptop getTopLaptop(Laptop []lap)
	{
		Laptop max=lap[0];
		for(int i=0;i<lap.length;i++)
		{
			if(lap[i].price>max.price)
			{
				max=lap[i];
			}
		}
		return max;
	}
	public static Laptop getLowQuality(Laptop []lap)
	{
		Laptop min=lap[0];
		for(int i=0;i<lap.length;i++)
		{
			if(lap[i].ratings<min.ratings)
			{
				min=lap[i];
			}
		}
		return min;
	}
	public static Laptop findLaptop(int id,Laptop []lap)
	{
		Laptop li=null;
		for(int i=0;i<lap.length;i++)
		{
			if(id==lap[i].id)
			{
				li=lap[i];
			}
		}
		return li;
	}
	public static Laptop[] sortByID(Laptop[] lap)
	{
		Laptop t;
		for(int i=0;i<lap.length;i++)
		{
			for(int j=0;j<lap.length-1-i;j++)
			{
				if(lap[j].id>lap[j+1].id)
				{
					t=lap[j];
					lap[j]=lap[j+1];
					lap[j+1]=t;
					
				}
			}
		}
		return lap;
	}
	public static Laptop[] sortByPrice(Laptop []lap)
	{
		Laptop t;
		for(int i=0;i<lap.length;i++)
		{
			for(int j=0;j<lap.length-i-1;j++)
			{
			if(lap[j].price>lap[j+1].price)
			{
				t=lap[j];
				lap[j]=lap[j+1];
				lap[j+1]=t;
			}
			}
		}
		return lap;
	}
	public static Laptop[] sortByRating(Laptop [] lap)
	{
		Laptop t;
		for(int i=0;i<lap.length;i++)
		{
			for(int j=0;j<lap.length-i-1;j++)
			{
			if(lap[j].ratings>lap[j].ratings)
			{
				t=lap[j];
				lap[j]=lap[j+1];
				lap[j+1]=t;
			}
			}
		}
		return lap;
	}
	public static void print_Display(Laptop[] lap)
	{
		for(int i=0;i<lap.length;i++)
		{
			int j=i+1;
			System.out.println("laptop "+j+" company           :"+lap[i].company);
			System.out.println("laptop "+j+" model             :"+lap[i].model);
			System.out.println("laptop "+j+" id                :"+lap[i].id);
			System.out.println("laptop "+j+" price             :"+lap[i].price);
			System.out.println("laptop "+j+" diplay height     :"+lap[i].height);
			System.out.println("laptop "+j+" display width     :"+lap[i].width);
			System.out.println("laptop "+j+" Warrenty Period   :"+lap[i].warrentyPeriod);
			System.out.println("laptop "+j+" ratings           :"+lap[i].ratings);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	Laptop laptop1=new Laptop();

	laptop1.price=26990;
	laptop1.model="15q-bu037TU";
	laptop1.width=253.7;
	laptop1.height=380;
	laptop1.company="HP";
	laptop1.ratings=4;
	laptop1.warrentyPeriod=1;
	laptop1.id=037;
	
	//2nd
	Laptop laptop2=new Laptop();
	
	laptop2.price=61990;
	laptop2.model="MQD32HN/A A1466";
	laptop2.width=227;
	laptop2.height=325;
	laptop2.company="Apple MacBook";
	laptop2.ratings=5;
	laptop2.warrentyPeriod=1;
	laptop2.id=4166;
	
	//3
	Laptop laptop3=new Laptop();
	laptop3.price=119990;
	laptop3.model="730-13IKB";
	laptop3.width=216.3;
	laptop3.height=306.8;
	laptop3.company="Lenovo Yoga 730";
	laptop3.ratings=4;
	laptop3.warrentyPeriod=3;
	laptop3.id=730;
	
	//4
	Laptop laptop4=new Laptop();
	laptop4.price=24990;
	laptop4.model="Eoy543";
	laptop4.width=252;
	laptop4.height=381;
	laptop4.company="Asus";
	laptop4.ratings=3;
	laptop4.warrentyPeriod=1;
	laptop4.id=2231;
	
	//5
	Laptop laptop5=new Laptop();
	laptop5.price=99990;
	laptop5.model="PH315-51-73SR";
	laptop5.width=266;
	laptop5.height=390;
	laptop5.company="Acer";
	laptop5.ratings=5;
	laptop5.warrentyPeriod=1;
	laptop5.id= 300;
	
	//6
	Laptop laptop6=new Laptop();
	laptop6.price=21990;
	laptop6.model="15 3000";
	laptop6.width=260;
	laptop6.height=380;
	laptop6.company="Dell ";
	laptop6.ratings=4;
	laptop6.warrentyPeriod=1;
	laptop6.id=3552;
	
	//7
	Laptop laptop7=new Laptop();
	laptop7.price=27190;
	laptop7.company="Dell";
	laptop7.model="A553111UIN9";
	laptop7.height=49.5;
	laptop7.width=35.3;
	laptop7.ratings=4;
	laptop7.warrentyPeriod=12;
	laptop7.id=3568;
	//8
	Laptop laptop8=new Laptop();
	laptop8.price=64490;
	laptop8.company="Apple MacBook";
	laptop8.model="MQD32HN/A";
	laptop8.height=22.7;
	laptop8.width=32.5;
	laptop8.ratings=5;
	laptop8.warrentyPeriod=12;
	laptop8.id=2017;
	//9
	Laptop laptop9=new Laptop();
	laptop9.price=469999;
	laptop9.company="Razer Blade Pro";
	laptop9.model="7820Hk";
	laptop9.height=27.9;
	laptop9.width=32.5;
	laptop9.ratings=5;
	laptop9.warrentyPeriod=12;
	laptop9.id=7820;
	//10
	Laptop laptop10=new Laptop();
	laptop10.price=429999;
	laptop10.company="Microsoft";
	laptop10.model="HNW-00001";
	laptop10.height=31.2;
	laptop10.width=23.2;
	laptop10.ratings=4;
	laptop10.warrentyPeriod=0;
	laptop10.id=1050;	
	
	Laptop []lap={laptop1,laptop2,laptop3,laptop4,laptop5,laptop6,laptop7,laptop8,laptop9,laptop10};
	Laptop max=getTopLaptop(lap);
	System.out.println(max.price);
	Laptop min=getLowQuality(lap);
	System.out.println(min.model);
	Laptop i=findLaptop(300,lap);
	System.out.println(i.model);
	Laptop[] ID=sortByID(lap);
	for(int i1=0;i1<ID.length;i1++)
	{
		System.out.print(ID[i1].id+" ");
	}
	System.out.println();
	Laptop[] price=sortByPrice(lap);
	for(int i1=0;i1<price.length;i1++)
	{
		System.out.print(price[i1].price+" ");
	}
	System.out.println();
	Laptop[] rating=sortByRating(lap);
	for(int i1=0;i1<price.length;i1++)
	{
		System.out.print(price[i1].ratings+" ");
	}
	System.out.println();
	print_Display(lap);
	}		
}

