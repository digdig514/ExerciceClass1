package com.example.digdig.exerciceclass1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.digdig.exerciceclass1.model.Employee;
import com.example.digdig.exerciceclass1.model.Person;

import java.util.ArrayList;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {
    ListView listViewPerson;
    ImageView imageViewPerson;
    Button buttonDisplay;
    ArrayList<Person> listOfPerson;
    ArrayList<Employee> listOfEmployee;
    ArrayAdapter<Person> adapterPerson;
    ArrayAdapter<Employee> adapterEmployee;
    int personPicture[]={R.drawable.person1,R.drawable.person2,R.drawable.person3,R.drawable.employee1,R.drawable.employee2};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        listViewPerson = (ListView) findViewById(R.id.listViewPerson);
        listViewPerson.setOnItemClickListener(this);
       buttonDisplay = (Button) findViewById(R.id.button);
        buttonDisplay.setOnClickListener(this);

        imageViewPerson = (ImageView) findViewById(R.id.imageView);
        listOfPerson = new ArrayList<Person>();
        // for use 2 list
        /*
        listOfEmployee = new ArrayList<Employee>();
        */
        Person per0 =  new Person("Diego",24,personPicture[0]),
               per1 = new Person("Marcelo",26,personPicture[1]),
               per2 =  new Person("Maria",23,personPicture[2]);
        Employee emp0 = new Employee("Ritt",29,personPicture[3],123,"IT",14200),
                 emp1 =  new Employee("Yanick",27,personPicture[4],31234,"Mobile Dev",23499);
        //add on Object All
        listOfPerson.add(per0);
        listOfPerson.add(per1);
        listOfPerson.add(per2);
        listOfPerson.add(emp0);
        listOfPerson.add(emp1);

        //add on Object Employer
        // to use 2 list
        /*
        listOfEmployee.add(emp0);
        listOfEmployee.add(emp1);
        */


        adapterPerson = new ArrayAdapter<Person>(this,android.R.layout.simple_list_item_1,listOfPerson);
        listViewPerson.setAdapter(adapterPerson);







    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
        imageViewPerson.setImageResource(listOfPerson.get(position).getPicture());
        int id = parent.getId();
        if (id == R.id.listViewPerson)
            Toast.makeText(this,"List View Seleted",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        ArrayList<Person> employeelist = new ArrayList<>();
        for (Person employee: listOfPerson)
        {
            if(employee instanceof Employee)
            {
                employeelist.add((employee));
            }
        }

        Intent i = new Intent(this,DetalisActivity.class);
        i.putExtra("Employee",employeelist);
        startActivity(i);


    }
}
