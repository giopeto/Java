package redissession.redissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

import static org.springframework.session.data.redis.RedisFlushMode.IMMEDIATE;

@SpringBootApplication
@RestController
@EnableRedisHttpSession(redisFlushMode = IMMEDIATE)
public class RedisSessionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionApplication.class, args);
	}

	@Bean
	public SessionFilter sessionFilter() {
		return new SessionFilter();
	}

	@GetMapping
	public String home(HttpSession httpSession) {
		UUID uuid = (UUID) httpSession.getAttribute("uuid");
		if (uuid == null) {
			uuid = UUID.randomUUID();
			httpSession.setAttribute("uuid", uuid);
		}

		return "From write app: " + uuid.toString();
	}
}
