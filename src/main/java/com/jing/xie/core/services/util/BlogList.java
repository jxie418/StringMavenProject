package com.jing.xie.core.services.util;

import com.jing.xie.core.entities.Blog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public class BlogList {
    private List<Blog> blogs = new ArrayList<Blog>();

    public BlogList(List resultList) {
        this.blogs = resultList;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
