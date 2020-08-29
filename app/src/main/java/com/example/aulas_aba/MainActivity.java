package com.example.aulas_aba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.aulas_aba.fragments.ContatosFragment;
import com.example.aulas_aba.fragments.ConversasFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {


    private SmartTabLayout abas;
    private ViewPager conteudo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abas = findViewById(R.id.viewpagertab);
        conteudo = findViewById(R.id.viewpager);

        getSupportActionBar().setElevation(0);

        FragmentPagerItemAdapter adaptador = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                .add(R.string.titulo_contatos, ContatosFragment.class)
                .add(R.string.titulo_conversas, ConversasFragment.class)
                .create()
        );
        conteudo.setAdapter(adaptador);
        abas.setViewPager(conteudo);
    }
}
