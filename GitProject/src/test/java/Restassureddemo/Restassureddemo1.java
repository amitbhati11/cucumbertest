package Restassureddemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;


public class Restassureddemo1 {
	
	@DataProvider(name="testdata")
	
	public Object [][] getdata(){
		
		return new Object [][]   {
			
			{"kaushl","viraj",2},{"raj","beer",1}
			
			
			
	
	};
	}
		
		
	@Test(dataProvider="testdata")
	public void postdata(String F_name,String L_name,int SubID) {
		
		baseURI="http://localhost:3000";
		
		JSONObject req=new JSONObject ();
		req.put("F_name", F_name);
		req.put("L_name", L_name);
		req.put("SubID", SubID);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(req.toJSONString()).when()
				
		.post("/users").then().statusCode(201).log().all();
	}
	//@Test(dataProvider="testdata")
		
public void putdata(String F_name,String L_name,int SubID) {
		
		baseURI="http://localhost:3000";
		
		JSONObject req=new JSONObject ();
		req.put("F_name", F_name);
		req.put("L_name", L_name);
		req.put("SubID", SubID);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(req.toJSONString()).when()
				
		
		.put("/users").then().statusCode(201).log().all();
		
	}
	//@Test
	
	    public void getmethod() {
		
		baseURI="http://localhost:3000";
		
		given().get("/Subject").then().statusCode(200).log().all();
		
	}
	}

