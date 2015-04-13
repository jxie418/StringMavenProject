package com.jing.xie.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by JXie on 4/12/2015.
 */
public class BlogEntryListResource extends ResourceSupport {
    private List<BlogEntryResource> entries;

    public List<BlogEntryResource> getEntries() {
        return entries;
    }

    public void setEntries(List<BlogEntryResource> entries) {
        this.entries = entries;
    }
}
