import java.math.*;
// 抽象工厂类
abstract class Shop
{
	public String shopName;
	
	public Shop() {}
	public Shop(String shopName)
	{
		this.shopName = shopName;
	}
	
	abstract public Phone createPhone();
	abstract public TV createTV();
}

// 抽象工厂实现类

class XiaodongShop extends Shop
{
	public XiaodongShop(String shopName)
	{
		super(shopName);
	}
	
	@Override
	public Phone createPhone()
	{
		return new XiaodongPhone("iPhone", "3000.5");
	}
	
	@Override
	public TV createTV()
	{
		return new XiaodongTV("乐视TV", "7000.5");
	}
}

class XiaohongShop extends Shop
{
	public XiaohongShop(String shopName)
	{
		super(shopName);
	}
	
	@Override
	public Phone createPhone()
	{
		return new XiaohongPhone("iPhone", "2000.5");
	}
	
	@Override
	public TV createTV()
	{
		return new XiaohongTV("乐视TV", "8000.5");
	}
}

// 抽象产品类
abstract class Phone
{
	public String phoneName;
	public BigDecimal price;
	
	public Phone() {}
	public Phone(String phoneName, String price)
	{
		this.phoneName = phoneName;
		this.price = new BigDecimal(price);
	}
	
	abstract public void print();
}

abstract class TV
{
	public String TVName;
	public BigDecimal price;
	
	public TV() {}
	public TV(String TVName, String price)
	{
		this.TVName = TVName;
		this.price = new BigDecimal(price);
	}
	
	abstract public void print();
}

// 抽象产品实现类
class XiaodongPhone extends Phone
{
	public XiaodongPhone(String phoneName, String price)
	{
		super(phoneName, price);
	}
	
	@Override
	public void print()
	{
		System.out.println("小东店的手机" + this.phoneName + "$" + this.price);
	}
}

class XiaohongPhone extends Phone
{
	public XiaohongPhone(String phoneName, String price)
	{
		super(phoneName, price);
	}
	
	@Override
	public void print()
	{
		System.out.println("小红店的手机" + this.phoneName + "$" + this.price);
	}
}

class XiaodongTV extends TV
{
	public XiaodongTV(String TVName, String price)
	{
		super(TVName, price);
	}
	
	@Override
	public void print()
	{
		System.out.println("小东店的TV" + this.TVName + "$" + this.price);
	}
}

class XiaohongTV extends TV
{
	public XiaohongTV(String TVName, String price)
	{
		super(TVName, price);
	}
	
	@Override
	public void print()
	{
		System.out.println("小红店的TV" + this.TVName + "$" + this.price);
	}
}

public class Example_01
{
	public static void main(String[] args)
	{
		Shop theShop = new XiaodongShop("小东商店");
		// Shop theShop = new XiaohongShop("小红商店");
		Phone thePhone = theShop.createPhone();
		TV theTV = theShop.createTV();
		
		thePhone.print();
		theTV.print();
	}
}
