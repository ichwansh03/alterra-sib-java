package com.ichwan.nosql.integration;

import com.ichwan.nosql.controller.ProductController;
import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.repository.ProductRepo;
import com.ichwan.nosql.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProductControllerTest.class)
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepo productRepo;

    @MockBean
    private ProductService productService;

    @Test
    public void getAllProduct() throws Exception{
        RequestBuilder builder = MockMvcRequestBuilders
                .get("/api/v1/products")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);

        MvcResult response = mockMvc
                .perform(builder)
                .andReturn();

        assertEquals(200,response.getResponse().getStatus());
    }

    public void postProductWithPayload() throws Exception{

    }
}
