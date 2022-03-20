package com.apicreatejson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

public class writeExecution {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
	ObjectMapper mapper = new ObjectMapper();
	
	List<Writedadum> data = new ArrayList<Writedadum>();
	
	Writedadum writedadum = new Writedadum(7, "michael.lawson@reqres.in", "Michael", "Lawson", "https://reqres.in/img/faces/7-image.jpg");
	Writedadum writedadum1 = new Writedadum(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson", "https://reqres.in/img/faces/8-image.jpg");
	Writedadum writedadum2 = new Writedadum(9, "tobias.funke@reqres.in",  "Tobias", "Funke", "https://reqres.in/img/faces/9-image.jpg");
	Writedadum writedadum3 = new Writedadum(10, "byron.fields@reqres.in", "Byron", "Fields",  "https://reqres.in/img/faces/10-image.jpg");
	Writedadum writedadum4 = new Writedadum(11, "george.edwards@reqres.in",  "George",  "Edwards", "https://reqres.in/img/faces/11-image.jpg");
	Writedadum writedadum5 = new Writedadum(12, "rachel.howell@reqres.in", "Rachel", "Howell",  "https://reqres.in/img/faces/12-image.jpg");
			
	data.add(writedadum);
	data.add(writedadum1);
	data.add(writedadum2);
	data.add(writedadum3);
	data.add(writedadum4);
	data.add(writedadum5);
	
	List<WriteSupport> data2 = new ArrayList<WriteSupport>();
	
	WriteSupport support = new WriteSupport("https://reqres.in/#support-heading", "To keep ReqRes free, contributions towards server costs are appreciated!");
			
	File fl = new File("C:\\Users\\SUNDHARAPANDIAN M\\APITest\\src\\test\\resources\\ApiJson\\writeJAso.json");
	WriteRoot root = new WriteRoot(2, 6, 12,25, data, support);
	
	mapper.writeValue(fl, root);
	System.out.println("ok");
	
	
	}
}
