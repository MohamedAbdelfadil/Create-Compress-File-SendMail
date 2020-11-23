package com.example.FileOperation.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
	public static void generateFile(Object obj, String listHeader, String fileFullPath) throws Exception {
	
		try(	BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileFullPath));
				CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)){
			
			if(obj == null)
				throw new Exception("Object can't be null");
			
			if(obj instanceof List) {
				List<Object> objects = (List) obj;
				if(!StringUtils.isEmpty(listHeader))
					csvPrinter.printRecord(listHeader+":");
				
				StringBuilder sb = new StringBuilder();
				for(Object instance : objects) {
					csvPrint(instance, instance.getClass().getDeclaredFields(), csvPrinter);
				}
			}
			else {
				csvPrint(obj, obj.getClass().getDeclaredFields(), csvPrinter);
			}
			csvPrinter.flush();
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
		
	
	
	public static void generateCompressedFile(String fileFullPath, String originalFile,String zipFile) throws IOException {
		//compress
		try(
				FileOutputStream fos = new FileOutputStream(fileFullPath+zipFile);
		        ZipOutputStream zipOut = new ZipOutputStream(fos);
		        FileInputStream fis = new FileInputStream(new File(fileFullPath+originalFile))){
			ZipEntry zipEntry = new ZipEntry(originalFile);
			zipOut.putNextEntry(zipEntry);
	        byte[] bytes = new byte[1024];
	        int length;
	        while((length = fis.read(bytes)) >= 0) {
	            zipOut.write(bytes, 0, length);
	        }
		}
	}
	
	
	public static void deleteFile(String path) throws IOException {
		Files.delete( Paths.get(path) );
	}
	
}
