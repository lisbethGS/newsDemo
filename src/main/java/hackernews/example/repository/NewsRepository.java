package hackernews.example.repository;

import org.springframework.data.repository.CrudRepository;

import hackernews.example.domain.News;


public interface NewsRepository extends CrudRepository<News, Integer>{

}
