//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
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
