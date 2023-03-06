package DS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu extends menuitem {

	List<menuitem> list = new ArrayList<>();
	private static boolean isLevelOne=true;
	Scanner sc=new Scanner(System.in);

	public menu() {
		super();
	}

	public menu(int id, String name) {
		super(id, name);
	}

	public menu(String string) {
		super();
	}

	public List<menuitem> getItems() {
		return list;
	}

	public void Addmenuitem(menuitem Item) {
		Item.setParent(this);
		list.add(Item);
	}

	/*public void DSMenu() {

		Scanner sc = new Scanner(System.in);
		list.forEach(e -> e.Display());
//		 Display();

		do {
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("Exist.....");
			}
			menuitem mi = getItems().stream().filter(e -> e.getId() == choice).findFirst().orElse(null);
			mi.Display();
			System.out.println("##########");
			System.out.println("\n Enter your choice... ");
			boolean dsEnter = true;
			int n = sc.nextInt();


			
			
			
			
			out.println("\n Enter your Choice : ");
					int num = sc1.nextInt();

					switch (num) {
					Stack st=new Stack();
					Scanner sc10 = new Scanner(System.in);
					do{
						case 1:
							System.out.println("Enter the value");
							try {
									st.push(sc10.nextInt());
								} 	
							catch (Exception e) {
								System.out.println(e);
							}
							break;

						case 2:
							System.out.println("The elemet is delete..." + st.pop());

							break;

						case 3:
							st.Display();
							break;
						case 4:
							st.peek();
							break;
						case 5:
							System.out.println("The Size of Stack" + st.Size());
							break;
						case 6:
							st.isEmpty();
							break;
						case 7:
							DSMenu();
							dsEnter = false;
							break;

						default:
							System.out.println("Wrong choice...");
							break;

						}
						System.out.println("Do you want to continue.....plese press 1");
					} while (sc1.nextInt() == 1);
				break;

			case 2:
				queue qu = new queue(10);
				Scanner sc11 = new Scanner(System.in);

				do {
					System.out.println("\n Entar your choice......");
					boolean dsaEnter = true;
					int no1 = sc11.nextInt();
					switch (no1) {
					case 1:
						System.out.println("Enter a Value");
						qu.queuein(sc11.nextInt());
						break;
					case 2:
						qu.queueout();
						break;
					case 3:
						qu.display();
						break;
					case 4:
						qu.qFront();
						break;
					case 5:
						System.out.println("The Size of Stack  " + qu.getsize());
						break;
					case 6:
						DSMenu();
						dsaEnter = false;
						break;
					default:
						System.out.println("Wrong Choice.....");
						break;

					}
					System.out.println("Do you want to continue.....plese press 1");

				} while (sc11.nextInt() == 1);
				break;

			case 3:
				doubly_linkList dlist = new doubly_linkList();
				Scanner sc12 = new Scanner(System.in);

				do {
					System.out.println("\nEnter your Choice...");
					boolean dsaEnter = true;
					int no2 = sc12.nextInt();

					switch (no2) {
					case 1:
						System.out.println("Enter the String value in First Position");
						dlist.addNode(sc12.nextInt());
						break;
					case 2:
						System.out.println("Enter Value u want Delete");
						dlist.deleteNode(sc.nextInt());
						break;
					case 3:
						System.out.println(" Link List is ->");
						dlist.Display();
						break;
					case 4:
						System.out.println("the size of doubly link list is ->" + dlist.getSize());
						break;

					case 5:
						DSMenu();
						dsaEnter = false;
						break;
					default:
						System.out.println("Wrong Choice.....");
						break;

					}
					System.out.println("Do you want to continue.....plese press 1");

				} while (sc12.nextInt() == 1);
				break;
			case 4:
				System.out.println("Thank u...!");
				System.exit(0);
				break;

			default:
				System.out.println("Wrong choice...");
				break;

			}
			System.out.println("Do you want to continue.....plese press 1");
		} while (sc.nextInt() == 1);
		sc.close();

	}*/

	public void display1() {
		if(isLevelOne) {
			isLevelOne=false;
			list.forEach(e->e.Display());
			isLevelOne=true;
			
			System.out.println("Enter Your Choice..!");
			int choice=sc.nextInt();
			if(choice==0) {
				System.out.println("Choice is invalid..!");
				display1();
			}else {
				System.out.println("plz Renter operation u want...!");
				Scanner sc1=new Scanner(System.in);
				int n=sc1.nextInt();
				menuitem mi=list.stream().filter(e->e.getId()==choice).findFirst().orElse(null);
				mi.Display();
				System.out.println("######");
				if(mi instanceof menu) {
					((menu) mi).getItems().stream().forEach(e->e.Display());
					
					//System.out.println("Choice a operation u want...!");
					//Scanner sc1=new Scanner(System.in);
					//int n=sc1.nextInt();
			switch(n){
				
					case 1:
						Stack st=new Stack();
						Scanner sc10=new Scanner(System.in);
						do 
						{
							System.out.println("\n Entar Stack operation you want......");
							boolean dsaEnter = true;
							int no1 = sc10.nextInt();
							switch (no1)
							{
						case 1:
							System.out.println("Enter the value");
							try {
									st.push(sc10.nextInt());
								} 	
							catch (Exception e) {
								System.out.println(e);
							}
							break;

						case 2:
							System.out.println("The elemet is delete..." + st.pop());

							break;

						case 3:
							st.Display();
							break;
						case 4:
							st.peek();
							break;
						case 5:
							System.out.println("The Size of Stack" + st.Size());
							break;
						case 6:
								st.isEmpty();
								
							break;
						case 7:
							display1();
							//dsEnter = false;
							break;

						default:
							System.out.println("Wrong choice...");
							break;

							}
							System.out.println("Do you want to continue.....plese press 1");
						}while (sc1.nextInt() == 1);
						break;	
						
					case 2:queue qu = new queue(10);
					Scanner sc11 = new Scanner(System.in);
					
					do {
						System.out.println("\n Entar your choice......");
						boolean dsaEnter = true;
						int no1 = sc11.nextInt();
						switch (no1) {
						case 1:
							System.out.println("Enter a Value");
							qu.queuein(sc11.nextInt());
							break;
						case 2:
							System.out.println("Element is Deleted...");
							qu.queueout();
							break;
						case 3:
							qu.display();
							break;
						case 4:
							qu.qFront();
							break;
						case 5:
							System.out.println("The Size of Stack  " + qu.getsize());
							break;
						case 6:
							display1();
							dsaEnter = false;
							break;
						default:
							System.out.println("Wrong Choice.....");
							break;

						}
						System.out.println("Do you want to continue.....plese press 1");

						} while (sc11.nextInt() == 1);
						break;
						
					case 3:doubly_linkList dlist = new doubly_linkList();
					Scanner sc12 = new Scanner(System.in);

					do {
						System.out.println("\nEnter your Choice...");
						boolean dsaEnter = true;
						int no2 = sc12.nextInt();

						switch (no2) {
						case 1:
							System.out.println("Enter the String value in First Position");
							dlist.addNode(sc12.nextInt());
							break;
						case 2:
							System.out.println("Enter Value u want Delete");
							dlist.deleteNode(sc.nextInt());
							break;
						case 3:
							System.out.println(" Link List is ->");
							dlist.Display();
							break;
						case 4:
							System.out.println("the size of doubly link list is ->" + dlist.getSize());
							break;

						case 5:
							display1();
							dsaEnter = false;
							break;
						default:
							System.out.println("Wrong Choice.....");
							break;

						}
						System.out.println("Do you want to continue.....plese press 1");

					} while (sc12.nextInt() == 1);
					break;
					}
				
				}
			}
		}
		
	}
}
