package assignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		 FileReader reader=new FileReader("F://SP_Work//octa//src//test//resources//db.properties");  
	      
		    Properties prop=new Properties();  
		    prop.load(reader); 
		    
		    System.out.println("url");
		    System.out.println("username");
		    System.out.println("password");

	}

}
