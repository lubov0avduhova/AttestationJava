package RandomMachine;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

import Toys.realizationToys.FeatureOfToys;


public class RealizationRandomMachine {
	private WriteFile writeFile;


	public void startRandomMachine(LinkedList<FeatureOfToys> array) {
		
		System.out.println("Массив");
		printArray(array);
		
		writeFile = new WriteFile();
		int randomCount = ThreadLocalRandom.current().nextInt(0, (array.size() + 1) * 10);
		int i = 0;
		Iterator<FeatureOfToys> toysItertor = array.iterator();
		

		while(toysItertor.hasNext()) {
			FeatureOfToys nextToy = toysItertor.next();
			
			if(randomCount < array.get(i).getFrequency()) {
				writeFile.writeToFile(array.get(i).getField());
				array.get(i).setCount(array.get(i).getCount() - 1);
				
			}
			if(array.get(i).getCount() == 0) {
				array.remove(i);
			}
			i++;
		}
		
	}
	
	public void printArray(LinkedList<FeatureOfToys> arr) {
		for (FeatureOfToys strings : arr) {
			System.out.println(strings.getField());
		}
	}
}



