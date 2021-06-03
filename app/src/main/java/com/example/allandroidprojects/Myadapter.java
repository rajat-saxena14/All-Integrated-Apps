package com.example.allandroidprojects;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Myadapter extends BaseAdapter {
    Activity a;
    ImageView i1;
    TextView t1,t2;

    String name[]={" 1. Android Activity Lifecycle", " 2. Intents", " 3. Multiple Intents"," 4. Button"," 5. Calculator"," 6. Facebook"," 7. Radio Image"," 8. Checkbox", " 9. Checkbox Dialog"," 10. Toggle and Switch Button"," 11. Static Fragment"," 12. Dynamic Fragment"," 13. FragCommunication"," 14. Progress Bar"," 15. SeekBar"," 16. Web Browser"," 17. Simple Music Player"," 18. Custom Music Player"," 19. Video Player"," 20. Alert Box"," 21. Custom Alert Box"," 22. Menus in Android"," 23. List View"," 24. Custom Toast"," 25. Notifications"," 26. Notification Action Input"," 27. Shared Preferences"," 28. Preference Activity"," 29. Menu With Settings"," 30. SQLITE Database"," 31. Content Provider"," 32. Services in Android"," 33. AsyncTask"," 34. Server Registration"};
    String channel[]={" When User Interacts with the Apps,\n Activities Move into Different States,\n Displayed With Corresponding Toasts :)", " Now Move From One Activity to Another!", " In a Single Activity"," Use of Button by Posting Data Through\n Form"," Checkout Our New Modern Calculator\n Made Using Linear Layout!"," Facebook Page\n Made Using Relative Layout"," Now Display Images on the Click of Radio\n Buttons!"," Make Images Visible or Invisible With the\n Help of Checkboxes"," Displays Toasts Using Checkboxes Inside\n Custom Alert Dialog"," Show/Hide Images Using Switch and\n Toggle Button"," Static Fragment is Included in an XML File\n Using a Fragment Tag Within Another \n XML Layout"," Dynamic Fragment is Created in\n Association with the FragmentManager"," We Can Send Data From a Fragment to an\n Activity & Then to Another Fragment"," Now Track the Progress of Your\n Downloading Tasks!"," User Can Drag the Thum Left & Right to\n Increase or Decrease the text size"," Now Browse Your Favorite Sites Wildly!"," You Can Play/Stop Audio and Also Seek\n to Any Location"," Checkout My New Customized Music\n Player! It Automatically Fetch Out MP3\n Files From Storage & Can Change Theme"," You Can Play/Pause, Fast Forward/\n Backward Videos & also Seek to Any\n Location"," Display/Overlays Alertbox Over an Activity"," Display/Overlays Custom Alertbox Over\n an Activity"," This Application Includes Options Menu,\n Context Menu & Popup Menu"," Displays the Items in List View & Shows\n Toast Messages on Clicking Item"," Displays Custom Toast Over Main Activity"," Missing Daily Urgent Updates? Now Stay\n Tuned & Updated!"," Enter Any Input Text From Notifications &\n Then Send it to Another Activity"," Store and Retrieve Data Using Shared\n Preferences in Separate File"," Login and Logout Using Shared\n Preferences"," Apply Different Colours to Homescreen &\n Choose a Username & Age"," Store the ID, Product Name & Price or\n Retrieve, Find & Delete the Products from\n Table Using Content Provider & Activity"," Asks For Permission, Accesses Contacts\n & Then Displays it to Activity"," An Application Component That Can\n Perform Long-Running Operations in the \n Background. It Does Not Provide a UI."," AsyncTask was intended to enable proper \n and easy use of the UI thread."," Registration and Login Through Local Server"};
    int id[]={R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.d,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.am,R.drawable.v,R.drawable.ab,R.drawable.w,R.drawable.x,R.drawable.ag,R.drawable.ai,R.drawable.y,R.drawable.z,R.drawable.ac,R.drawable.ad,R.drawable.ae,R.drawable.af,R.drawable.aj,R.drawable.an,R.drawable.ao,R.drawable.ap};
    public Myadapter(Context c) {
        a=(MainActivity)c;
    }


    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater LayoutInflater=a.getLayoutInflater();
        View v = LayoutInflater.inflate(R.layout.clist, null);
        i1= v.findViewById(R.id.i1);
        t1= v.findViewById(R.id.t1);
        t2= v.findViewById(R.id.t2);
        i1.setImageResource(id[i]);
        t1.setText(name[i]);
        t2.setText(channel[i]);
        return v;
    }
}
