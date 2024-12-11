package com.example.planetesolaire.controller;

import android.content.Context;
import android.content.res.TypedArray;

import com.example.planetesolaire.R;
import com.example.planetesolaire.modele.Planete;

import java.util.ArrayList;
import java.util.List;

public class PlaneteController {

    private static Context context;
    public static List<Planete> planetes = new ArrayList<>();


    public static List<Planete> init(){
        if (planetes.isEmpty()){
            planetes.add(new Planete("Mercure", R.drawable.mercure, "57.91 million km", "3.3011×10^23 kg", "88 jours"));
            planetes.add(new Planete("Vénus", R.drawable.venus, "108.2 million km", "4.8675×10^24 kg", "225 jours"));
            planetes.add(new Planete("La Terre", R.drawable.terre, "149.6 million km", "5.972×10^24 kg", "365.25 jours"));
            planetes.add(new Planete("Mars", R.drawable.mars, "227.9 million km", "6.4171×10^23 kg", "687 jours"));
            planetes.add(new Planete("Jupiter",R.drawable.jupiter,"778 million km","1 898,19 × 10^24 kg","4,333 jours"));
            planetes.add(new Planete("Saturn",R.drawable.saturn,"1.43 milliard km","568,34 × 10^24 kg","10,759 jours"));
            planetes.add(new Planete("Uranus",R.drawable.uranus,"2.87 milliard km","86,813 ×10^24 kg","30,687"));
            planetes.add(new Planete("Neptune",R.drawable.neptune,"4.5 milliard km","102,413 ×10^24 kg","60,190"));
        }
        return planetes;
    }



/*
    public static List<Planete> init(Context context) {
        List<Planete> planetes = new ArrayList<>();

        String[] names = context.getResources().getStringArray(R.array.planet_names);
        String[] distances = context.getResources().getStringArray(R.array.planet_distances);
        String[] masses = context.getResources().getStringArray(R.array.planet_masses);
        String[] revolutions = context.getResources().getStringArray(R.array.planet_revolutions);
        int[] photos = context.getResources().getIntArray(R.array.planet_photos);

        for (int i = 0; i < names.length; i++) {
            planetes.add(new Planete(
                    names[i],
                    photos[i], 0),
                    distances[i],
                    masses[i],
                    revolutions[i]
            ));
        }

        photos.recycle();
        return planetes;
    }
*/

    public static int nbPlanetes(){
        return planetes.size();
    }
}
