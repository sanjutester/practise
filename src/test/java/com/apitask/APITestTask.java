package com.apitask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APITestTask {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fl = new FileReader("C:\\Users\\SUNDHARAPANDIAN M\\APITest\\src\\test\\resources\\ApiJson\\html.json");
		JSONParser Json = new JSONParser();
		Object obj = Json.parse(fl);
		JSONObject jobj = (JSONObject) obj;
		
		Object txtFstName = jobj.get("Firstname");
		System.out.println(txtFstName);
		
		System.out.println(jobj.get("lastname"));
		
		System.out.println(jobj.get("Address"));
		
		System.out.println(jobj.get("Email"));
		
		System.out.println(jobj.get("Language"));
		
		System.out.println(jobj.get("Skils"));
		
		System.out.println(jobj.get("Contry"));
		
		System.out.println(jobj.get("Phoneno"));
		
		Object txtNumeric = jobj.get("dateofbirth");
		JSONObject jo = (JSONObject) txtNumeric;
		System.out.println(jo);
		
		System.out.println(jo.get("Date"));
		System.out.println(jo.get("Month"));
		System.out.println(jo.get("Year"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
