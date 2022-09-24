package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class a101BaseUrl {

    protected static RequestSpecification spec;

    public static void a101Setup(){

        spec = new RequestSpecBuilder().setBaseUri("https://a101.com/").build();
    }
}
