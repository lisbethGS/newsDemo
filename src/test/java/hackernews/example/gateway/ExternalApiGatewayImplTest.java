package hackernews.example.gateway;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import hackernews.example.config.AppConfig;
import hackernews.example.domain.ProviderNews;
import hackernews.example.excepton.GatewayException;


@SpringBootTest
@ContextConfiguration(classes = AppConfig.class)
class ExternalApiGatewayImplTest {
	@InjectMocks
	private ExternalApiGatewayImpl gateway;

	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	HttpEntity<String> entity;
	
	String url;
	
	@Before
	void before() {
		org.springframework.test.util.ReflectionTestUtils.setField(gateway, url, "value");
	}

//	@Test
//	void getHackerNewsHappyPath() {
//		when(restTemplate.exchange(url, HttpMethod.GET,entity,ProviderNews.class))
//		.thenReturn(ResponseEntity.ok().body(TestObj.getProviderNews()));
//		assertEquals(2, gateway.getHackerNews().getHits().size());
//	}
	@Test
	void getHackerNewsNull() {	
		Assertions.assertThrows(GatewayException.class, () -> {
			when(restTemplate.getForEntity(url, ProviderNews.class))
			.thenReturn(null);
			gateway.getHackerNews();
		});
	}

}
