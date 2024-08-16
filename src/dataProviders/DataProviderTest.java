package dataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderTest
{
	@DataProvider(name = "teacher")
	public String[][] myData(){
		String data[][] = {{"Yogendra","Joshi","9876588099"},{"Mangesh","Reddy","9999999987"},{"Akash","Patil","9998999987"}};
		return data;
	}
		
	@DataProvider(name = "student")
	public String[][] myData1() {
		String data[][] = {{"Yogendra","Joshi","9876588099"},{"Mangesh","Reddy","9999999987"},{"Akash","Patil","9998999987"}};
		return data;
	}
}

