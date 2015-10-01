package activity.ctec.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutMe extends AppCompatActivity
{

    private Button introButton;
    private Button cuisineButton;
    private Button eduButton;
    private Button booksButton;
    private Button digitalButton;

    private TextView introText;
    private TextView cuisineText;
    private TextView eduText;
    private TextView booksText;
    private TextView digitalText;
    private TextView hintText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        introButton = (Button) findViewById(R.id.introButton);
        cuisineButton = (Button) findViewById(R.id.cuisineButton);
        eduButton = (Button) findViewById(R.id.eduButton);
        booksButton = (Button) findViewById(R.id.booksButton);
        digitalButton = (Button) findViewById(R.id.digitalButton);


        introText = (TextView) findViewById(R.id.introText);
        cuisineText = (TextView) findViewById(R.id.cuisineText);
        eduText = (TextView) findViewById(R.id.eduText);
        booksText = (TextView) findViewById(R.id.booksText);
        digitalText = (TextView) findViewById(R.id.digitalText);
        hintText = (TextView) findViewById(R.id.hintText);
        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
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

    //Time to assign button functions

    private void changeIntro()
    {
        if(introText.getVisibility() == View.INVISIBLE)
        {
            introText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
        }
        else
        {
            introText.setVisibility(View.INVISIBLE);
            hintText.setVisibility(View.VISIBLE);
        }
    }

    private void changeCuisine()
    {
        if (cuisineText.getVisibility() == View.INVISIBLE)
        {
            cuisineText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
        }
        else
        {
            introText.setVisibility(View.INVISIBLE);
            hintText.setVisibility(View.VISIBLE);
        }
    }

    private void changeEdu()
    {
        if (eduText.getVisibility() == View.INVISIBLE)
        {
            eduText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
        }
        else
        {
            introText.setVisibility(View.INVISIBLE);
            hintText.setVisibility(View.VISIBLE);
        }
    }

    private void changeBooks()
    {
        if (booksText.getVisibility() == View.INVISIBLE)
        {
            booksText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
        }
        else
        {
            introText.setVisibility(View.INVISIBLE);
            hintText.setVisibility(View.VISIBLE);
        }
    }

    private void changeDigital()
    {
        if (digitalText.getVisibility() == View.INVISIBLE)
        {
            digitalText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
        }
        else
        {
            introText.setVisibility(View.INVISIBLE);
            hintText.setVisibility(View.VISIBLE);
        }
    }

    //Calling Button functions

    private void setupListeners()
    {
        introButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeIntro();
            }
        });

        digitalButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeDigital();
            }
        });

        booksButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeBooks();
            }
        });

        eduButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeEdu();
            }
        });

        cuisineButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                changeCuisine();
            }
        });

    }

}