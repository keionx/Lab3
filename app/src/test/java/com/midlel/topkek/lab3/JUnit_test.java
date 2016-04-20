package com.midlel.topkek.lab3;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by Jerry on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2
{
    MainActivity mainActivity;
    public JUnit_test()
    {
        super(MainActivity.class);
    }
    public void test_first()
    {
        mainActivity = (MainActivity) getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Bye World", tester);
    }
}
