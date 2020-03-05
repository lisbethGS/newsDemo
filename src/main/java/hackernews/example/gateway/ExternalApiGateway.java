package hackernews.example.gateway;

import hackernews.example.domain.ProviderNews;

public interface ExternalApiGateway {
	ProviderNews getHackerNews();
}
