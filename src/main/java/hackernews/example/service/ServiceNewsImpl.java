package hackernews.example.service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hackernews.example.domain.Hit;
import hackernews.example.domain.News;
import hackernews.example.domain.ProviderNews;
import hackernews.example.gateway.ExternalApiGateway;
import hackernews.example.repository.NewsRepository;

@Service
public class ServiceNewsImpl implements ServiceNews {
	@Autowired
	ExternalApiGateway gateway;
	@Autowired
	NewsRepository newsRepository;

	@Override
	public void saveNews() {
		ProviderNews externalApiObj = gateway.getHackerNews();
		if (externalApiObj != null) {
			List<Hit> externalApiList = externalApiObj.getHits();
			if (externalApiList != null) {
				newsRepository.deleteAll();
				externalApiList.stream().filter(Objects::nonNull).filter(x -> x.getStory_id() > 0).forEach((p) -> {
					News news = new News();
					news.setAuthor(p.getAuthor());
					news.setId(p.getStory_id());
					news.setTitle(p.getStory_title());
					news.setCreationDate(p.getCreated_at());
					newsRepository.save(news);
				});
			}
		}
	}

	@Override
	public List<News> getAllNews() {
		return StreamSupport.stream(newsRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public boolean deleteNews(int id) {
		try {
			newsRepository.deleteById(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
