package com.apitask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReqresAPI {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fl = new FileReader("C:\\Users\\SUNDHARAPANDIAN M\\APITest\\src\\test\\resources\\ApiJson\\reqres.json");
		
		JSONParser json = new JSONParser();
		
		Object obj = json.parse(fl);
		
		JSONObject job = (JSONObject) obj;
		
       Object data = job.get("data");
       
       JSONObject jo = (JSONObject) data;
       
		
		System.out.println(jo.get("id"));
		System.out.println(jo.get("email"));
		System.out.println(jo.get("first_name"));
		System.out.println(jo.get("last_name"));
		System.out.println(jo.get("avatar"));
		
		Object data1 = job.get("support");
		JSONObject jobj = (JSONObject) data1;
		
		System.out.println(jobj.get("url"));
		System.out.println(jobj.get("text"));
		
		 
		
		
			
		
		
		
		
		
		
		
		
	}

}
