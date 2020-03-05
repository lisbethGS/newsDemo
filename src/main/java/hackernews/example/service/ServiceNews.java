package hackernews.example.service;

import java.util.List;

import hackernews.example.domain.News;

public interface ServiceNews {
	void saveNews();
	List<News> getAllNews();
	boolean deleteNews(int id);
}
