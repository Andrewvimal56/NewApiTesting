import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GreensCart {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader(
				"C:\\Users\\andre\\eclipse-workspace\\NewApiTesting\\src\\test\\resources\\New\\greens.json");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject obj = (JSONObject) parse;
		System.out.println(obj.get("firstName"));
		System.out.println(obj.get("lastName"));
		System.out.println(obj.get("eMail"));
		System.out.println(obj.get("phone"));
		System.out.println(obj.get("passWord"));
		System.out.println(obj.get("confirmPassword"));
		System.out.println(obj.get("dateOfBirth"));
		Object object = obj.get("dateOfBirth");
		JSONObject dob = (JSONObject) object;
		System.out.println(dob.get("day"));
		System.out.println(dob.get("month"));
		System.out.println(dob.get("year"));
	}

}
