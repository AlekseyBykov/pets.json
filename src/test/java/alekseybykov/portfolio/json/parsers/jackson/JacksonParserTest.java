package alekseybykov.portfolio.json.parsers.jackson;

import alekseybykov.portfolio.json.pojo.Book;
import alekseybykov.portfolio.json.pojo.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Tests for parsing JSON by using Jackson library")
class JacksonParserTest {

    private static File jsonFile;

    @BeforeAll
    @SneakyThrows
    private static void init() {
        jsonFile = Paths.get("src", "test", "resources", "single-data.json").toFile();
    }

    @Test
    @SneakyThrows
    @DisplayName("Parse JSON")
    void testParseJson() {

        ObjectMapper objectMapper = new ObjectMapper();

        Person person = objectMapper.readValue(jsonFile, Person.class);

        assertNotNull(person);

        assertEquals("Josh", person.getFirstName());
        assertEquals("Juneau", person.getLastName());

        Book book = person.getBook();

        assertNotNull(book);

        assertEquals("978-1-4302-6827-7", book.getIsbn());
        assertEquals("Java 8 Recipes", book.getTitle());
        assertEquals(640, book.getPages());

        List<String> links = person.getLinks();

        assertNotNull(links);

        assertThat(links, hasSize(2));
        assertThat(links, hasItems("https://www.amazon.com/Java-8-Recipes-Josh-Juneau/dp/1430268271",
                "https://www.apress.com/gp/book/9781484235935"));
    }
}
