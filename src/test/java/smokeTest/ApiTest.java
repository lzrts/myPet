package smokeTest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    private final String LOGIN = "automation@keepitqa.com";
    private final String PASS = "E#*b2wGIbFHz";

    // Test for the validation of the response elements
    @Test
    void testWillPass(){

        given()
                .auth()
                .basic(LOGIN, PASS)
        .when()
                .get("https://ws-test.keepit.com/users/zhc4v6-5ev7di-9hhhlm")
        .then()
                .assertThat()
                .statusCode(200)
                .body("user.enabled", equalTo("true"))
                .body("user.created", equalTo("2019-02-28T13:07:49Z"))
                .body("user.product", equalTo("7dwqnq-5cvrcm-1z3ehj"))
                .body("user.parent", equalTo("80ltks-yhfls5-24zyf2"))
                .body("user.subscribed", equalTo("true"));
    }

    //Test will fail, just for report statistic
    @Test
    void testWillFail(){

        given()
                .auth()
                .basic(LOGIN, PASS)
        .when()
                .get("https://ws-test.keepit.com/users/zhc4v6-5ev7di-9hhhlm")
        .then()
                .assertThat()
                .statusCode(200)
                .body("user.enabled", equalTo("false"))
                .body("user.created", equalTo("2019-02-28T13:07:49Z"))
                .body("user.product", equalTo("7dwqnq-5cvrcm-1z3ehj"))
                .body("user.parent", equalTo("80ltks-yhfls5-24zyf2"))
                .body("user.subscribed", equalTo("true"));
    }
}
