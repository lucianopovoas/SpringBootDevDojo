package teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import teste.domain.Anime;

import java.util.ArrayList;
import java.util.List;

//@RestController Essa anotação indica que a classe AnimeController é um controlador que lida com solicitações HTTP e retorna os resultados diretamente como dados,
//sem necessidade de renderização para uma página HTML. Isso é adequado para construir APIs RESTful.
@RestController

//@RequestMapping("anime"): Essa anotação define o prefixo do URL para o controlador.
//Isso significa que todas as solicitações que começam com "/anime" serão manipuladas por métodos dentro dessa classe.
//localhost:8080/anime/
@RequestMapping("anime")

public class AnimeController {

    //@GetMapping(path = "list"): Esta anotação mapeia solicitações HTTP GET para o método list() dentro do controlador.
    //O parâmetro path = "list" especifica que esse método será acionado quando a parte final do URL da solicitação for "/anime/list".
    //localhost:8080/anime/list
    @GetMapping(path = "list")

    //Este é o método que será chamado quando uma solicitação GET for feita para "/anime/list". Ele retorna uma lista de objetos Anime.
    public List<Anime> list(){
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("abc"));
        animes.add(new Anime("cba"));
        return animes;
    }
}
