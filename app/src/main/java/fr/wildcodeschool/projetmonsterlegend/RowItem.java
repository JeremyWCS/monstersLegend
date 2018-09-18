package fr.wildcodeschool.projetmonsterlegend;

public class RowItem {
    private String monster_name;
    private int monster_pics_id;
    private int monsters_type_pic_id;


<<<<<<< Updated upstream
    public RowItem(String monster_name, int monster_pics, int monsters_type_pic){
        this.monster_name= monster_name;
        this.monster_pics_id = monster_pics;
        this.monsters_type_pic_id = monsters_type_pic;
=======
    public RowItem(String monster_name, int monster_pics, int monsters_type_pic_id){
        this.monster_name= monster_name;
        this.monster_pics_id = monster_pics;
        this.monsters_type_pic_id=monsters_type_pic_id
>>>>>>> Stashed changes
    }

    public String getMonster_name() {
        return monster_name;
    }

    public void setMonster_name(String monster_name) {
        this.monster_name = monster_name;
    }

    public int getMonster_pics_id() {
        return monster_pics_id;
    }

    public void setMonster_pics_id(int monster_pics_id) {
        this.monster_pics_id = monster_pics_id;
    }

    public int getMonsters_type_pic_id() {
        return monsters_type_pic_id;
    }

    public void setMonsters_type_pic_id(int monsters_type_pic_id) {
        this.monsters_type_pic_id = monsters_type_pic_id;
    }





    public int getMonsters_type_pic_id() {
        return monsters_type_pic_id;
    }

    public void setMonsters_type_pic_id(int monsters_type_pic_id) {
        this.monsters_type_pic_id = monsters_type_pic_id;
    }


}
