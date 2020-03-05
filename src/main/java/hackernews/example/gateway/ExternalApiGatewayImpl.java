package hackernews.example.gateway;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import hackernews.example.domain.ProviderNews;
import hackernews.example.excepton.GatewayException;

@Component
public class ExternalApiGatewayImpl implements ExternalApiGateway {

	@Autowired
	private RestTemplate restTemplate;
	@Value("${hackerNewsUrl}")
	private String url;

	@Override
	public ProviderNews getHackerNews() {
		try {
			
			HttpHeaders headers = new HttpHeaders();
			headers.set("Content-Type", MediaType.APPLICATION_JSON_VALUE);
		    headers.set("Accept", MediaType.TEXT_HTML_VALUE);
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            
            return restTemplate.exchange(url, HttpMethod.GET,entity,ProviderNews.class).getBody();
		} catch (Exception e) {
			throw new GatewayException();
		}
	}
}
