public class Cat extends Pet{
	String coatColor;
	
	public Cat(String name,String coatColor){
		super(name);
		this.coatColor = coatColor;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setcoatColor(String newCoatColor){
		coatColor = newCoatColor;
	}
	public String getcoatColor(){
		return coatColor;
	}
	@Override
	public String toString(){
	    return name + " " + coatColor;
	}	
}
