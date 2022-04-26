package testPackage;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class apirequest {
    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeClass
    public static void createRequestSpec(){

        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://zippopotam.us/").
                build();

        responseSpec = new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                expectStatusCode(200).
                build();
    }
///REQUESTS INCLUDE ENDPOINT, HEADERS, BIDY
@Test
    public static void setRequestSpec(){
        given().
                spec(requestSpec).
        when().
                get("us/90210").
        then().
              assertThat().
                statusCode(200);}

    //RESPONSE INCLUDES STATUS CODE, HEADERS, BODY
@Test
    public static void setResponseSpec(){
                given().
                     spec(requestSpec).
                when().
                    get("us/90210").
                then().
                    spec(responseSpec).
                assertThat().
                    body("places[0].'place name'",equalTo("Beverly Hills"));}

//extracting response values for reuse

    @Test
    public static void extractResponseSpec(){
String placeName=

            given().
                spec(requestSpec).
            when().
                get("https://zippopotam.us/us/90210").
            then().
                    extract().
                    path("places[0].'place name'");

   // Assert.assertEquals(placeName, "Beverly Hills");











}







}
