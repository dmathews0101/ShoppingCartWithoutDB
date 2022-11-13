package com.shoppingcart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ShoppingCart> al_scitems;
    ListView lv_Items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Items = (ListView) findViewById(R.id.listViewItems);
        al_scitems = new ArrayList<>();

        al_scitems.add(new ShoppingCart("Chair","20","1",R.drawable.chair));
        al_scitems.add(new ShoppingCart("Jacket","10","3",R.drawable.jacket));
        al_scitems.add(new ShoppingCart("Pan","8","2",R.drawable.pan));
        al_scitems.add(new ShoppingCart("Pen","2","5",R.drawable.pen));
        al_scitems.add(new ShoppingCart("Shampoo","4","2",R.drawable.shampoo));
        al_scitems.add(new ShoppingCart("Shoe","5","1",R.drawable.shoe));
        al_scitems.add(new ShoppingCart("Shopping Cart","9","1",R.drawable.shopping_cart));
        al_scitems.add(new ShoppingCart("Soap","1","5",R.drawable.soap));
        al_scitems.add(new ShoppingCart("Table","13","2",R.drawable.table));
        al_scitems.add(new ShoppingCart("Tshirt","7","4",R.drawable.tshirt));

        listviewAdapter lvadapter = new listviewAdapter(getApplicationContext(), al_scitems);
        lv_Items.setAdapter(lvadapter);
    }
}
