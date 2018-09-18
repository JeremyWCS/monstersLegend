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
    private String monster_info;
    private int type;
    private String[] attaques = new String[9];

    public Monster(int primaryColor, int secondaryColor, String monster_name, int monster_pics_0, int monster_pics_1, int monster_pics_2, int monster_pics_3, String monsterInfo, int type, String[] attaques){
        this.primaryColor=primaryColor;
        this.secondaryColor=secondaryColor;
        this.monster_name= monster_name;
        this.monster_pics_0 = monster_pics_0;
        this.monster_pics_1 = monster_pics_1;
        this.monster_pics_2 = monster_pics_2;
        this.monster_pics_3 = monster_pics_3;
        this.monster_info=monsterInfo;
        this.type=type;
        this.attaques=attaques;
    }

    public String getMonster_name() {
        return monster_name;
    }

    public void setMonster_name(String monster_name) {
        this.monster_name = monster_name;
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
}
