package com.jing.xie.core.services;

import com.jing.xie.core.entities.Blog;
import com.jing.xie.core.entities.BlogEntry;
import com.jing.xie.core.services.util.BlogEntryList;
import com.jing.xie.core.services.util.BlogList;

/**
 * Created by JXie on 4/12/2015.
 */
public interface BlogService {
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

    public BlogList findAllBlogs();

    public BlogEntryList findAllBlogEntries(Long blogId); // findBlog all associated blog entries

    public Blog findBlog(Long id);
}
