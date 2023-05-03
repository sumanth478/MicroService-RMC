package com.nagra.microservice.controller;

public class CharacterResponse {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  /*  public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String status;
    private String species;
    private String gender;*/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String image;

    public CharacterResponse() {
    }

    public CharacterResponse(String name, String status, String species, String gender,String image) {
        this.name = name;
      //  this.status = status;
        //this.species = species;
        //this.gender = gender;
        this.image=image;
    }
}
