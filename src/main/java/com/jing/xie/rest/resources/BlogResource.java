package com.jing.xie.rest.resources;

import com.jing.xie.core.entities.Blog;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by JXie on 4/12/2015.
 */
public class BlogResource extends ResourceSupport {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Blog toBlog() {
        Blog blog = new Blog();
        blog.setTitle(title);
        return blog;
    }
}
