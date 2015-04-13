package com.jing.xie.core.services;

import com.jing.xie.core.entities.BlogEntry;

/**
 * Created by JXie on 4/11/2015.
 */
public interface BlogEntryService {
    public BlogEntry findBlogEntry(Long id);
    public BlogEntry deleteBlogEntry(Long id);
    public BlogEntry updateBlogEntry(Long id, BlogEntry data);
}
