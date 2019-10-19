//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("title")
    private String title;

    @JsonProperty("pages")
    private int pages;
}
