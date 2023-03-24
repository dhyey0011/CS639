package com.example.employeedatabase;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    private Button mAddButton;
    private ListView mEmployeeListView;
    private DatabaseReference mDatabaseRef;
    private List<Employee> mEmployeeList = new ArrayList<>();
    private EmployeeListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstNameEditText = findViewById(R.id.first_name_edittext);
        mLastNameEditText = findViewById(R.id.last_name_edittext);
        mAddButton = findViewById(R.id.add_button);
        mEmployeeListView = findViewById(R.id.list_view);

        mDatabaseRef = FirebaseDatabase.getInstance().getReference("employees");
        mEmployeeList = new ArrayList<>();
        mAdapter = new EmployeeListAdapter((Context) MainActivity.this, R.layout.list_item_employee, (ArrayList<Employee>) mEmployeeList);
        mEmployeeListView.setAdapter(mAdapter);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = mFirstNameEditText.getText().toString().trim();
                String lastName = mLastNameEditText.getText().toString().trim();

                if (TextUtils.isEmpty(firstName)) {
                    Toast.makeText(MainActivity.this, "Please enter a first name", Toast.LENGTH_LONG).show();
                } else if (TextUtils.isEmpty(lastName)) {
                    Toast.makeText(MainActivity.this, "Please enter a last name", Toast.LENGTH_LONG).show();
                } else {
                    addEmployee(firstName, lastName);
                }
            }
        });

        mDatabaseRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
                Employee employee = dataSnapshot.getValue(Employee.class);
                mEmployeeList.add(employee);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    private void addEmployee(String firstName, String lastName) {
        String id = mDatabaseRef.push().getKey();
        Employee employee = new Employee(id, firstName, lastName);
        mDatabaseRef.child(id).setValue(employee);
        Toast.makeText(this, "Employee added successfully", Toast.LENGTH_LONG).show();
        mFirstNameEditText.setText("");
        mLastNameEditText.setText("");
    }
}
