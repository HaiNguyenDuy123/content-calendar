package dev.nguyenduyhai.contentcalendar;


import dev.nguyenduyhai.contentcalendar.config.ContentCalendarProperties;
import dev.nguyenduyhai.contentcalendar.model.Content;
import dev.nguyenduyhai.contentcalendar.model.Status;
import dev.nguyenduyhai.contentcalendar.model.Type;
import dev.nguyenduyhai.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content(null,
					"12312332",
					"My 2323123123first blog post",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}

}
