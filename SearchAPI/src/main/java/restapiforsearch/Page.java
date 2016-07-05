package restapiforsearch;

import org.springframework.data.annotation.Id;

public class Page {

    private final long id;
    private final String url;
    private final String pagetext;

    public Page(long id, String url, String pagetext)
    {
        this.id = id;
        this.url = url;
        this.pagetext = pagetext;
    }


    public long getId() {
        return id;
    }

    public String url() {
        return url;
    }

    public String pagetext() {
        return pagetext;
    }
}
