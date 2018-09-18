package fr.wildcodeschool.projetmonsterlegend;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter  {

    private Context context;
    private LayoutInflater layoutInflater;


    private Integer[] mainMonster;

    public ViewPagerAdapter(Context context, Monster monsters){
        this.context = context;
        mainMonster = new Integer[] {monsters.getMonster_pics_0(), monsters.getMonster_pics_1(), monsters.getMonster_pics_2(), monsters.getMonster_pics_3()};
    }
    @Override
    public int getCount() {
        return mainMonster.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_layout, null);
        ImageView customMonster = (ImageView) view.findViewById(R.id.customMonster);
        customMonster.setImageResource(mainMonster[position]);

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }


}
