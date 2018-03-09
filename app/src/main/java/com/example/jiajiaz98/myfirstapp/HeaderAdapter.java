// Adapter for second gridview: displays vowel sounds in fixed header on top of Amharic alphabet

package com.example.jiajiaz98.myfirstapp;

// import all necessary classes from other packages
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by shife on 12/3/2017.
 */

// used code from: https://developer.android.com/guide/topics/ui/layout/gridview.html
// create a class that inherits all fields and methods of BaseAdapter, a common base class used for
// an Adapter, an object that bridges the gap between an AdapterView and the underlying data for
// that view; an Adapter also creates a View for each item in the data set -- TextView in this case
class HeaderAdapter extends BaseAdapter {

    // create variable for context
    private Context mContext;

    // set it to context of current state of application in HeaderAdapter
    HeaderAdapter(Context c) {

        mContext = c;
    }

    // calculate number of items in data set represented by HeaderAdapter and
    public int getCount() {

        // return number of characters in character array
        return characters.length;
    }

    // get data item at specific position in data set
    public Object getItem(int position) {

        return null;
    }

    // get row ID of data item at specific position in data set
    public long getItemId(int position) {

        return 0;
    }

    // get View that displays data at specific position in data set
    public View getView(int position, View convertView, ViewGroup parent) {
        System.out.println("getview:" + position + " " + convertView);

        // create a new TextView for each item referenced by the Adapter
        TextView text;

        // if text is not recycled, aka is visible on screen, initialize some attributes
        if (convertView == null) {

            // use mContext to get information from another part of the program
            text = new TextView(mContext);

            // add padding to bottom of header
            text.setPadding(0, 0, 0, 10);

            // set size of text
            text.setTextSize(22);

            // center each letter
            text.setGravity(Gravity.CENTER);

            // set background color
            text.setBackgroundColor(Color.parseColor("#582A72"));

            // set color of each letter
            text.setTextColor(Color.WHITE);

        // otherwise, if TextView has been recycled, aka has been scrolled off screen and is no
        // longer visible
        } else {

            // declare text as recycled instance of TextView
            text = (TextView) convertView;
        }

        // define which character array to use
        // pick which letter in array to display on each TextView based on that TextView's position
        text.setText(characters[position]);

        // return TextView
        return text;
    }

    // create array of vowel sounds that are used as text displayed in header
    private CharSequence[] characters = {
            "a/e", "u", "ee", "a", "ae", "i", "o"
    };
}