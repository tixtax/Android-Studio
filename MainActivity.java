package com.example.abid.assignment_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // primitive
    int toalMark;
    int ID;
    boolean markCheck;
    boolean idCheck;

    // input
    TextView studentID;
    TextView courseID;
    TextView mark;

    // view vars

    TextView view_ID;
    TextView view_CourseID;
    TextView view_Mark;
    TextView view_Grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentID = findViewById(R.id.studentID);
        courseID = findViewById(R.id.courseID);
        mark = findViewById(R.id.totalMark);

        view_ID = findViewById(R.id.view_stuID);
        view_CourseID = findViewById(R.id.view_courseID);
        view_Mark = findViewById(R.id.view_mark);
        view_Grade = findViewById(R.id.view_grade);
    }

    public void event(View view) {

        try {

            ID = Integer.parseInt(studentID.getText().toString());
            idCheck =true;

        } catch (NumberFormatException e) {

            view_ID.setText("Please Enter Number");
            Toast.makeText(this,"Input Number",Toast.LENGTH_SHORT).show();
            idCheck = false;
        }

        try {

            toalMark = Integer.parseInt(mark.getText().toString());
            markCheck = true;

        } catch (NumberFormatException e) {

            Toast.makeText(this,"Please Enter Number",Toast.LENGTH_SHORT).show();
            view_Grade.setText("Please Enter Number");
            view_Mark.setText("Please Enter Number");
            markCheck =false;
        }

        if (markCheck && idCheck) {
            view_ID.setText(studentID.getText().toString());
            view_CourseID.setText(courseID.getText().toString().toUpperCase());
            view_Mark.setText(mark.getText().toString());

            calculate(toalMark, view_Grade);
        }

    }

    static void calculate (int marking, TextView grade) {

        if (marking >= 94 && marking<=100){
            grade.setText("A");
        }
        else if (marking < 94 && marking >=90) {
            grade.setText("A-");
        }
        else if (marking < 90 && marking >=87){
            grade.setText("B+");
        }
        else if (marking < 87 && marking >=84){
            grade.setText("B");
        }
        else if (marking < 84 && marking >=80){
            grade.setText("B-");
        }
        else if (marking < 80 && marking >=77){
            grade.setText("C+");
        }
        else if (marking < 77 && marking >=74){
            grade.setText("C");
        }
        else if (marking < 74 && marking >=70){
            grade.setText("C-");
        }
        else if (marking < 70 && marking >=67){
            grade.setText("D+");
        }
        else if (marking < 67 && marking >=64){
            grade.setText("D");
        }
        else if (marking < 64 && marking >=60){
            grade.setText("D-");
        }
        else if (marking<60){
            grade.setText("F");
        }
        else if (marking>100){
            grade.setText("above 100 is not correct");
        }
    }
}
