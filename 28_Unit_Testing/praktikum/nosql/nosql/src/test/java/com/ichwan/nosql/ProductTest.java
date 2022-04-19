package com.ichwan.nosql;

import com.ichwan.nosql.controller.ProductController;
import com.ichwan.nosql.model.Product;
import com.ichwan.nosql.repository.ProductRepo;
import com.ichwan.nosql.service.impl.ProductServiceImpl;
import org.jeasy.random.EasyRandom;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static reactor.core.publisher.Mono.when;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ProductTest {

    private final EasyRandom easyRandom = new EasyRandom();
    private final ModelMapper modelMapper = new ModelMapper();
    private Long id;

    @InjectMocks
    private ProductServiceImpl service;

    @Mock
    private ProductRepo repo;

    @Spy
    private ModelMapper mapper = new ModelMapper();

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        id = easyRandom.nextObject(Long.class);
    }

    @Test
    public void getById_WillReturnNull(){
        //Given
        Mockito.when(repo.findById(id)).thenReturn(Optional.empty());

        //When
        var result = service.findByIdProduct(id);

        //Then
        verify(repo, times(1)).findById(id);
        assertEquals(null, result);
    }

    public void getDeleteById(){

        //Given
        doNothing().when(repo).deleteById(id);

        //When
        service.delete(id);

        //Then
        verify(repo, times(1)).deleteById(id);
    }
    //test endpoint dari controller product
    @Test
    public void testEndpointProduct(){
        RequestBuilder builder = MockMvcRequestBuilders
                .get("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON);
    }

    @Test
    public void productInsertRandom(){
        Product product = easyRandom.nextObject(Product.class);

        System.out.println(product);
    }
}
