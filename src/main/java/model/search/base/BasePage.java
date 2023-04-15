package model.search.base;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:42
 */
public class BasePage {
    protected Integer pageNumber;
    protected Integer pageSize;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
