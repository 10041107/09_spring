package com.ojiraphers.section02.annotation.subsection05.inject;

import com.ojiraphers.section02.common.Pokemon;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Service("pokemonServiceInject")
public class PokemonService {

//    1. 필드 기반 주입
//    @Inject
//    @Named("pikachu")
    private Pokemon pokemon;
//    2. 생성자 기반 주입
//    @Inject
//    public PokemonService(@Named("pikachu") Pokemon pokemon) {
//        this.pokemon = pokemon;
//    }

//    3. setter기반 주입
    public void setPokemon(@Named("pikachu") Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Inject
    public void pokemonAttack(){
        pokemon.attack();

    }



}
