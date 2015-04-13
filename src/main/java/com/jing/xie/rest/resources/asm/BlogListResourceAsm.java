package com.jing.xie.rest.resources.asm;

import com.jing.xie.core.services.util.BlogList;
import com.jing.xie.rest.mvc.BlogController;
import com.jing.xie.rest.resources.BlogListResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by JXie on 4/12/2015.
 */
public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

    public BlogListResourceAsm()
    {
        super(BlogController.class, BlogListResource.class);
    }

    @Override
    public BlogListResource toResource(BlogList blogList) {
        BlogListResource res = new BlogListResource();
        res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
        return res;
    }
}
