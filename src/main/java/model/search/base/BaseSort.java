package model.search.base;

/**
 * Le-Hong-Quan
 * Date: 14/04/2023
 * Time: 08:44
 */
public class BaseSort {
    private String key;
    private Boolean asc = true;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }
}
