package DS;

class menuitem{
	int id;
	String name;
	menuitem Parent;
	
	public menuitem(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public menuitem()
	{
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public menuitem getParent() {
		return Parent;
	}

	public void setParent(menuitem parent) {
		Parent = parent;
	}
	
	public void Display()
	{
		System.out.println(id+" "+name);
	}
	
	
}


