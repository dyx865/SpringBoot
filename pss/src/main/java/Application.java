import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value="/sys")
@EnableAutoConfiguration
public class Application {
	  @RequestMapping(value="/home")
	  @ResponseBody
      public String home(){
    	  return "hello word !";
      }
	  public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	  }
}
