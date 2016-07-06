package restapiforsearch;

import org.springframework.data.annotation.Id;

public class Page {

    private long id;
    private String url;
    private String pagetext;

    public Page(long id, String url, String pagetext)
    {
        this.id = id;
        this.url = url;
        this.pagetext = pagetext;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(String url) {
        this.url = url;
    }

    public void setPagetext(String pagetext) {
        this.pagetext = pagetext;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getPagetext() {
        return pagetext;
    }
}
