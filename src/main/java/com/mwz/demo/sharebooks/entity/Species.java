package com.mwz.demo.sharebooks.entity;

public class Species {


    public Species(String idspecies, String speciesname, String speciesnumber, String imgname) {
        this.idspecies = idspecies;
        this.speciesname = speciesname;
        this.speciesnumber = speciesnumber;
        this.imgname = imgname;
    }

    public Species() {
    }

      String idspecies;
      String speciesname;
      String speciesnumber;
      String imgname;

    public String getIdspecies() {
        return idspecies;
    }

    public void setIdspecies(String idspecies) {
        this.idspecies = idspecies;
    }

    public String getSpeciesname() {
        return speciesname;
    }

    public void setSpeciesname(String speciesname) {
        this.speciesname = speciesname;
    }

    public String getSpeciesnumber() {
        return speciesnumber;
    }

    public void setSpeciesnumber(String speciesnumber) {
        this.speciesnumber = speciesnumber;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname;
    }

}
