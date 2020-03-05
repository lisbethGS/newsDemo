package hackernews.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hackernews.example.domain.News;
import hackernews.example.service.ServiceNews;



@RestController
public class HackerNewsController {
	
	@Autowired
	ServiceNews service;

	@GetMapping("/getAllNews")
	public @ResponseBody List<News> getAllNews() {
		return service.getAllNews();
	}
	@GetMapping("/delete")
	public @ResponseBody boolean delete(@RequestParam(required = true, value = "id") int id) {
		return service.deleteNews(id);
	}
	
}
