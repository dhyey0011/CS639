package com.example.employeedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EmployeeListAdapter extends ArrayAdapter<Employee> {

    private Context mContext;
    private int mResource;

    public EmployeeListAdapter(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String firstName = getItem(position).getFirstName();
        String lastName = getItem(position).getLastName();
        String key = getItem(position).getKey();

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView firstNameTextView = convertView.findViewById(R.id.first_name_textview);
        TextView lastNameTextView = convertView.findViewById(R.id.last_name_textview);

        firstNameTextView.setText(firstName);
        lastNameTextView.setText(lastName);

        return convertView;
    }
}

