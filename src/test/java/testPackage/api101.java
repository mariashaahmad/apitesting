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

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.HashMap;
import java.util.Map;
public class api101 {


    static WebDriver driver;

    @BeforeClass(alwaysRun=true)
    public void classBeforeDemo(){
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\mariy\\Desktop\\New folder\\Selenium\\browserDrivers\\chromedriver.exe");

    }

    @Test
    public void GoogleDemo(){
//        driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("9gag"+ Keys.ENTER);

       // baseURI = "https://qa-practice.herokuapp.com/v2/api-docs";


//        given().
//        when().
//                get("https://zippopotam.us/us/90210").
//        then().
//                assertThat().
//                body("places[0].'place name'", equalTo("Beverly Hills"));
//
////assert by status code
//        given().
//                when().
//                get("https://zippopotam.us/us/90210").
//                then().
//                assertThat().
//                statusCode(200);
//
////assert by content type
//        given().
//                when().
//                get("https://zippopotam.us/us/90210").
//                then().
//                assertThat().
//               contentType(ContentType.JSON);
//
////logging request and response detail
//        given().
//               log().all().
//        when().
//              get("https://zippopotam.us/us/90210").
//        then().
//              log().body();
//
////checking the response body by equalTO, hasItem(""), hasSize(), not(equalTo(x))
//        given().
//                when().
//                get("https://zippopotam.us/us/90210").
//                then().
//                assertThat().
//                body("places[0].'place name'", equalTo("Beverly Hills"));
//
////check by state
//        given().
//                when().
//                get("https://zippopotam.us/us/90210").
//                then().
//                assertThat().
//                body("places[0].'state'", equalTo("California"));
//
////has item can be used to see if a collection of items contain the value
//        given().
//                when().
//                get("https://zippopotam.us/us/90210").
//                then().
//                assertThat().
//                body("places.'place name'", hasItem("Beverly Hills"));


///parameterizing data

       baseURI = "https://zippopotam.us/";
//        String countryPathParam = "PK/";
//        String zipPathParam = "97320";
//
//        String queryParam;
//
//        given().
//                log().all().
//                when().
//                get(baseURI+countryPathParam+zipPathParam).
//                then().
//                log().body();
       }

    @DataProvider ()
    public Object[][] zipCodeAndPlaces() {
        return new Object[][]{
                {"us", "22310","Alexandria"},
                {"us", "12345","Schenectady"},
                {"ca", "B2R","Waverley"},
        }; }


//    @Test(dataProvider = "zipCodeAndPlaces")
//    public void verifyByZipcodeAndPlaces(String country, String zipcode,String place){
//
//        given().
//                when().
//                get(baseURI+country+zipcode).
//                then().
//                assertThat().
//                body("places[0].'place name'", equalTo(place));
//
//    }

    @Test(dataProvider = "zipCodeAndPlaces")
    public void verifyByZipcodeAndPlaces(String country, String zipcode,String place){

        given().
                pathParam("countryCode", country).pathParam("zipCode", zipcode).
        when().
                get("https://zippopotam.us/{countryCode}/{zipCode}").
      then().
                assertThat().
                body("places[0].'place name'", equalTo(place));
    }


    @Test
    public void expolringmaps(){
        given().
               log().all().
        when().
              get("https://worldtimeapi.org/api/timezone/America/New_York").
        then().
              log().body();

////assert by status code
//        given().
//                when().
//                get("https://worldtimeapi.org/api/timezone/America/New_York").
//                then().
//                assertThat().
//                statusCode(200);
    }
    @Test
    public void getRequest(){
//        given().
//                get("https://reqres.in/api/users?page2")
//        .then().
//               statusCode(200).
//               body("data.id[0]",equalTo(1))
//        .body("data.first_name",hasItems("George", "Janet"));

    }
    @Test
    public void postRequest(){
     //   baseURI = "https://reqres.in/api";
        //Map<String,Object> map = new HashMap<String,Object>();
//            map.put("name","maria");
//            map.put("job","TEACHER");
//        System.out.println(map);

      //  JSONObject request = new JSONObject(map);
//        JSONObject request = new JSONObject();
//
//        request.put("name","maria");
//        request.put("job","TEACHER");
//        System.out.println(request.toJSONString());

//        baseURI = "https://reqres.in/api";
//        given().
//                header("Content-Type","application/json").
//
//                body(request.toJSONString()).
//        when().
//                post("/users").
//        then().
//                statusCode(201).log().all();


        ///for PUT REQUEST MEANING UPDATING INFO


//        JSONObject requestn = new JSONObject();
//
//        requestn.put("name","mariaa");
//        requestn.put("job","TEACHERr");
//        System.out.println(requestn.toJSONString());
//        baseURI = "https://reqres.in/api";
//        given().
//                header("Content-Type","application/json").
//
//                body(requestn.toJSONString()).
//                when().
//                patch("/users/2").
//                then().
//                statusCode(200).log().all();
        ///for DELETE REQUEST MEANING DELET INFO


//        baseURI = "https://reqres.in/api";
//        given().
//                auth().
//                basic("admin","password123").
//                header("Content-Type","application/json").
//                header("Accept","application/json").
//                header("Cookie","token=abc123").
//                when().
//                get().
//                then().
//                statusCode(204).
//                log().all();


        /////////////post calls w https://restful-booker.herokuapp.com/booking

        baseURI = "https://restful-booker.herokuapp.com/booking";

//        given().
//               log().all().
//        when().
//              get("https://restful-booker.herokuapp.com/booking/1").
//        then().
//              log().body();


        JSONObject request = new JSONObject();

        request.put("firstname","Maria");
        request.put("lastname","Ahm");
        request.put("totalprice","111");
        request.put("depositpaid","true");
        System.out.println(request.toJSONString());

        baseURI = "https://restful-booker.herokuapp.com";
        given().
                header("Content-Type","application/json").
                body(request).
        when().
                post("/booking").
        then().
                statusCode(201).log().all();




    }

}