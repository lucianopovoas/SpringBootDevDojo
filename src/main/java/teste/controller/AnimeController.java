package teste.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.domain.Anime;
import teste.util.DateUtil;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//@RestController Essa anotação indica que a classe AnimeController é um controlador que lida com solicitações HTTP e retorna os resultados diretamente como dados,
//sem necessidade de renderização para uma página HTML. Isso é adequado para construir APIs RESTful.
@RestController

//@RequestMapping("anime"): Essa anotação define o prefixo do URL para o controlador.
//Isso significa que todas as solicitações que começam com "/anime" serão manipuladas por métodos dentro dessa classe.
//localhost:8080/anime/
@RequestMapping("anime")

@Log4j2
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;

    //@GetMapping(path = "list"): Esta anotação mapeia solicitações HTTP GET para o método list() dentro do controlador.
    //O parâmetro path = "list" especifica que esse método será acionado quando a parte final do URL da solicitação for "/anime/list".
    //localhost:8080/anime/list
    @GetMapping(path = "list")

    //Este é o método que será chamado quando uma solicitação GET for feita para "/anime/list". Ele retorna uma lista de objetos Anime.
    public List<Anime> list(){

        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("abc"));
        animes.add(new Anime("cba"));
        return animes;
    }
}
