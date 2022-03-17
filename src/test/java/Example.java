import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example {
	public static void main(String[] args) throws IOException, ParseException {
		// 1.Mention the Path Of json FIle
		FileReader read = new FileReader(
				"C:\\Users\\andre\\eclipse-workspace\\NewApiTesting\\src\\test\\resources\\New\\example.json");
		// 2.Create JsonParser
		JSONParser parser = new JSONParser();
		// 3. Parse the Json File
		Object obj = parser.parse(read);
		// 4.Convert Obj into Json Obj
		JSONObject jb = (JSONObject) obj;
		Object name = jb.get("name");
		System.out.println(name);

		// Change Object Into String If you Want
//		String s = (String) name;
//		System.out.println(s);

		Object email = jb.get("email");
		System.out.println(email);
		Object phNo = jb.get("phoneNo");
		System.out.println(phNo);
		System.out.println("Address,,,,,,,,");
		Object address = jb.get("address");
		System.out.println(address);
		JSONObject jadd = (JSONObject) address;
        System.out.println(jadd.get("street"));
		System.out.println(jadd.get("pincode"));
		System.out.println(jadd.get("state"));

	}
}
