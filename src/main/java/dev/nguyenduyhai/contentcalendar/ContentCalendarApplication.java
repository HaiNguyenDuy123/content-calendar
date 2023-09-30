package dev.nguyenduyhai.contentcalendar;


import dev.nguyenduyhai.contentcalendar.model.Content;
import dev.nguyenduyhai.contentcalendar.model.Status;
import dev.nguyenduyhai.contentcalendar.model.Type;
import dev.nguyenduyhai.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(1,
					"my first page",
					"My first post",
					Status.IDEA,
					Type.ARTICLE,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}
}
