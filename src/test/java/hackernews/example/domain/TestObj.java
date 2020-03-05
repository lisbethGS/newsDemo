package hackernews.example.domain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hackernews.example.domain.Hit;
import hackernews.example.domain.ProviderNews;

public class TestObj {
	
	public static ProviderNews getProviderNews() {
		ProviderNews provider = new ProviderNews();
		
		List<Hit> hitList =  new ArrayList<Hit>();
		hitList.add(getHit(1));
		hitList.add(getHit(2));
		provider.setHits(hitList);
		return provider;
	}

	public static Hit getHit(int id) {
		Hit hit  =  new Hit();
		hit.setStory_id(id);
		hit.setAuthor("author "+id);
		hit.setCreated_at("2020-03-03T18:54:19.000Z");
		hit.setStory_title("title "+id);
		return hit; 
	}
	
	public static Iterator<News> getIterableNews() {
		News news = new News();
		news.setAuthor("author");
		news.setCreationDate("date");
		news.setId(1);
		news.setTitle("title");
		List<News> newsList = new ArrayList<News>();
		return newsList.iterator(); 
	}
}
