package ernie.com.thequotebook;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class QuoteActionsActivity extends Activity {
   public int count = 0;
   public ArrayList<Quote> quoteList = new ArrayList<Quote>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_actions);

        RelativeLayout touch = (RelativeLayout) findViewById(R.id.game);
        setupButtons();

        Quote quote1 = new Quote("Cool Beans", "Rod Kimble");
        quoteList.add(quote1);

        Quote quote2 = new Quote("How can mirrors be real if our eyes aren't real", "Jaden Smith");
        quoteList.add(quote2);

        Quote quote3 = new Quote("That's like me blaming owls for how bad I suck at analogies.", "Britta Perry");
        quoteList.add(quote3);

        Quote quote4 = new Quote("You're more of a fun vampire. You don't suck blood, you just suck.", "Troy Barnes");
        quoteList.add(quote4);

        Quote quote5 = new Quote("I was gonna be the first person in my family to graduate from community college. Everyone else graduated from normal college", "Troy Barnes");
        quoteList.add(quote5);
/*
        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count < 2) {

                    Quote q = quoteList.get(count);

                    quoteText.setText(q.getQuote());

                    personText.setText(q.getPerson());

                    count = count + 1;


                } else{
                    count = 0;
                }
            }
        });
        */
    }

    public  void  setupButtons(){
        final Button btn = (Button) findViewById(R.id.button);
        btn.setText("???");
        final Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setText("???");
        final Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setText("???");
        final Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setText("???");
        final Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setText("???");
        final Button btn6 = (Button) findViewById(R.id.button6);
        btn6.setText("???");
    }

    public void checkCount(int count){
        count++;
        if (count == 2){
            count =0;
        }
    }

    public void sendMessage(View view) {
        if (count != 2){
           Button b = (Button) findViewById(view.getId());
            Quote q = quoteList.get(count);
            b.setText(q.getQuote());
            checkCount(count);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_qutoe_actions, menu);
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
