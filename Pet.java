public class Pet {
	public String name;
	
	public Pet(){
		this("No Name");
	}
	public Pet(String name){
		this.name = name;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
	    return name;
	}
}
