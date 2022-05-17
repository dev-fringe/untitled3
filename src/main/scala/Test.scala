import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.{AnnotationConfigApplicationContext, Configuration}
import scala.annotation.Annotation

@main def i = new AnnotationConfigApplicationContext(classOf[Config]).getBean(classOf[Config])
