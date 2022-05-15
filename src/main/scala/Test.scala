import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.{AnnotationConfigApplicationContext, Configuration}
import scala.annotation.Annotation

@main def hello() = new AnnotationConfigApplicationContext().getBean(classOf[Test])

@Configuration
class Test {
}