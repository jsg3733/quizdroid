package jsg3733.washington.edu.quizdroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class AnswerSummary extends ActionBarActivity {
    private int howManyRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_summary);

        Intent launchedMe = getIntent();
        final String topicName = launchedMe.getStringExtra("topic");
        final int QNum = launchedMe.getIntExtra("questionNum", 0);
        final String response = launchedMe.getStringExtra("response");
        final String answer = launchedMe.getStringExtra("answer");
        howManyRight = launchedMe.getIntExtra("howManyRight", 0);

        TextView lastResponse = (TextView) findViewById(R.id.txtLastResponse);
        lastResponse.setText("Your response was: " + response);
        TextView correctAnswer = (TextView) findViewById(R.id.txtAnswer);
        correctAnswer.setText("The correct answer is: " + answer);
        TextView amountRight = (TextView) findViewById(R.id.txtTotalRight);
        if(response.equals(answer)) {
            howManyRight++;
        }
        amountRight.setText("You have " + howManyRight + " out of " + "5" + " correct!");

        final Button b = (Button) findViewById(R.id.btnNext);

        if(QNum == 5) {
            b.setText("Finish");
        }

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b.getText().toString().equals("Finish")) {
                    Intent nextActivity = new Intent(AnswerSummary.this, Topics.class);
                    startActivity(nextActivity);
                    finish();
                }else {
                    Intent nextActivity = new Intent(AnswerSummary.this, QuestionPage.class);
                    nextActivity.putExtra("questionNum", QNum + 1);
                    nextActivity.putExtra("topic", topicName);
                    nextActivity.putExtra("howManyRight", howManyRight);
                    startActivity(nextActivity);
                    finish();
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_answer_summary, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
