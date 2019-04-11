package com.example.uliana.myattempt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private TransactionsAdapter transactionsAdapter;
    List <Transactions> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List <Transactions> adapterData = getDataList();
        //инициализируем адаптер
        transactionsAdapter = new TransactionsAdapter(MainActivity.this, adapterData);

        listView = findViewById(R.id.listView);
        listView.setAdapter(transactionsAdapter);

    }

    private List<Transactions> getDataList (){
        data.add(new Transactions("telephone ",200, "11.04.2019 "));
        data.add(new Transactions("cinema ",200,"11.04.2019" ));
        data.add(new Transactions("jeans ",200, "11.04.2019" ));
        return  data;
    }


}
