// sets display and adds functionality to homepage

package com.example.jiajiaz98.myfirstapp;

// import all necessary classes from other packages
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// create a class that inherits all fields and methods of AppCombatActivity, a base class for
// activities that uses the support library action bar feature; this is a toolbar displayed at the
// top of most, if not all Android devices
// make sure the class is public so that it is available to other code that is not in the same
// package, such as AndroidManifest.xml
public class MainActivity extends AppCompatActivity {

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

        // apply layout to page so that homepage is displayed
        setContentView(R.layout.splash_page);
    }

    // used code from: https://www.androidauthority.com/build-an-android-app-part-1-672979/
    // start new activity when anywhere on page is clicked on
    public void onSplashPageClick(View view) {

        // used code from: https://teamtreehouse.com/community/how-do-i-make-a-button-go-to-another-
        // pagelayout-in-android-studio
        // upon click, take user from homepage to page with Amharic alphabet
        Intent intent = new Intent(this, AlphabetActivity.class);
        startActivity(intent);
    }
}