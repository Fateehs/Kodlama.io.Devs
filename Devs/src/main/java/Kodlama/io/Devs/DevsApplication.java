package Kodlama.io.Devs;

<<<<<<< HEAD
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);
	}

}
>>>>>>> branch 'master' of https://github.com/Fateehs/Kodlama.io.Devs.git
