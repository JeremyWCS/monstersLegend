package fr.wildcodeschool.projetmonsterlegend;

import android.graphics.drawable.Drawable;

public class Monster {
    int primaryColor;
    int secondaryColor;
    private String monster_name;
    private int monster_pics_0;
    private int monster_pics_1;
    private int monster_pics_2;
    private int monster_pics_3;
    private int habitat;
    private String monster_info;
    private int type;
    private String[] attaques;
    private int aStamina;
    private int aForce;
    private int aSpeed;
    private int aLife;
    private int bStamina;
    private int bForce;
    private int bSpeed;
    private int bLife;
    private int[] attakType;


    public Monster(int primaryColor, int secondaryColor, String monster_name, int monster_pics_0, int monster_pics_1, int monster_pics_2, int monster_pics_3,int habitat, String monsterInfo, int type, String[] attaques, int aStamina, int aForce, int aSpeed, int aLife
    ,int bStamina, int bForce, int bSpeed, int bLife, int[] attakType){
        this.primaryColor=primaryColor;
        this.secondaryColor=secondaryColor;
        this.monster_name= monster_name;
        this.monster_pics_0 = monster_pics_0;
        this.monster_pics_1 = monster_pics_1;
        this.monster_pics_2 = monster_pics_2;
        this.monster_pics_3 = monster_pics_3;
        this.habitat=habitat;
        this.monster_info=monsterInfo;
        this.type=type;
        this.attaques=attaques;
        this.aStamina=aStamina;
        this.aForce=aForce;
        this.aSpeed=aSpeed;
        this.aLife=aLife;
        this.bStamina=bStamina;
        this.bForce=bForce;
        this.bSpeed=bSpeed;
        this.bLife=bLife;
        this.attakType=attakType;
    }

    public String getMonster_name() {
        return monster_name;
    }

    public void setMonster_name(String monster_name) {
        this.monster_name = monster_name;
    }

    public void setHabitat(int habitat) {
        this.habitat = habitat;
    }

    public int getHabitat() {
        return habitat;
    }

    public int getMonster_pics_0() {

        return monster_pics_0;
    }

    public void setMonster_pics_0(int monster_pics_id) {
        this.monster_pics_0 = monster_pics_id;
    }

    public int getMonster_pics_1() {

        return monster_pics_1;
    }

    public void setMonster_pics_1(int monster_pics_id) {
        this.monster_pics_1 = monster_pics_id;
    }
    public int getMonster_pics_2() {

        return monster_pics_2;
    }

    public void setMonster_pics_2(int monster_pics_id) {
        this.monster_pics_2 = monster_pics_id;
    }

    public int getMonster_pics_3() {

        return monster_pics_3;
    }

    public void setMonster_pics_3(int monster_pics_id) {
        this.monster_pics_3 = monster_pics_id;
    }

    public String getMonster_info() {

        return monster_info;
    }

    public void setMonster_info(String monster_info) {
        this.monster_info = monster_info;
    }

    public void setType(int monster_type) {
        this.type = monster_type;
    }

    public int getType() {

        return type;
    }

    public int getPrimaryColor() {
        return primaryColor;
    }

    public int getSecondaryColor() {
        return secondaryColor;
    }



    public void setPrimaryColor(int primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setSecondaryColor(int secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String[] getAttaques() {
        return attaques;
    }

    public void setAttaques(String[] attaques) {
        this.attaques = attaques;
    }

    public int getaForce() {
        return aForce;
    }

    public int getaLife() {
        return aLife;
    }

    public int getaSpeed() {
        return aSpeed;
    }

    public int getaStamina() {
        return aStamina;
    }

    public void setaForce(int aForce) {
        this.aForce = aForce;
    }

    public void setaLife(int aLife) {
        this.aLife = aLife;
    }

    public void setaSpeed(int aSpeed) {
        this.aSpeed = aSpeed;
    }

    public void setaStamina(int aStamina) {
        this.aStamina = aStamina;
    }

    public int getbForce() {
        return bForce;
    }

    public int getbLife() {
        return bLife;
    }

    public int getbSpeed() {
        return bSpeed;
    }

    public int getbStamina() {
        return bStamina;
    }

    public void setbForce(int bForce) {
        this.bForce = bForce;
    }

    public void setbLife(int bLife) {
        this.bLife = bLife;
    }

    public void setbSpeed(int bSpeed) {
        this.bSpeed = bSpeed;
    }

    public void setbStamina(int bStamina) {
        this.bStamina = bStamina;
    }

    public int[] getAttakType() {
        return attakType;
    }

    public void setAttakType(int[] attakType) {
        this.attakType = attakType;
    }
}
