package bilisim;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

 
@SpringBootApplication
//y�k da��l�m�n� bu notasyon ile yap�yoruz
@EnableZuulProxy
//Eureka server 'a register olabilmesi i�in bu notasyonu ekliyoruz.
@EnableDiscoveryClient
public class Application 
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}