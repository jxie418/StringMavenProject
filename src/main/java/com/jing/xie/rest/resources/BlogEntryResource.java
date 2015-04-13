package com.jing.xie.rest.resources;

import com.jing.xie.core.entities.BlogEntry;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by JXie on 4/11/2015.
 */
public class BlogEntryResource extends ResourceSupport {
    private String title;

    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogEntry toBlogEntry() {
        BlogEntry entry = new BlogEntry();
        entry.setTitle(title);
        entry.setContent(content);
        return entry;
    }
}