package redissession.redissession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	/*@GetMapping
	public String home(HttpSession httpSession) {
		return "From read app: " +
				(httpSession.getAttribute("uuid") != null ? httpSession.getAttribute("uuid").toString() : "");
	}*/

	@GetMapping
	public String home(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		return "From read app: " +
				(httpSession.getAttribute("uuid") != null ? httpSession.getAttribute("uuid").toString() : "");
	}
}
