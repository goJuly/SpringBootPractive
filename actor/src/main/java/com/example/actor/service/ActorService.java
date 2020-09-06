package com.example.actor.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.actor.repository.Actor;
import com.example.actor.repository.ActorRepository;
import com.example.actor.repository.Catdata;
import com.example.actor.repository.CatdataRepository;
import com.example.actor.repository.Gender;

@Service
public class ActorService {
    final static Logger logger = LoggerFactory.getLogger(ActorService.class);
    @Autowired
    ActorRepository actorRepository;
    @Autowired
    CatdataRepository catdataRepository;
/**
 * Actorに猫に関する情報をセットしたリストを返却する。
 * @return 猫情報をセットしたList<Actor>
 */
    public List<Actor> getCatActor(){
        logger.debug("getCatActor");
        List<Actor> list = actorRepository.findAll();
        List<Catdata> catlist = catdataRepository.findAll();
        for (Actor actor: list) {
            Integer index = new Random().nextInt(list.size()-2);
            logger.debug(index.toString());
            Catdata catdata = catlist.get(index);
            Gender gender = actor.getGender();
            gender.setName(gender.getOthrename());
            actor.setGender(gender);
            actor.setName(catdata.getName());
          }
        return list;
    }

}
