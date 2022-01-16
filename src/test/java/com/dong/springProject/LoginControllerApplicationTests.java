package com.dong.springProject;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.dong.controller.LoginController;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringProjectApplication.class)
class LoginControllerApplicationTests {

	@Autowired
	LoginController loginController;
	
	@Test
	void test1() throws Exception {

		MockMvc mockMvc;

//		LoginController loginController=new LoginController();
        mockMvc = MockMvcBuilders.standaloneSetup(loginController).build();

		 MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.post("/user/allUser")
                 .accept(MediaType.APPLICATION_JSON).param("originContent", "202201152017"))
                 .andExpect(MockMvcResultMatchers.status().isOk())
                 .andDo(MockMvcResultHandlers.print())
                 .andReturn();
	}
}
