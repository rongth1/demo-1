package sangeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author rth
 * @description: TODO
 * @date 2022/11/26
 */
@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(SecurityApplication.class, args);
        System.out.println(app);
    }

}
