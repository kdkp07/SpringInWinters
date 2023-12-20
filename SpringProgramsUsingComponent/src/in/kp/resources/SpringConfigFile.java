package in.kp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("in.kp.beans")
//@ComponentScan({"in.kp.beans"})
@ComponentScan(basePackages ={"in.kp.beans"})
public class SpringConfigFile {

}


// component is stereotype annotation which tells spring container that it needs to  create an object