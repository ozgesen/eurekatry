package bilisim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 
 
// Spring bize  Eureka sunucusu oluşturmayı aşağıdaki notasyonu 
// kullanarak kolay bir şekilde sunmaktadır.
@EnableEurekaServer
// springboot projesi 
@SpringBootApplication
public class Application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    }
}