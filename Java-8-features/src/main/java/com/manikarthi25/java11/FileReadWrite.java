package com.manikarthi25.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWrite {

	public static void main(String a[]) throws IOException {

		Path path = Paths.get("C:\\Mani\\read-file.txt");
		String readData = Files.readString(path);
		System.out.println("Read File : \n" + readData);

		String writeData = readData.replace("Mohith", "Kannan");
		Path pathForWriteData = Paths.get("C:\\Mani\\write-file.txt");
		Files.writeString(pathForWriteData, writeData);

	}

}
