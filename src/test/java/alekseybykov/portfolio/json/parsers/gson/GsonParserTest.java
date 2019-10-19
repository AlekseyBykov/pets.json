//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.parsers.gson;

import alekseybykov.portfolio.json.pojo.Product;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
 */
@DisplayName("Tests for parsing JSON by using Gson library")
class GsonParserTest {

    private static File jsonFile;
    private static Product[] expected;

    @BeforeAll
    @SneakyThrows
    private static void init() {
        jsonFile = Paths.get("src", "test", "resources", "multiple-data.json").toFile();
        expected = new Product[] {
            Product.builder().productName("Product A").supplier("Supplier A").quantity(1).unitCost(2.33).build(),
            Product.builder().productName("Product B").supplier("Supplier B").quantity(4).unitCost(5.66).build(),
            Product.builder().productName("Product C").supplier("Supplier C").quantity(7).unitCost(8.9).build(),
        };
    }

    @Test
    @SneakyThrows
    @DisplayName("Parse JSON")
    void testParseJson() {

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new FileInputStream(jsonFile)));

        Product[] products = gson.fromJson(jsonReader, Product[].class);

        assertEquals("Product A", products[0].getProductName());
        assertEquals("Supplier A", products[0].getSupplier());
        assertEquals(1, products[0].getQuantity());
        assertEquals(2.33, products[0].getUnitCost());

        assertTrue(Arrays.equals(expected, products));
    }
}
