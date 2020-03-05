package hackernews.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import hackernews.example.config.AppConfig;
import hackernews.example.domain.ProviderNews;
import hackernews.example.domain.TestObj;
import hackernews.example.gateway.ExternalApiGateway;
import hackernews.example.repository.NewsRepository;
@SpringBootTest
@ContextConfiguration(classes = AppConfig.class)
class ServiceNewsTest {
	
	@InjectMocks
	private ServiceNewsImpl service;
	
	@Mock
	ExternalApiGateway gateway;
	
	@Mock
	NewsRepository newsRepository;

	@Test
	void saveNewsHappyPath() {
		when(gateway.getHackerNews())
		.thenReturn(TestObj.getProviderNews());
		service.saveNews();
	}
	@Test
	void saveNewsNullProvider() {
		when(gateway.getHackerNews())
		.thenReturn(null);
		service.saveNews();
	}
	@Test
	void saveNewsEmptyListProvider() {
		when(gateway.getHackerNews())
		.thenReturn(new ProviderNews());
		service.saveNews();
	}
	@Test
	void getAllHappyPath() {
		service.getAllNews();
		verify(newsRepository).findAll();
	}
	@Test
	void deleteNewsHappyPath() {
		service.deleteNews(1);
		verify(newsRepository).deleteById(1);
	}
	@Test
	void deleteNewsException() {
		doThrow(new RuntimeException()).when(newsRepository).deleteById(1);
		assertEquals(false, service.deleteNews(1));
	}

}
