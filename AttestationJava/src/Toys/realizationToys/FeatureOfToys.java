package Toys.realizationToys;

public class FeatureOfToys {

	private String title;
	private int count;
	private String size;
	private int id;

	public FeatureOfToys (int id,  int count, String size, String title){

		this.id = id;
		this.title = title;
		this.count = count;
		this.size = size;

	}

	public void setCount(int count) {
		this.count = count;
	}


	public String getField() {
		return   id + " " + count + " " + size + " "+ title;
	}


	public int getFrequency() {
		return count * 10;
	}


	public int getCount() {
		return count;
	}

}

