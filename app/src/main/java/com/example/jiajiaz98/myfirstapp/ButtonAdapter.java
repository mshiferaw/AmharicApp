// Adapter for first gridview: adds functionality to each button and displays Amharic alphabet

package com.example.jiajiaz98.myfirstapp;

// import all necessary classes from other packages
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

/**
 * Created by shife on 12/1/2017.
 */

// used code from: https://developer.android.com/guide/topics/ui/layout/gridview.html
// create a class that inherits all fields and methods of BaseAdapter, a common base class used for
// an Adapter, an object that bridges the gap between an AdapterView and the underlying data for
// that view; an Adapter also creates a View for each item in the data set -- a Button in this case
class ButtonAdapter extends BaseAdapter {
    private Context mContext;

    // set it to context of current state of application in ButtonAdapter
    public ButtonAdapter(Context c) {
        mContext = c;
    }

    // calculate number of items in data set represented by HeaderAdapter
    public int getCount() {
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

    public View getView(final int position, View convertView, ViewGroup parent) {
        System.out.println("getview:"+position+" "+convertView);

        // create a new Button for each item referenced by the Adapter
        Button button;

        // if button is not recycled, aka is visible, initialize some attributes
        if (convertView == null) {

            // use mContext to get information from another part of the program
            button = new Button(mContext);

            // set size of text on buttons
            button.setTextSize(22);

        // otherwise, if it has been recycled and is not visible
        } else {

            // declare button as recycled instance of Button
            button = (Button) convertView;
        }

        // define which character array to use
        // pick which letter in array to display on each button based on that button's position
        button.setText(characters[position]);

        // used code from: https://developer.android.com/reference/android/widget/Button.html
        // start new activity when a button is clicked on
        // if the position of the cell is 0, start new activity when a button is clicked on
        if (position == 0) {
            button.setOnClickListener(new OnClickListener() {

                // upon click, take user from current page that displays Amharic alphabet
                // to practice page, where user can practice writing
                @Override
                public void onClick(View v) {

                    // used code from: https://teamtreehouse.com/community/how-do-i-make-a-button-go
                    // -to-another-pagelayout-in-android-studio
                    // upon click, take user from current page that displays Amharic alphabet
                    // to practice page, where user can practice writing
                    Intent intent = new Intent(mContext, practice.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 1) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice2.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 2) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice3.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 3) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice4.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 4) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice5.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 5) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice6.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 6) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice7.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 7) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice8.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 8) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice9.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 9) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice10.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 10) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice11.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 11) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice12.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 12) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice13.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 13) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice14.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 14) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice15.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 15) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice16.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 16) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice17.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 17) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice18.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 18) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice19.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 19) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice20.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 20) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice21.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 21) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice22.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 22) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice23.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 23) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice24.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 24) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice25.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 25) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice26.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 26) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice27.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 27) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice28.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 28) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice29.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 29) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice30.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 30) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice31.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 31) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice32.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 32) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice33.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 33) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice34.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 34) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice35.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 35) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice36.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 36) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice37.class);
                    mContext.startActivity(intent);
                }
            });
        }
        if (position == 37) {
            button.setOnClickListener(new OnClickListener() {

                // upon click, take user from current page that displays Amharic alphabet
                // to practice page, where user can practice writing
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice38.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 38) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice39.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 39) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice40.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 40) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice41.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 41) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice42.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 42) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice43.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 43) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice44.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 44) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice45.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 45) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice46.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 46) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice47.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 47) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice48.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 48) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice49.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 49) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice50.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 50) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice51.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 51) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice52.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 52) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice53.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 53) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice54.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 54) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice55.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 55) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice56.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 56) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice57.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 57) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice58.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 58) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice59.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 59) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice60.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 60) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice61.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 61) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice62.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 62) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice63.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 63) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice64.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 64) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice65.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 65) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice66.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 66) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice67.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 67) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice68.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 68) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice69.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 69) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice70.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 70) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice71.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 71) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice72.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 72) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice73.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 73) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice74.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 74) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice75.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 75) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice76.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 76) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice77.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 77) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice78.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 78) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice79.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 79) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice80.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 70) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice81.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 81) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice82.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 82) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice83.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 83) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice84.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 84) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice85.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 85) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice86.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 86) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice87.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 87) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice88.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 88) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice89.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 89) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice90.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 90) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice91.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 91) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice92.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 92) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice93.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 93) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice94.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 94) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice95.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 95) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice96.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 96) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice97.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 97) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice98.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 98) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice99.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 99) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice100.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 100) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice101.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 101) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice102.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 102) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice103.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 103) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice104.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 104) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice105.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 105) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice106.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 106) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice107.class);
                    mContext.startActivity(intent);
                }
            });
        }
        if (position == 107) {
            button.setOnClickListener(new OnClickListener() {

                // upon click, take user from current page that displays Amharic alphabet
                // to practice page, where user can practice writing
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice108.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 108) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice109.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 109) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice110.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 110) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice111.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 111) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice112.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 112) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice113.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 113) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice114.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 114) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice115.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 115) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice116.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 116) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice117.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 117) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice118.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 118) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice119.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 119) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice120.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 120) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice121.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 121) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice122.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 122) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice123.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 123) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice124.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 124) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice125.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 125) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice126.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 126) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice127.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 127) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice128.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 128) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice129.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 129) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice130.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 130) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice131.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 131) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice132.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 132) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice133.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 133) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice134.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 134) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice135.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 135) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice136.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 136) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice137.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 137) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice138.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 138) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice139.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 139) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice140.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 140) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice141.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 141) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice142.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 142) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice143.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 143) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice144.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 144) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice145.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 145) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice146.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 146) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice147.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 147) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice148.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 148) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice149.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 149) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice150.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 150) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice151.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 151) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice152.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 152) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice153.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 153) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice154.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 154) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice155.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 155) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice156.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 156) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice157.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 157) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice158.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 158) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice159.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 159) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice160.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 160) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice161.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 161) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice162.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 162) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice163.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 163) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice164.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 164) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice165.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 165) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice166.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 166) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice167.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 167) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice168.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 168) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice169.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 169) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice170.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 170) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice171.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 171) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice172.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 172) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice173.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 173) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice174.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 174) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice175.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 175) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice176.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 176) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice177.class);
                    mContext.startActivity(intent);
                }
            });
        }
        if (position == 177) {
            button.setOnClickListener(new OnClickListener() {

                // upon click, take user from current page that displays Amharic alphabet
                // to practice page, where user can practice writing
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice178.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 178) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice179.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 179) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice180.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 180) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice181.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 181) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice182.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 182) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice183.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 183) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice184.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 184) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice185.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 185) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice186.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 186) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice187.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 187) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice188.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 188) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice189.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 189) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice190.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 190) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice191.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 191) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice192.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 192) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice193.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 193) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice194.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 194) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice195.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 195) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice196.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 196) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice197.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 197) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice198.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 198) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice199.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 199) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice200.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 200) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice201.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 201) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice202.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 202) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice203.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 203) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice204.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 204) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice205.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 205) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice206.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 206) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice207.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 207) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice208.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 208) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice209.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 209) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice210.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 210) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice211.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 211) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice212.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 212) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice213.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 213) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice214.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 214) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice215.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 215) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice216.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 216) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice217.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 217) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice218.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 218) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice219.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 219) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice220.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 220) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice221.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 221) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice222.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 222) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice223.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 223) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice224.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 224) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice225.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 225) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice226.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 226) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice227.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 227) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice228.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 228) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice229.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 229) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice230.class);
                    mContext.startActivity(intent);
                }
            });
        }

        if (position == 230) {
            button.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, practice231.class);
                    mContext.startActivity(intent);
                }
            });
        }

        // return Button
        return button;
    }

    // create array of Amharic letters that are displayed on buttons
    private CharSequence[] characters = {
            "ሀ","ሁ","ሂ","ሃ","ሄ","ህ","ሆ",
            "ለ","ሉ","ሊ","ላ","ሌ","ል","ሎ",
            "ሐ","ሑ","ሒ","ሓ","ሔ","ሕ","ሖ",
            "መ","ሙ","ሚ","ማ","ሜ","ም","ሞ",
            "ሠ","ሡ","ሢ","ሣ","ሤ","ሥ","ሦ",
            "ረ","ሩ","ሪ","ራ","ሬ","ር","ሮ",
            "ሰ","ሱ","ሲ","ሳ","ሴ","ስ","ሶ",
            "ሸ","ሹ","ሺ","ሻ","ሼ","ሽ","ሾ",
            "ቀ","ቁ","ቂ","ቃ","ቄ","ቅ","ቆ",
            "በ","ቡ","ቢ","ባ","ቤ","ብ","ቦ",
            "ተ","ቱ","ቲ","ታ","ቴ","ቲ","ቶ",
            "ቸ","ቹ","ቺ","ቻ","ቼ","ች","ቾ",
            "ኀ","ኁ","ኂ","ኃ","ኄ","ኅ","ኆ",
            "ነ","ኑ","ኒ","ና","ኔ","ን","ኖ",
            "ኘ","ኙ","ኚ","ኛ","ኜ","ኝ","ኞ",
            "አ","ኡ","ኢ","ኣ","ኤ","ኢ","ኦ",
            "ከ","ኩ","ኪ","ካ","ኬ","ክ","ኮ",
            "ኸ","ኹ","ኺ","ኻ","ኼ","ኽ","ኾ",
            "ወ","ዉ","ዊ","ዋ","ዌ","ው","ዎ",
            "ዐ","ዑ","ዒ","ዓ","ዔ","ዕ","ዖ",
            "ዘ","ዙ","ዚ","ዛ","ዜ","ዝ","ዞ",
            "ዠ","ዡ","ዢ","ዣ","ዤ","ዥ","ዦ",
            "የ","ዩ","ዪ","ያ","ዬ","ይ","ዮ",
            "ደ","ዱ","ዲ","ዳ","ዴ","ድ","ዶ",
            "ጀ","ጁ","ጂ","ጃ","ጄ","ጅ","ጆ",
            "ገ","ጉ","ጊ","ጋ","ጌ","ግ","ጎ",
            "ጠ","ጡ","ጢ","ጣ","ጤ","ጥ","ጦ",
            "ጨ","ጩ","ጪ","ጫ","ጬ","ጭ","ጮ",
            "ጰ","ጱ","ጲ","ጳ","ጴ","ጵ","ጶ",
            "ጸ","ጹ","ጺ","ጻ","ጼ","ጺ","ጾ",
            "ፀ","ፁ","ፂ","ፃ","ፄ","ፅ","ፆ",
            "ፈ","ፉ","ፊ","ፋ","ፌ","ፍ","ፎ",
            "ፐ","ፑ","ፒ","ፓ","ፔ","ፕ","ፖ"
    };
}