package com.example.shweta.listview_floating_popup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton FAB;
    ListView listview;
    Context context;
    FloatingActionButton FAB1;
    FloatingActionButton FAB2;
    FloatingActionButton FAB3;
    FloatingActionButton FAB4;
      public static String[]Array={"Note1","Note2","Note3","Note4","Note5","Note6","Note7","Note8","Note9","Note10","Note11","Note12","Note13","Note14","Note15",};
    public static int[]Image={R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30,R.drawable.note30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview= (ListView) findViewById(R.id.listView);
        context=this;
        listview.setAdapter(new ListAdapter(MainActivity.this,Image,Array));



        FAB= (FloatingActionButton) findViewById(R.id.FAB);

        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                LayoutInflater inflater =LayoutInflater.from(MainActivity.this);
                View View = inflater.inflate(R.layout.floating,null);
                builder.setView(View);
                AlertDialog dialog=builder.create();
                dialog.show();
                dialog.setCancelable(true);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            }
        });
//        FAB1= (FloatingActionButton) findViewById(R.id.fab1);
//        FAB1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Make Notes",Toast.LENGTH_LONG).show();
//            }
//        });
//        FAB2= (FloatingActionButton) findViewById(R.id.fab2);
//FAB2.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        Toast.makeText(getApplicationContext(),"Search Note",Toast.LENGTH_LONG).show();
//    }
//});
//        FAB3= (FloatingActionButton) findViewById(R.id.fab3);
//        FAB3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Text instead of image",Toast.LENGTH_LONG).show();
//            }
//        });
//        FAB4= (FloatingActionButton) findViewById(R.id.fab4);
//        FAB4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"Share this",Toast.LENGTH_LONG).show();
//            }
//        });
    }
}
