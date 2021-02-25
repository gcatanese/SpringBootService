package com.perosa.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(controllers = ServiceOne.class)
public class ServiceOneTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {

        this.mockMvc
                .perform(get("/svc1"))
                .andExpect(status().isOk());
    }
}
