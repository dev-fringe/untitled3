import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("test");
    }
}
