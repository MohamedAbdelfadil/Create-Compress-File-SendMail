package com.example.FileOperation.utilities;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class FileOperationService {
	
	
	// generic method to write to file 
	// you have to send at least 1 field
	// obj can be any type and of collections only(List)
	// fields are used in the file to present what the value is
	// fields must be same as java model if you you're sending user-defined types
	//setHeader parameter is optional it's used in case of Collections to clarify what this list present
	public static ByteArrayInputStream generateFile(Object obj, String setHeader) throws Exception {
	
		try(	ByteArrayOutputStream out = new ByteArrayOutputStream();
				CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), CSVFormat.DEFAULT)){
			
			if(obj == null)
				throw new Exception("Object can't be null");
			
			if(obj instanceof List) {
				List<Object> objects = (List) obj;
				if(!StringUtils.isEmpty(setHeader))
					csvPrinter.printRecord(setHeader+":");
				
				StringBuilder sb = new StringBuilder();
				for(Object instance : objects) {
					csvPrint(instance, instance.getClass().getDeclaredFields(), csvPrinter);
				}
			}
			else {
				csvPrint(obj, obj.getClass().getDeclaredFields(), csvPrinter);
			}
			csvPrinter.flush();
		    return new ByteArrayInputStream(out.toByteArray());
		} catch (Exception e) {
			throw e;
		}
	}
	
	private static void csvPrint(Object obj, Field[] fields, CSVPrinter csvPrinter) throws IllegalArgumentException, IllegalAccessException, IOException {
		StringBuilder sb = new StringBuilder();
		for(Field field : fields) {
			field.setAccessible(true);
			Object value = field.get(obj);
			if(value != null)
				sb.append(field.getName()+":"+value+"\t");
		}
		csvPrinter.printRecord(sb.toString());
	}
		
	
}
