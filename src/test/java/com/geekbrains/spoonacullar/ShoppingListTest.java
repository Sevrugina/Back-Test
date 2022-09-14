package com.geekbrains.spoonacullar;

import com.geekbrains.api.ApiAddToShoppingListRequest;
import com.geekbrains.api.ApiUserConnectResult;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import net.javacrumbs.jsonunit.JsonAssert;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.given;
import static net.javacrumbs.jsonunit.core.Option.IGNORING_ARRAY_ORDER;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShoppingListTest extends BaseApiTest {

    private static ApiUserConnectResult userData;

    private static Integer idForRemove;

    @Test
    @Order(1)
    void connectUser() {
        userData = given()
                .contentType(ContentType.JSON)
                .body("{}")
                .expect()
                .log()
                .body()
                .statusCode(200)
                .body("status", is("success"))
                .body("username", notNullValue())
                .body("hash", notNullValue())
                .when()
                .post("/users/connect")
                .as(ApiUserConnectResult.class);
    }

    @Test
    @Order(2)
    void getEmptyItems() {
        String actually = given()
                .pathParam("username", userData.getUsername())
                .queryParam("hash", userData.getHash())
                .expect()
                .log()
                .body()
                .when()
                .get("/mealplanner/{username}/shopping-list")
                .asPrettyString();

        String expected = readResourceAsString("getEmptyItems/expected.json");

        JsonAssert.assertJsonEquals(
                expected,
                actually,
                JsonAssert.when(IGNORING_ARRAY_ORDER)
        );
    }

    @Test
    @Order(3)
    void addItemToShoppingList() {
        ApiAddToShoppingListRequest request = ApiAddToShoppingListRequest.builder()
                .item("1 bag of oranges")
                .aisle("orange")
                .parse(true)
                .build();

        String actually = given()
                .pathParam("username", userData.getUsername())
                .queryParam("hash", userData.getHash())
                .body(request)
                .expect()
                .log()
                .body()
                .when()
                .post("/mealplanner/{username}/shopping-list/items")
                .asPrettyString();

        idForRemove = JsonPath.given(actually).get("id");

        String expected = readResourceAsString("addItemToShoppingList/expected.json");

        JsonAssert.assertJsonEquals(
                expected,
                actually,
                JsonAssert.when(IGNORING_ARRAY_ORDER)
        );
    }

    @Test
    @Order(4)
    void deleteItem() {
        given()
                .pathParam("username", userData.getUsername())
                .pathParam("id", idForRemove)
                .queryParam("hash", userData.getHash())
                .expect()
                .log()
                .body()
                .when()
                .delete("/mealplanner/{username}/shopping-list/items/{id}");

        getEmptyItems();
    }

}
