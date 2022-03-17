import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqAndResProgramArray {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\andre\\eclipse-workspace\\NewApiTesting\\src\\test\\resources\\New\\reqresarray.json");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject obj = (JSONObject) parse;
		System.out.println("PAGE : " + obj.get("page"));
		System.out.println("PER-PAGE : " + obj.get("per_page"));
		System.out.println("TOTAL : " + obj.get("total"));
		System.out.println("TOTAL-PAGES : " + obj.get("total_pages"));
		Object dataArray = obj.get("data");
		JSONArray objArray = (JSONArray) dataArray;

		// One By One Value From Array

//		System.out.println(objArray.size()); 
//		Object object = objArray.get(2);
//		System.out.println(object);
//		JSONObject obj1 = (JSONObject) object;
//		System.out.println(obj1.get("id"));
//		
		// Using ForLoop
		for (int i = 0; i < objArray.size(); i++) {
			Object object = objArray.get(i);
			JSONObject obj1 = (JSONObject) object;
			System.out.println("ID : "+obj1.get("id"));
			System.out.println("EMAIL : "+obj1.get("email"));
			System.out.println("FIRST NAME  :"+obj1.get("first_name"));
			System.out.println("LAST NAME  :"+obj1.get("last_name"));
			System.out.println("AVATAR  :"+obj1.get("avatar"));

		}

	}
}
