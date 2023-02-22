package RandomMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


import Toys.realizationToys.FeatureOfToys;

public class ReadFile {

	public LinkedList<FeatureOfToys> list;
	private Scanner scFileName;


	public void readFile() {
		int value = 0;
		list = new LinkedList<>();
		try {
			File filename = new File("./src/RunApplication/bd.txt");
			if(filename.canRead()) {
				scFileName = new Scanner(filename);

				while(scFileName.hasNext()) {
					int id = scFileName.nextInt();
					int count = scFileName.nextInt();
					String size = scFileName.next();
					String title = scFileName.next();

					list.add(new FeatureOfToys(id,count,size,title));
					value++;
				}
				System.out.println("Файл успешно загружен");
				scFileName.close();
			} 
		} catch(FileNotFoundException ex) {
			System.out.println("Упс! Что-то пошло не так!");
			ex.getMessage();
		} finally {
			scFileName.close();
		}

	}
}