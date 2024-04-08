package teste.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration: Esta anotação ativa a configuração automática do Spring Boot,
//permitindo que ele configure automaticamente o aplicativo com base nas dependências e nas configurações padrão.
@EnableAutoConfiguration

//@ComponentScan(basePackages = "teste"): Esta anotação diz ao Spring para escanear o pacote "teste" e seus subpacotes em busca de componentes a serem gerenciados,
//como controladores, serviços e outros componentes do Spring.
@ComponentScan(basePackages = "teste")

public class ApplicationStart {
    public static void main(String[] args) {
        //Esta linha inicia o aplicativo Spring Boot. Ele passa a classe ApplicationStart.class como argumento,
        //o que indica ao Spring Boot para usar essa classe como ponto de entrada para configurar e iniciar o aplicativo.
        SpringApplication.run(ApplicationStart.class, args);
    }
}
