package fr.wildcodeschool.projetmonsterlegend;

public class RowItem {
    private String monster_name;
    private int monster_pics_id;

    public RowItem(String monster_name, int monster_pics){
        this.monster_name= monster_name;
        this.monster_pics_id = monster_pics;
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


}
