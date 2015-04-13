package com.jing.xie.core.repositories;

import com.jing.xie.core.entities.BlogEntry;

import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public interface BlogEntryRepo {
    public BlogEntry findBlogEntry(Long id); // Returns the BlogEntry or null if it can't be found
    public BlogEntry deleteBlogEntry(Long id); // Deletes the found BlogEntry or returns null if it can't be found

    public BlogEntry updateBlogEntry(Long id, BlogEntry data);

    public BlogEntry createBlogEntry(BlogEntry data);

    public List<BlogEntry> findByBlogId(Long blogId);
}
