package com.apiobjectmapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperExecution {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		File src = new File("C:\\Users\\SUNDHARAPANDIAN M\\APITest\\src\\test\\resources\\ApiJson\\arraty.json");

		MapperRoot c = mapper.readValue(src, MapperRoot.class);
		System.out.println(c.getPage());
		System.out.println(c.getPer_page());
		System.out.println(c.getTotal());
		System.out.println(c.getTotal_pages());

		List<ObjectMapperClass> data = c.getData();

		for (ObjectMapperClass h : data) {
			System.out.println(h.getId());
			System.out.println(h.getFirst_name());
			System.out.println(h.getLast_name());
			System.out.println(h.getEmail());
			System.out.println(h.getAvatar());

		}
		MapperSupport s = c.getSupport();

		System.out.println(s.getText());
		System.out.println(s.getUrl());

	}

}