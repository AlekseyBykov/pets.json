//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String firstName;
    private String lastName;
    private Book book;
    List<String> links;
}
