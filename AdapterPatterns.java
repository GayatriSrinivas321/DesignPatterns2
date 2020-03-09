package com.epam.AdapterPatterns;

public class AdapterPatterns {
	AdapterPatterns(){
	Dog dog = new Dog(); 
    ToyDog toyDog = new PlasticToyDog(); 

    ToyDog animalAdapter = new AnimalAdapter(dog); 

    System.out.println("Dog..."); 
    dog.walk(); 
    dog.makeSound(); 

    System.out.println("ToyDog..."); 
    toyDog. giggles();  
    System.out.println("AnimalAdapter..."); 
    animalAdapter. giggles();
	}
}
