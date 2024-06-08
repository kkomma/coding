package aaalme;

import static org.hamcrest.CoreMatchers.containsString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class WorkWithFiles {


	private String readFromInputStream(InputStream inputStream)
			throws IOException {
		StringBuilder resultStringBuilder = new StringBuilder();
		try (BufferedReader br= new BufferedReader(new InputStreamReader(inputStream))) {			      
			String line;
			while ((line = br.readLine()) != null) {
				resultStringBuilder.append(line).append("\n");
			}
		}
		return resultStringBuilder.toString();
	}


	public void givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData() {
		String expectedData = "Hello, world!";

		Class<WorkWithFiles> clazz = WorkWithFiles.class;
		InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");
		try {
			String data = readFromInputStream(inputStream);
			System.out.println(data);
			containsString(expectedData);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}	


	public static void main(String[] args) {
		WorkWithFiles workWithFiles = new WorkWithFiles();
		workWithFiles.givenFileNameAsAbsolutePath_whenUsingClasspath_thenFileData();

		Class<WorkWithFiles> clazz = WorkWithFiles.class;
		InputStream inputStream = clazz.getResourceAsStream("/fileTest.txt");		
		try {
			String fileData = workWithFiles.readFromInputStream(inputStream);
			System.out.println("called readFromInputStream");
			System.out.println(fileData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
