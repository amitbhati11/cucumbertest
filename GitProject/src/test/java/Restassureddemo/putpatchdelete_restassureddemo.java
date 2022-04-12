package Restassureddemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;

public class putpatchdelete_restassureddemo {
	
	@DataProvider(name="datatest")
	
	public Object [][] getdata(){
		
		return new Object [][] {
			{"amit","sftwre"}
			
		};
		
	}
	
	//@Test(dataProvider="datatest")
	public void putmethod(String name,String job) {
		
		baseURI="https://reqres.in";
		JSONObject add=new JSONObject();
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).body(add.toJSONString()).
		when().patch("/api/users/2").then()
		.statusCode(200).log().all();
		
		
	}
	
	
	@Test(dataProvider="datatest")
	public void patchmethod(String name,String job) {
		
		baseURI="https://reqres.in";
		JSONObject add=new JSONObject();
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).body(add.toJSONString()).
		when().patch("api/users/2").then()
		.statusCode(200).log().all();
		
		
	}
	
	@Test
	
	public void deletemethod() {
		
		baseURI="https://reqres.in";
		
		given().when().delete("/api/users/2").then().statusCode(204).log().all();
				
	}

}
