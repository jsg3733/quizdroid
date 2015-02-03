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


public class TopicOverview extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_overview);

        Intent launchedMe = getIntent();
        final String topicName = launchedMe.getStringExtra("topic");
        TextView header = (TextView) findViewById(R.id.txtTopic);
        header.setText(topicName);
        TextView description = (TextView) findViewById(R.id.txtDesc);
        TextView questions = (TextView) findViewById(R.id.txtQuestions);
        if(topicName.equals("Math")) {
            description.setText("A topic based on the study of mathematics." +
                    "Includes the use of numbers and formulas.");
            questions.setText("Questions: 5");
        }else if(topicName.equals("Physics")) {
            description.setText("A topic based on the study of the natural science." +
                    "This includes topics such as motion and energy.");
            questions.setText("Questions: 5");
        }else if(topicName.equals("Marvel Super Heroes")) {
            description.setText("A topic based on the super heroes within the Marvel comics.");
            questions.setText("Questions: 5");
        }else if(topicName.equals("Hockey")){
            description.setText("A topic based on the sport hockey which uses a stick" +
                    " and puck to score goals.");
            questions.setText("Questions: 5");
        }else if(topicName.equals("Geography")) {
            description.setText("A topic based on where different cities and rivers are located.");
            questions.setText("Questions: 5");
        }

        Button begin = (Button) findViewById(R.id.btnBegin);
        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(TopicOverview.this, QuestionPage.class);
                nextActivity.putExtra("topic", topicName);
                nextActivity.putExtra("questionNum", 1);

                startActivity(nextActivity);
                finish();
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_topic_overview, menu);
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
