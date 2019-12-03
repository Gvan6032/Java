package hw_16.task_5;

import static hw_16.task_5.WebsiteType.NEWS;

public class Website {
    private String url;
    private WebsiteType type;

    // ur1 -> url 
    // https://ru.wikipedia.org/wiki/URL
    public Website(String ur1) {
        this(ur1, NEWS);
    }


    public Website(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return this.url;
    }

    public WebsiteType getType() {
        return type;
    }
}
