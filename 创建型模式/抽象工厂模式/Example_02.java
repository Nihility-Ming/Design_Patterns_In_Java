
/**
 Sunny软件公司欲开发一套界面皮肤库，可以对Java桌面软件进行界面美化。为了保护版权，该皮肤库源代码不打算公开，而只向用户提供已打包为jar文件的class字节码文件。用户在使用时可以通过菜单来选择皮肤，不同的皮肤将提供视觉效果不同的按钮、文本框、组合框等界面元素.
 该皮肤库需要具备良好的灵活性和可扩展性，用户可以自由选择不同的皮肤，开发人员可以在不修改既有代码的基础上增加新的皮肤。
 */

abstract class SkinFactory
{
	static public SkinFactory createFactory()
	{
		return new GreenSkinFactory();
		// return new RedSkinFactory();
	}
	
	abstract public Button createButton();
	abstract public TextField createTextField();
}

abstract class Button
{
	abstract public void display();
}

abstract class TextField
{
	abstract public void display();
}

class RedSkinFactory extends SkinFactory
{
	public Button createButton()
	{
		return new RedButton();
	}
	
	public TextField createTextField()
	{
		return new RedTextField();
	}
}

class GreenSkinFactory extends SkinFactory
{
	public Button createButton()
	{
		return new GreenButton();
	}
	
	public TextField createTextField()
	{
		return new GreenTextField();
	}
}

class RedButton extends Button
{
	public void display()
	{
		System.out.println("红色的按钮");
	}
}

class RedTextField extends TextField
{
	public void display()
	{
		System.out.println("红色文本输入框");
	}
}

class GreenButton extends Button
{
	public void display()
	{
		System.out.println("绿色的按钮");
	}
}

class GreenTextField extends TextField
{
	public void display()
	{
		System.out.println("绿色文本输入框");
	}
}

public class Example_02
{
	public static void main(String[] args)
	{
		SkinFactory factory = SkinFactory.createFactory();
		factory.createButton().display();
		factory.createTextField().display();
	}
}