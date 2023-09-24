package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {
	
	public static RequestSpecification reqspec;         // line to parameterize API test with multiple data set.
	public RequestSpecification requestSpecification() throws IOException
	
	{
		if(reqspec==null)                               // Condition to parameterize API test with multiple data set.
		{
		
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));                      // to log results for test.
			 reqspec = new RequestSpecBuilder().setBaseUri(getGlobalValue("baseUrl")).addQueryParam("key","qaclick123")
			 .addFilter(RequestLoggingFilter.logRequestTo(log))                                     // to log results for request test.
			 .addFilter(ResponseLoggingFilter.logResponseTo(log))                                   // to log results for response test.
	         .setContentType(ContentType.JSON).build();
			 return reqspec;
	   
		}
         return reqspec;
	}
	
	public static String getGlobalValue(String key) throws IOException  // Method declared for accessing global.properties file.
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Govind\\eclipse-workspace\\APIFramework\\src\\test\\java\\resources\\global.properties");
	    prop.load(fis);
	    return prop.getProperty(key);
	   
	}
	
	public String getJsonPath(Response response, String key)         // common method to extract response values.
	{
		String resp=response.asString();
	    JsonPath js = new JsonPath(resp);
	    return js.get(key).toString();
	}
	
}
