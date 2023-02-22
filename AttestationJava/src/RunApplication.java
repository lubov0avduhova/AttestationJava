import java.io.FileNotFoundException;

import RandomMachine.ReadFile;
import RandomMachine.RealizationRandomMachine;

public class RunApplication {

	public static void main(String[] args) throws FileNotFoundException {
		
		ReadFile rd = new ReadFile();
		rd.readFile();
		RealizationRandomMachine realizationRandom = new RealizationRandomMachine();
		
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		realizationRandom.startRandomMachine(rd.list);
		
	}

}
