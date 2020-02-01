package lv.diana;

import lv.diana.polyMorphism.Animal;
import lv.diana.polyMorphism.Cat;
import lv.diana.polyMorphism.Dog;

public class TestPolyMorphism {

	
	public static void main(String[] args) {
		Animal myAnimal = new Animal (); 
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		myAnimal.animalSounds();
		myDog.animalSounds();
		myCat.animalSounds(); 
		
		
		
		

	}

}
