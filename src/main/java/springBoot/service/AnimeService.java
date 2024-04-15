package springBoot.service;

import org.springframework.stereotype.Service;
import springBoot.domain.Anime;

import java.util.List;

@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1L,"DBZ"), new Anime(2L,"Berserk"));
    public static List<Anime> listAll(){
        return animes;
    }

    public static List<Anime> buscarId(){
        return animes.stream().filter();
    }
}
