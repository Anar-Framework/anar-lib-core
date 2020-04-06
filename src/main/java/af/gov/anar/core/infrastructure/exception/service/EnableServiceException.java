
package af.gov.anar.core.infrastructure.exception.service;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@SuppressWarnings("unused")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ServiceExceptionJavaConfiguration.class})
public @interface EnableServiceException {

}
