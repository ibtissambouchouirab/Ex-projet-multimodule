package ma.ibi.parent.prez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"ma.ibi.parent"})
@EnableJpaRepositories(basePackages = {"ma.ibi.parent.infra"})
@EntityScan("ma.ibi.parent.infra")
public class PrezApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrezApplication.class, args);
	}

}
