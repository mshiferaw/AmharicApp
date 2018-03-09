// sets display and adds functionality to page with Amharic alphabet

package com.example.jiajiaz98.myfirstapp;

// import all necessary classes from other packages
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

// create a class that inherits all fields and methods of AppCombatActivity, a base class for
// activities that uses the support library action bar feature; this is a toolbar displayed at the
// top of most, if not all Android devices
// make sure the class is public so that it is available to other code that is not in the same
// package, such as AndroidManifest.xml
public class AlphabetActivity extends AppCompatActivity {

    // safer to use @override when overridng methods in "parent" class
    // allows compiler to check if method has been properly overridden
    @Override

    // saving the state of the app in a bundle prevents prior information from being lost if the
    // activity needs to be recreated, e.g. after an orientation change; it does so by passing it
    // back to OnCreate
    protected void onCreate(Bundle savedInstanceState) {

        // super tells the Virtual Machine to run the following piece of code in addition to the
        // OnCreate function defined in AppCompatActivity
        super.onCreate(savedInstanceState);

        // apply layout to page so that Amharic alphabet is displayed
        setContentView(R.layout.alphabet);

        // used code from: https://developer.android.com/guide/topics/ui/layout/gridview.html
        // access first gridview
        GridView gridview1 = findViewById(R.id.gridview1);

        // apply adapter to first gridview so that header is displayed properly
        gridview1.setAdapter(new HeaderAdapter(this));

        // access second gridview
        GridView gridview2 = findViewById(R.id.gridview2);

        // apply adapter to second gridview so that buttons are displayed and function properly
        gridview2.setAdapter(new ButtonAdapter(this));
    }
}
