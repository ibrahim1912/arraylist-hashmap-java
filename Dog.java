public class Dog extends Pet {
	Double weight;
	public Dog(String name, Double weight){
		super(name);
		this.weight = weight;
	}
	public Double getWeight(){
		return weight;
	}
	public void setWeight(Double newWeight){
		weight = newWeight;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		String Sweight = String.valueOf(weight);
	    return name + " " + Sweight;
	}
}
