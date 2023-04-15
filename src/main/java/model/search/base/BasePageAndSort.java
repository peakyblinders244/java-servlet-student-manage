package model.search.base;

import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:43
 */
public class BasePageAndSort extends BasePage {
    protected List<BaseSort> sorts;

    public List<BaseSort> getSorts() {
        return sorts;
    }

    public void setSorts(List<BaseSort> sorts) {
        this.sorts = sorts;
    }
}
