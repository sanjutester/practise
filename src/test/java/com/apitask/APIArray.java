package com.apitask;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class APIArray {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fl = new FileReader(
				"C:\\Users\\SUNDHARAPANDIAN M\\APITest\\src\\test\\resources\\ApiJson\\arraty.json");
		JSONParser json = new JSONParser();
		Object jobj = json.parse(fl);
		JSONObject job = (JSONObject) jobj;

		System.out.println(job.get("page"));

		Object datas = job.get("data");

		JSONArray array = (JSONArray) datas;
		for (int i = 0; i < array.size(); i++) {

			System.out.println(datas);

			Object ardata = array.get(i);

			JSONObject jobkct = (JSONObject) ardata;
			System.out.println(jobkct.get("id"));
			System.out.println(jobkct.get("email"));
			System.out.println(jobkct.get("first_name"));
			System.out.println(jobkct.get("last_name"));
			System.out.println(jobkct.get("avatar"));

		}

	}

}
