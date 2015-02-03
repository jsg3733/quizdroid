package jsg3733.washington.edu.quizdroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class QuestionPage extends ActionBarActivity {

    private String answer;
    private String response;
    Button submit;
    private int howManyRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);

        Intent launchedMe = getIntent();
        final String topicName = launchedMe.getStringExtra("topic");
        final int QNum = launchedMe.getIntExtra("questionNum", 0);
        howManyRight = launchedMe.getIntExtra("howManyRight", 0);
        TextView question = (TextView) findViewById(R.id.txtQuestion);
        RadioButton responseOne = (RadioButton) findViewById(R.id.btnResponseOne);
        RadioButton responseTwo = (RadioButton) findViewById(R.id.btnResponseTwo);
        RadioButton responseThree = (RadioButton) findViewById(R.id.btnResponseThree);
        RadioButton responseFour = (RadioButton) findViewById(R.id.btnResponseFour);

        if(topicName.equals("Math")) {
            if(QNum == 1){
                question.setText("2 + 2 =");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3");
                responseFour.setText("4"); //Answer
                answer = responseFour.getText().toString();
            }else if(QNum == 2) {
                question.setText("2 x 2 =");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3");
                responseFour.setText("4"); //Answer
                answer = responseFour.getText().toString();
            }else if(QNum == 3) {
                question.setText("2 - 2 =");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("0");  //Answer
                responseFour.setText("4");
                answer = responseThree.getText().toString();
            }else if(QNum == 4) {
                question.setText("1 + 1 =");
                responseOne.setText("1");
                responseTwo.setText("2");  //Answer
                responseThree.setText("3");
                responseFour.setText("4");
                answer = responseTwo.getText().toString();
            }else if(QNum == 5) {
                question.setText("1 x 1 =");
                responseOne.setText("1");  //Answer
                responseTwo.setText("2");
                responseThree.setText("3");
                responseFour.setText("4");
                answer = responseOne.getText().toString();
            }
        }else if(topicName.equals("Physics")) {
            if(QNum == 1){
                question.setText("It is easier to roll a stone up a sloping road than to lift it vertical upwards because ");
                responseOne.setText("work done in rolling is more than in lifting");
                responseTwo.setText("work done in lifting the stone is equal to rolling it");
                responseThree.setText("work done in both is same but the rate of doing work is less in rolling");
                responseFour.setText("work done in rolling a stone is less than in lifting it"); //answer
                answer = responseFour.getText().toString();
            }else if(QNum == 2) {
                question.setText("The absorption of ink by blotting paper involves");
                responseOne.setText("viscosity of ink");
                responseTwo.setText("capillary action phenomenon"); //answer
                responseThree.setText("diffusion of ink through the blotting");
                responseFour.setText("siphon action");
                answer = responseTwo.getText().toString();
            }else if(QNum == 3) {
                question.setText("The circumference of a circle is");
                responseOne.setText("who cares");
                responseTwo.setText("4");
                responseThree.setText("2piR"); //Answer
                responseFour.setText("3");
                answer = responseThree.getText().toString();

            }else if(QNum == 4) {
                question.setText("A square is made up of how many connected lines");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3");
                responseFour.setText("4"); //answer
                answer  = responseFour.getText().toString();
            }else if(QNum == 5) {
                question.setText("The area of a square is");
                responseOne.setText("1s");
                responseTwo.setText("2s");
                responseThree.setText("s x s"); //answer
                responseFour.setText("5");
                answer = responseThree.getText().toString();
            }
        }else if(topicName.equals("Marvel Super Heroes")) {
            if(QNum == 1){
                question.setText("What color was the hulk originally in comic books");
                responseOne.setText("green");
                responseTwo.setText("grey"); //answer
                responseThree.setText("purple");
                responseFour.setText("teal");
                answer = responseTwo.getText().toString();
            }else if(QNum == 2) {
                question.setText("Who vetoed the option of Wolverine being an actual mutated wolverine");
                responseOne.setText("Stan Lee");  //answer
                responseTwo.setText("Peter Pan");
                responseThree.setText("George Lucas");
                responseFour.setText("You");
                answer  = responseOne.getText().toString();
            }else if(QNum == 3) {
                question.setText("Who looked into buying Marvel in the late 90s because they wanted to play Spider-Man");
                responseOne.setText("Mickey Mouse");
                responseTwo.setText("George Lucas");
                responseThree.setText("Micheal Jackson"); //answer
                responseFour.setText("Will Ferrel");
                answer = responseThree.getText().toString();
            }else if(QNum == 4) {
                question.setText("By how many years did Loki predate his brother Thor in comic books");
                responseOne.setText("1");
                responseTwo.setText("18");
                responseThree.setText("13"); //answer
                responseFour.setText("7");
                answer = responseThree.getText().toString();
            }else if(QNum == 5) {
                question.setText("What character did Marvel keep using after the license expired in the mid-80s for them");
                responseOne.setText("Godzilla");// Answer
                responseTwo.setText("The Hulk");
                responseThree.setText("Iron Man");
                responseFour.setText("Scooby Doo");
                answer = responseOne.getText().toString();
            }
        }else if(topicName.equals("Hockey")){
            if(QNum == 1){
                question.setText("How many goals is a hat-trick");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3"); //answer
                responseFour.setText("4");
                answer = responseThree.getText().toString();
            }else if(QNum == 2) {
                question.setText("What is between both blue lines called");
                responseOne.setText("Center ice");
                responseTwo.setText("The neutral zone"); //answer
                responseThree.setText("Crease");
                responseFour.setText("Face-off");
                answer = responseTwo.getText().toString();
            }else if(QNum == 3) {
                question.setText("Where is the goalie usually positioned");
                responseOne.setText("the crease"); //answer
                responseTwo.setText("center ice");
                responseThree.setText("slot");
                responseFour.setText("face-off circle");
                answer = responseOne.getText().toString();
            }else if(QNum == 4) {
                question.setText("How many assists is a play-maker");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3"); //answer
                responseFour.setText("4");
                answer = responseThree.getText().toString();
            }else if(QNum == 5) {
                question.setText("How many forwards are on the ice at one time");
                responseOne.setText("1");
                responseTwo.setText("2");
                responseThree.setText("3");
                responseFour.setText("4"); //answer
                answer  = responseFour.getText().toString();
            }
        }else if(topicName.equals("Geography")) {
            if(QNum == 1){
                question.setText("What is the capital of Washington");
                responseOne.setText("Kennewick");
                responseTwo.setText("Seattle");
                responseThree.setText("Tacoma");
                responseFour.setText("Olympia"); //answer
                answer = responseFour.getText().toString();
            }else if(QNum == 2) {
                question.setText("What is the capital of Oregon ");
                responseOne.setText("Salem"); //answer
                responseTwo.setText("Portland");
                responseThree.setText("Beaverton");
                responseFour.setText("Eugene");
                answer = responseOne.getText().toString();
            }else if(QNum == 3) {
                question.setText("Where is the University of Washington located");
                responseOne.setText("Spokane");
                responseTwo.setText("Bellevue");
                responseThree.setText("Seattle"); //answer
                responseFour.setText("Albany");
                answer = responseThree.getText().toString();
            }else if(QNum == 4) {
                question.setText("What is the capital of New York");
                responseOne.setText("Albany"); //answer
                responseTwo.setText("Buffalo");
                responseThree.setText("New York City");
                responseFour.setText("Brooklyn");
                answer = responseOne.getText().toString();
            }else if(QNum == 5) {
                question.setText("What is the capital of California");
                responseOne.setText("Sacramento"); //answer
                responseTwo.setText("Los Angeles");
                responseThree.setText("San Jose");
                responseFour.setText("San Francisco");
                answer = responseOne.getText().toString();
            }
        }

        submit = (Button) findViewById(R.id.btnSubmit);
        submit.setEnabled(false);

        responseOne.setOnClickListener(btnListener);
        responseTwo.setOnClickListener(btnListener);
        responseThree.setOnClickListener(btnListener);
        responseFour.setOnClickListener(btnListener);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(QuestionPage.this, AnswerSummary.class);
                nextActivity.putExtra("topic", topicName);
                nextActivity.putExtra("answer", answer);
                nextActivity.putExtra("response", response);
                nextActivity.putExtra("questionNum", QNum);
                nextActivity.putExtra("howManyRight", howManyRight);

                startActivity(nextActivity);
                //finish();

            }
        });



    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //Log.i("QuestionPage", answer);
            boolean checked = ((RadioButton) v).isChecked();
            submit.setEnabled(true);
            switch(v.getId()) {
                case R.id.btnResponseOne:
                    if(checked) {
                        response = ((RadioButton) findViewById(R.id.btnResponseOne)).getText().toString();
                    }
                    break;
                case R.id.btnResponseTwo:
                    if(checked) {
                        response = ((RadioButton) findViewById(R.id.btnResponseTwo)).getText().toString();
                    }
                    break;
                case R.id.btnResponseThree:
                    if(checked) {
                        response = ((RadioButton) findViewById(R.id.btnResponseThree)).getText().toString();
                    }
                    break;
                case R.id.btnResponseFour:
                    if(checked) {
                        response = ((RadioButton) findViewById(R.id.btnResponseFour)).getText().toString();
                    }
                    break;
            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question_page, menu);
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
