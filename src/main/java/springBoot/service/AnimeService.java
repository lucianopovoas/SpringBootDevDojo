package springBoot.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import springBoot.domain.Anime;

import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animes = List.of(new Anime(1L,"DBZ"), new Anime(2L,"Berserk"));

    public List<Anime> listAll(){
        return animes;
    }

    public Anime buscarId(long id){
        return animes.stream().filter(anime -> anime.getId().equals(id)).findFirst().orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime não encontrado"));
    }

}
