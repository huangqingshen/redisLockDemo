package redislock.redisman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedismanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedismanApplication.class, args);
	}
}
