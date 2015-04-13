package com.jing.xie.rest.resources.asm;

import com.jing.xie.core.entities.BlogEntry;
import com.jing.xie.rest.mvc.BlogEntryController;
import com.jing.xie.rest.resources.BlogEntryResource;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.util.List;

/**
 * Created by JXie on 4/11/2015.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry,BlogEntryResource> {
    public BlogEntryResourceAsm(){
        super(BlogEntryController.class,BlogEntryResource.class);
    }

    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {
        BlogEntryResource res = new BlogEntryResource();
        res.setTitle(blogEntry.getTitle());
        Link link = linkTo(methodOn(BlogEntryController.class).getBlogEntry(blogEntry.getId())).withSelfRel();
        res.add(link.withSelfRel());
        return res;
    }
}
