package DS;

public class MenuDriven {

	public static void setlist()

	{
		menu mainMenu = new menu("Data Structure");

		menu stackmenu = new menu(1, "Stack");
		menu queuemenu = new menu(2, "Queue");
		menu linklistmenu = new menu(3, "LinkedList");
		
		
		mainMenu.Addmenuitem(stackmenu);
		mainMenu.Addmenuitem(queuemenu);
		mainMenu.Addmenuitem(linklistmenu);
		
		stackmenu.Addmenuitem(new menuitem(1, "push"));
		stackmenu.Addmenuitem(new menuitem(2, "pop"));
		stackmenu.Addmenuitem(new menuitem(3, "Display"));
		stackmenu.Addmenuitem(new menuitem(4, "peek"));
		stackmenu.Addmenuitem(new menuitem(5, "Size"));
		stackmenu.Addmenuitem(new menuitem(6, "isEmpty"));
		stackmenu.Addmenuitem(new menuitem(7, "Back"));
//		stackmenu.Display();

		
		
		queuemenu.Addmenuitem(new menuitem(1, "Insert"));
		queuemenu.Addmenuitem(new menuitem(2, "Delete"));
		queuemenu.Addmenuitem(new menuitem(3, "Display"));
		queuemenu.Addmenuitem(new menuitem(4, "QFront"));
		queuemenu.Addmenuitem(new menuitem(5, "QSize"));
		queuemenu.Addmenuitem(new menuitem(6, "Back"));
//		queuemenu.Display();

		
		linklistmenu.Addmenuitem(new menuitem(1, "Insert"));
		linklistmenu.Addmenuitem(new menuitem(2, "Delete"));
		linklistmenu.Addmenuitem(new menuitem(3, "Display"));
		linklistmenu.Addmenuitem(new menuitem(4, "Size"));
		linklistmenu.Addmenuitem(new menuitem(5, "Back"));
//		linklistmenu.Display();
		

		mainMenu.display1();

	}

}
