package RandomMachine;

import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

	public void writeToFile(String array) {

		try(FileWriter writer = new FileWriter("output.txt", true)){
			writer.write(array.toString());
			writer.write(System.lineSeparator());
			System.out.println("Запись завершена");

		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
