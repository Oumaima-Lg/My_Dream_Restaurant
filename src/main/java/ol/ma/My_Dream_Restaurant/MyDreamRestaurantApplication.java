package ol.ma.My_Dream_Restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableJpaRepositories("ol.ma.My_Dream_Restaurant.repo") 
// @EntityScan("ol.ma.My_Dream_Restaurant.model")
@SpringBootApplication
public class MyDreamRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDreamRestaurantApplication.class, args);
	}

}
