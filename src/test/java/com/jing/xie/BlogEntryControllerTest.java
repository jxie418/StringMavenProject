package com.jing.xie;

import com.jing.xie.core.entities.BlogEntry;
import com.jing.xie.core.services.BlogEntryService;
import com.jing.xie.rest.mvc.BlogEntryController;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
/**
 * Created by JXie on 4/11/2015.
 */
public class BlogEntryControllerTest {
    @InjectMocks
    private BlogEntryController controller;

    @Mock
    private BlogEntryService service;

    private MockMvc mockMvc;
    @Before
    public void setup()
    {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
    @Ignore
    @Test
    public void test() throws  Exception {
        ResultActions resultActions;
        resultActions = mockMvc.perform(post("/test")
                .content("{\"title\":\"Test Blog Title\"}")
                .contentType(MediaType.APPLICATION_JSON))
                .andDo(print());
    }
    @Test
         public void getExistingBlogEntry() throws Exception {
        BlogEntry entry = new BlogEntry();
        entry.setId(1L);
        entry.setTitle("Test Title");
        when(service.find(1L)).thenReturn(entry);
        mockMvc.perform(get("/rest/blog-entries/1")).andDo(print());
                /*
                .andExpect(jsonPath("$.title",is(entry.getTitle())))
                .andExpect(jsonPath("$.links[*].href",hasItem(endsWith("/blog-entries/1"))))
                .andExpect(status().isOk());
                */
    }
    @Test
    public void getNotExistingBlogEntry() throws Exception {

        when(service.find(1L)).thenReturn(null);
        mockMvc.perform(get("/rest/blog-entries/1")).andExpect(status().isNotFound());
                /*
                .andExpect(jsonPath("$.title",is(entry.getTitle())))
                .andExpect(jsonPath("$.links[*].href",hasItem(endsWith("/blog-entries/1"))))
                .andExpect(status().isOk());
                */
    }
}
