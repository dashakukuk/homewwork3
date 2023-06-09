package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {


    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.list_animal);


        AnimalAdapter adapter = new AnimalAdapter(this, animals);


        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        animals.add( new Animal("Марс", "Четвёртая по удалённости от Солнца и седьмая по размеру планета Солнечной системы",
                R.drawable.mars, "Спутника 2"));
        animals.add( new Animal("Юпитер", "Пятая планета от Солнца и самая большая в Солнечной системе. Это газовый гигант с массой, более чем в два с половиной раза превышающей массу всех других планет Солнечной системы",
                R.drawable.ypiter, "Спутников 95"));
        animals.add( new Animal("Сатурн", "Газовый гигант, состоящий преимущественно из водорода и гелия",
                R.drawable.satyrn, "Спутника 63"));
        animals.add( new Animal("Уран", "Планета Солнечной системы, седьмая по удалённости от Солнца, третья по диаметру и четвёртая по массе.",
                R.drawable.yran, "Cпутников 27"));
        animals.add( new Animal("Нептун", "Восьмая и самая дальняя от Солнца планета Солнечной системы. Его масса превышает массу Земли в 17,2 раза",
                R.drawable.neptyn, "Спутников 14"));
    }
}