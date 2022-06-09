package com.example.newapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class fream_view extends AppCompatActivity {


    private ImageView right_btn;
    public String[] no = {"aple", "ball", "cat", "dog", "eat", "false", "god", "hose"};
    public boolean[] n = {true, false, true, false, true, false, false, false};
    private AlertDialog alertDialog;
    private CardView yes_btn, no_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fream_view);
        blinding();
        right_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


//            showdialog();
                custom_dialog();
            }
        });

    }

    private void blinding() {
        right_btn = findViewById(R.id.right_btn);
    }

    //    void showdialog() {
////        alertDialog =new AlertDialog.Builder(fream_view.this)
////             .setMultiChoiceItems(no, n, new DialogInterface.OnMultiChoiceClickListener() {
////                 @Override
////                 public void onClick(DialogInterface dialogInterface, int i, boolean b) {
////
////                     if(b==true)
////                     {
////                         Toast.makeText(fream_view.this, no[i]+""+b, Toast.LENGTH_SHORT).show();
////                     }
////
////                 }
////             })
////        .create();
////        alertDialog.show();
//
//
//
////        AlertDialog alertDialog=new AlertDialog.Builder(fream_view.this)
////
////                .setSingleChoiceItems(no, 2, new DialogInterface.OnClickListener() {
////                    @Override
////                    public void onClick(DialogInterface dialogInterface, int i) {
////
////                    }
////                })
////                .create();
////        alertDialog.show();
//    }
    void custom_dialog() {

        Dialog dialog = new Dialog(fream_view.this);
        dialog.setContentView(R.layout.diaog_item);
    dialog.setCancelable(false);
        yes_btn = dialog.findViewById(R.id.yes_btn);
        no_btn = dialog.findViewById(R.id.no_btn);
        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finishAffinity();
            }
        });


        no_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialog.dismiss();

            }
        });
        dialog.show();


    }
}