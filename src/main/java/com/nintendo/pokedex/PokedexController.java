package com.nintendo.pokedex;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/pokemon")
public class PokedexController {
    ArrayList<Pokemon> pokemons = new ArrayList<>();
    
    private int ultimoId = 1;

    @GetMapping
    public ArrayList<Pokemon> lista(){
        return pokemons;
    }

    @PostMapping
    public void cadastrar (@RequestBody Pokemon pokemon){
        pokemon.setId(ultimoId);
        pokemons.add(pokemon);
        ultimoId++;
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable int id){
        Pokemon pokemonEncontrado = null;
        
        for(Pokemon pokemon : pokemons){
            if(pokemon.getId() == id){
                pokemonEncontrado = pokemon;
                break;
            }
        }

        if(pokemonEncontrado != null ){
            pokemons.remove(pokemonEncontrado);
            return;
        }
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
     }
}


