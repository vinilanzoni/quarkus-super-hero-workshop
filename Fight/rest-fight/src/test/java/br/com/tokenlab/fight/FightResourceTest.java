package br.com.tokenlab.fight;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FightResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/fights/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}