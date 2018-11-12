package com.example.aluno.appnavigation_anabeatriz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class Tela2Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        this.mViewHolder.spnCurso = (Spinner)  findViewById(R.id.spn_cursos);
        this.mViewHolder.ivImagemCurso = (ImageView)  findViewById(R.id.iv_imagem_curso);

        this.mViewHolder.spnCurso.setOnItemSelectedListener(this);





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String cursoSelecionado;
        cursoSelecionado = parent.getItemAtPosition(position).toString();

        if (cursoSelecionado.equalsIgnoreCase("Redes de Computadores")){
            this.mViewHolder.ivImagemCurso.setImageResource(R.drawable.imagesss);

        }
        if (cursoSelecionado.equalsIgnoreCase("Enfermagem")){
            this.mViewHolder.ivImagemCurso.setImageResource (R.drawable.mulher);

        }
        if (cursoSelecionado.equalsIgnoreCase("Comércio")){
            this.mViewHolder.ivImagemCurso.setImageResource (R.drawable.peppapig);

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private static class ViewHolder {
        Spinner spnCurso;
        ImageView ivImagemCurso;
    }
}
