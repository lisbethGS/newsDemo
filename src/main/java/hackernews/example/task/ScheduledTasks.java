package hackernews.example.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import hackernews.example.service.ServiceNews;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
	
	@Autowired
    private ServiceNews saveNewsService;

	@Scheduled(fixedRate = 3600000)//
	public void reportCurrentTime() {
		log.info("Se actualiza la BD a las {}", dateFormat.format(new Date()));
		saveNewsService.saveNews();
	}
}