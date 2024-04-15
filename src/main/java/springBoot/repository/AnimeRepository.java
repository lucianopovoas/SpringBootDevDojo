package springBoot.repository;

import springBoot.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
