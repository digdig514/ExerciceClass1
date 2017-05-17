package com.example.digdig.exerciceclass1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.digdig.exerciceclass1.model.Employee;

import java.io.Serializable;
import java.util.ArrayList;

public class DetalisActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {
ListView listViewEmployee;
Button buttonFinish;
ArrayList<Employee> listOfEmployee;
ArrayAdapter<Employee> adpaterEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalis);
        initialize();

    }

    private void initialize() {
        listViewEmployee = (ListView) findViewById(R.id.listViewEmployee);
        listViewEmployee.setOnItemClickListener(this);
        buttonFinish = (Button) findViewById(R.id.button2);
        buttonFinish.setOnClickListener(this);
        Serializable serializable = getIntent().getSerializableExtra("Employee");
        listOfEmployee = (ArrayList<Employee>)serializable;
        adpaterEmployee = new ArrayAdapter<Employee>(this,android.R.layout.simple_list_item_1,listOfEmployee);
        listViewEmployee.setAdapter(adpaterEmployee);

    }

    @Override
    public void onClick(View v) {
        finish();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
