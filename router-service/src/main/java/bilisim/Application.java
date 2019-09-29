package bilisim;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

 
@SpringBootApplication
//yük daðýlýmýný bu notasyon ile yapýyoruz
@EnableZuulProxy
//Eureka server 'a register olabilmesi için bu notasyonu ekliyoruz.
@EnableDiscoveryClient
public class Application 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}