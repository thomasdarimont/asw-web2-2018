package lab;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan // Required to find Servlet API components on class-path
public class Lab350SpringServletMeetingPlannerApp {

	public static void main(String[] args) {
		SpringApplication.run(Lab350SpringServletMeetingPlannerApp.class, args);
	}
}
