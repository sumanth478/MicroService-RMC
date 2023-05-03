package com.nagra.microservice.controller;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController
{
    private final String API_URL = "https://rickandmortyapi.com/api/character";
  //  @GetMapping("/characters/{id}")
   // public CharacterResponse getCharacter(@PathVariable int id) {
   /*    RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + id;

        ResponseEntity<CharacterResponse> responseEntity = restTemplate.getForEntity(url, CharacterResponse.class);
        CharacterResponse characterResponse = responseEntity.getBody();
        Character character = new Character();
        character.setName(characterResponse.getName());
        character.setStatus(characterResponse.getStatus());
        character.setSpecies(characterResponse.getSpecies());
        character.setGender(characterResponse.getGender());

        return characterResponse;
    }*/
    @GetMapping("/api/v1/characters/")
    public List<CharacterResponse> getCharacterByName(@RequestParam String name){
        System.out.println(name);
        RestTemplate restTemplate=new RestTemplate();
        String url=API_URL + "?name=" +name;
        System.out.println(url);
         ResponseEntity<CharacterListResponse> responseEntity=restTemplate.getForEntity(url,CharacterListResponse.class);
         CharacterListResponse characterListResponse=responseEntity.getBody();

        List<CharacterResponse> characters = new ArrayList<>();

        for (CharacterResponse characterResponse : characterListResponse.getResults()) {
          //  CharacterResponse character = new CharacterResponse();
            characterResponse.setId(characterResponse.getId());
            characterResponse.setName(characterResponse.getName());

            characterResponse.setImage(characterResponse.getImage());

            characters.add(characterResponse);
        }

        return characters;

    }

}
