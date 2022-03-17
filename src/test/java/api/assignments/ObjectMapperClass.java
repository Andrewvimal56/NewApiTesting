package api.assignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Datum;
import com.pojo.Pojo;
import com.pojo.Support;

public class ObjectMapperClass {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		// 2.Mention the path of Json File
		File file = new File(
				"C:\\Users\\andre\\eclipse-workspace\\NewApiTesting\\src\\test\\resources\\New\\reqresarray.json");
		// 3.Read value from json- Pass the json file.pojoclass
		Pojo pojo = mapper.readValue(file, Pojo.class);
		System.out.println(pojo.getPage());
		System.out.println(pojo.getPer_page());
		System.out.println(pojo.getTotal());
		System.out.println(pojo.getTotal_pages());
		List<Datum> data = pojo.getData();
		for (Datum datum : data) {
			System.out.println(datum.getId());
			System.out.println(datum.getEmail());
			System.out.println(datum.getFirst_name());
			System.out.println(datum.getLast_name());
			System.out.println(datum.getAvatar());
		}
		Support support = pojo.getSupport();
		System.out.println(support.getUrl());
		System.out.println(support.getText());
		
	    
		

	}

}
