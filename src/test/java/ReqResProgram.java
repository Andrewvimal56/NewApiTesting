import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqResProgram {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\andre\\eclipse-workspace\\NewApiTesting\\src\\test\\resources\\New\\reqres.json");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject obj = (JSONObject) parse;
		Object object = obj.get("data");
		JSONObject data = (JSONObject) object;
		System.out.println("ID : "+data.get("id"));
		System.out.println("EMAIL : "+data.get("email"));
        System.out.println("FIRST NAME : "+data.get("first_name"));
        System.out.println("LAST NAME : "+data.get("last_name"));
        System.out.println("AVATAR : "+data.get("avatar"));
        Object object2 = obj.get("support");
        JSONObject support =(JSONObject) object2;
        System.out.println("URL : "+support.get("url"));
        System.out.println("TEXT : "+support.get("text"));
        
        



	}

}
