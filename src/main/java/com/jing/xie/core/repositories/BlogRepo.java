package com.jing.xie.core.repositories;

import com.jing.xie.core.entities.Blog;

import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public interface BlogRepo {
    public Blog createBlog(Blog data);
    public List<Blog> findAllBlogs();
    public Blog findBlog(Long id);
    public Blog findBlogByTitle(String title);
    public List<Blog> findBlogsByAccount(Long accountId);
}
