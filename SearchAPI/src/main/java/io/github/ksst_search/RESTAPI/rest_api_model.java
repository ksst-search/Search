package io.github.ksst_search.RESTAPI;

public class rest_api_model {

    private final long id;
    private final String url;
    private final String pagetext;


    public rest_api_model(long id, String url, String pagetext) //конструктор
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