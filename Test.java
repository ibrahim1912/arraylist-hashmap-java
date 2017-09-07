import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;



public class Test {
	
	private static Scanner i;

	public static void showMenu(){
		System.out.println("");
		System.out.println("1. Add dog");
		System.out.println("2. Add cat");
		System.out.println("3. Remove dog");
		System.out.println("4. Remove cat");
		System.out.println("5. List dogs");
		System.out.println("6. List cats");
		System.out.println("7. List all pets");
		System.out.println("8. Show min, max and average weight of dogs");
		System.out.println("0. Quit");
		System.out.println("");
		System.out.println("Please enter your choice :");
	}

	

	public static void main(String[] args) {
		
		ArrayList<Pet> myList = new ArrayList<Pet>();
		Scanner s = new Scanner(System.in);
		
		while(true){
			showMenu();
			int c;
			i = new Scanner(System.in);
			c = i.nextInt();
			
			switch(c){
			
			case 0 :
				System.out.println("Do you wanna exit ? (Y/N)");
				String e = s.nextLine();
				if (e.equals("Y") || e.equals("y"))
				{
					i.close();
					s.close();
					System.exit(0);
				}
				break;
				
		   case 1 :
			    System.out.println("Please enter the dog name :");
				String m = s.nextLine();
				System.out.println("Please enter the weight :");
				String v = s.nextLine();
				Double dV = Double.valueOf(v);
				Dog y = new Dog(m,dV);
				myList.add(y);
				System.out.println("Dog added successfully.");
			    break;
			    
		   case 2 :
				System.out.println("Please enter the cat name :");	
				String name = s.nextLine();
				System.out.println("Please enter the coat color :");
				String coat = s.nextLine();
				Cat p = new Cat(name,coat);
				myList.add(p);
				System.out.println("Cat added successfully.");
				break;
			    
		   case 3 :
				System.out.println("Please enter the dog name :");
				String rem = s.nextLine();
				for( Iterator<Pet> it = myList.iterator() ; it.hasNext();)
				{
					Pet z = (Pet) it.next();
					if(z.getName().equals(rem))
					{
						if(z instanceof Dog)
						{
							it.remove();
							System.out.println("Dog removed successfully.");
							break;
						}
				}
				}
				break;
				
		   case 4 :
				System.out.println("Please enter the cat name :");
				String cc = s.nextLine();
				for( Iterator<Pet> it = myList.iterator() ; it.hasNext();)
				{
					Pet o = (Pet) it.next();
					if(o.getName().equals(cc))
					{
						if(o instanceof Cat)
						{
							it.remove();
							System.out.println("Cat removed successfully.");
							break;
						}
				}
				}
				break;
			    
		   case 5 :  
				System.out.println("");
				System.out.println("**List of dogs and weights**");	
				for(Pet d : myList) {
					if (d instanceof Dog)
					{
		            System.out.println(d);
					}
		        }
			    break;
			    
		   case 6 :  
				System.out.println("");
				System.out.println("**List of cat and coat color**");	
				for(Pet k : myList) {
					if (k instanceof Cat)
					{
		            System.out.println(k);
					}
		        }
			    break;
			    
		   case 7 :  
				System.out.println("");
				System.out.println("**List of all pets**");	
				for(Pet u : myList) {
		            System.out.println(u);
		        }
			    break;
			    
		   case 8 :
			   HashMap<String,Double> mmv = new HashMap<String,Double>();
			   for (Pet h : myList) {
					if (h instanceof Dog)
					{
						mmv.put(h.getName(), ((Dog) h).getWeight());
					}
			    }
				System.out.println("Maximum weight of dogs : " + Collections.max(mmv.values()));
				System.out.println("Minumum weight of dogs : " + Collections.min(mmv.values()));
				double sum = 0.0;
				int size=0;
				for (Pet f : myList) {
					if (f instanceof Dog)
					{
						 sum = sum + ((Dog) f).getWeight();
					}
				   
				}
				for (Pet x : myList) {
				if (x instanceof Dog)
				{
					size++;
				}
				}
				double avg = (sum / size);
				System.out.println("Average weight of dogs : " + avg);
				break;
	}
			    if (c != 0) continue;
		}
	}
}
