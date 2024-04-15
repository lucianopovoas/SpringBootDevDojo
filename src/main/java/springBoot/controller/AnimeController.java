package springBoot.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springBoot.domain.Anime;
import springBoot.service.AnimeService;
import springBoot.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
public class AnimeController {

    @Autowired
    private DateUtil dateUtil;
    private AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> lista(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(AnimeService.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> buscarId(){
        return new ResponseEntity<>(AnimeService.listAll().get(0), HttpStatus.OK);
    }

}
