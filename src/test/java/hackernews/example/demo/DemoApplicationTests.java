package hackernews.example.demo;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void date() {
		System.out.println(OffsetDateTime.parse ( "2020-03-05T14:16:44.000Z" , DateTimeFormatter.ofPattern ( "yyyy-MM-dd HH:mm:ss.SSSZ" ) ) );
	}
	
}
