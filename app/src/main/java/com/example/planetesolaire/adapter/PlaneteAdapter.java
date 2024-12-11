package com.example.planetesolaire.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.planetesolaire.controller.PlaneteController;
import com.example.planetesolaire.view.DetailsActivity;
import com.example.planetesolaire.R;
import com.example.planetesolaire.modele.Planete;

import java.util.List;

public class PlaneteAdapter extends RecyclerView.Adapter<PlaneteAdapter.PlaneteViewHolder> {
    private final List<Planete> planetes;
    private final Context context;


    public PlaneteAdapter(Context context) {
        this.context = context;
        this.planetes = PlaneteController.init();
    }

    @NonNull
    @Override
    public PlaneteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planete, parent, false);
        return new PlaneteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaneteViewHolder holder, int position) {
        Planete planete = planetes.get(position);
        holder.textViewNom.setText(planete.getNom());
        holder.imageViewPhoto.setImageResource(planete.getPhotoResId());


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("nom", planete.getNom());
            intent.putExtra("photoResId", planete.getPhotoResId());
            intent.putExtra("distanceSoleil", planete.getDistanceSoleil());
            intent.putExtra("masse", planete.getMasse());
            intent.putExtra("periodeRevolution", planete.getPeriodeRevolution());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return PlaneteController.nbPlanetes();
    }

    public static class PlaneteViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNom;
        ImageView imageViewPhoto;

        public PlaneteViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.textViewNom);
            imageViewPhoto = itemView.findViewById(R.id.imageViewPhoto);
            textViewNom.setTypeface(null, Typeface.BOLD);
        }
    }
}
