package com.TA_Activity.Controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testGetUser() throws Exception {
        mockMvc.perform(get("/api/users/1"))  // Perform GET request
               .andExpect(status().isOk())   // Assert status 200
               .andExpect(content().string("User1"));  // Assert response content
    }
}
