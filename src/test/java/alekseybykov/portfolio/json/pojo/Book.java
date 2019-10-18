//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.json.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-10-18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String isbn;
    private String title;
    private int pages;
}
