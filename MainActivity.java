package com.example.abid.assignment_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // primitive
    int fMark;
    int stuID;
    boolean isMarkRight;
    boolean isIDRight;

    // input
    TextView studentID;
    TextView courseID;
    TextView mark;

    // view vars

    TextView vStudentID;
    TextView vCourseID;
    TextView vMark;
    TextView vgrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentID = findViewById(R.id.stuID);
        courseID = findViewById(R.id.courseID);
        mark = findViewById(R.id.mark);

        vStudentID = findViewById(R.id.view_stuID);
        vCourseID = findViewById(R.id.view_courseID);
        vMark = findViewById(R.id.view_mark);
        vgrade = findViewById(R.id.view_grade);
    }

    public void event(View view) {

        try {

            stuID = Integer.parseInt(studentID.getText().toString());
            isIDRight =true;

        } catch (NumberFormatException e) {

            vStudentID.setText("Wrong input");
            Toast.makeText(this,"ID wrong input",Toast.LENGTH_SHORT).show();
            isIDRight = false;
        }

        try {

            fMark = Integer.parseInt(mark.getText().toString());
            isMarkRight = true;

        } catch (NumberFormatException e) {

            Toast.makeText(this,"Grade wrong input",Toast.LENGTH_SHORT).show();
            vgrade.setText("Wrong Input");
            vMark.setText("Wrong Input");
            isMarkRight =false;
        }

        if (isMarkRight && isIDRight) {
            vStudentID.setText(studentID.getText().toString());
            vCourseID.setText(courseID.getText().toString().toUpperCase());
            vMark.setText(mark.getText().toString());

            calculate(fMark,vgrade);
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
            grade.setText("should not exceed 100");
        }
    }
}
