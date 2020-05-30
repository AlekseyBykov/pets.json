package alekseybykov.portfolio.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Aleksey Bykov
 * @since 18.10.2019
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("book")
    private Book book;

    @JsonProperty("links")
    private List<String> links;
}
