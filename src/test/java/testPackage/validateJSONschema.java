package testPackage;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class validateJSONschema {

    @Test
    public void schemaValidator() throws FileNotFoundException {
//        baseURI = "https://reqres.in/api";
//
//        File file = new File("./soapReq/schema.json.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
//
//        given().
//                get("/users?page=2")
//        .then().
//                assertThat().body(matchesJsonSchemaInClasspath(file)).
//                statusCode(200);

    }

}
