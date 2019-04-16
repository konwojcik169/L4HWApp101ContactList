package com.example.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PeopleAdapter extends ArrayAdapter<People> {
    private Context myContext;
    private List<People> peopleList;

    public PeopleAdapter(Context context, ArrayList<People> list) {
        super(context, 0, list);
        myContext = context;
        peopleList = list;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(myContext).inflate(R.layout.list_item, parent, false);
        People currentPeople = peopleList.get(position);
        ImageView iv = listItem.findViewById(R.id.imageView);
        iv.setImageResource(currentPeople.getFacePicture());
        TextView tv1 = listItem.findViewById(R.id.textView);
        tv1.setText(currentPeople.getNameOfPeople());
        TextView tv2 = listItem.findViewById(R.id.textView2);
        tv2.setText(currentPeople.getMail());
        TextView tv3 = listItem.findViewById(R.id.textView3);
        tv3.setText(currentPeople.getPhoneNumber());
        return listItem;
    }
}
