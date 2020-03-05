package hackernews.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import hackernews.example.config.AppConfig;


@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = AppConfig.class)
class HackerNewsControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void getAllNewsHappyPath() throws Exception {
		this.mockMvc.perform(get("/getAllNews")).andExpect(status().isOk());
	}
	
	@Test
	public void deleteNewsHappyPath() throws Exception {
		this.mockMvc.perform(delete("/delete").param("id", "123")).andExpect(status().isOk());
	}
	@Test
	public void noParamDelete() throws Exception {
		this.mockMvc.perform(delete("/delete")).andExpect(status().isBadRequest());
	}

}
