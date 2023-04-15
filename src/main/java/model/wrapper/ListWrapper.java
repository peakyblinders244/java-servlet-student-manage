package model.wrapper;

import java.util.List;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:38
 */
public class ListWrapper<T> {
    private Long currentPage;
    private Long totalPage;
    private Long sizePage;
    private Long count;
    private List<T> data;


    public Long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public Long getSizePage() {
        return sizePage;
    }

    public void setSizePage(Long sizePage) {
        this.sizePage = sizePage;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
