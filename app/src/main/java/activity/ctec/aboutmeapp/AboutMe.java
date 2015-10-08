package activity.ctec.aboutmeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class AboutMe extends AppCompatActivity
{
    //Buttons
    private Button introButton;
    private Button cuisineButton;
    private Button eduButton;
    private Button booksButton;
    private Button digitalButton;

    //Text Boxes
    private TextView introText;
    private TextView cuisineText;
    private TextView eduText;
    private TextView booksText;
    private TextView digitalText;
    private TextView hintText;

    private ImageView introImage;
    //private ImageView cuisineImage;
    private ImageView eduImage;
    private ImageView booksImage;
    //private ImageView digitalImage;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        //Button Identifiers
        introButton = (Button) findViewById(R.id.introButton);
        cuisineButton = (Button) findViewById(R.id.cuisineButton);
        eduButton = (Button) findViewById(R.id.eduButton);
        booksButton = (Button) findViewById(R.id.booksButton);
        digitalButton = (Button) findViewById(R.id.digitalButton);

        //TextBox Identifiers
        introText = (TextView) findViewById(R.id.introText);
        cuisineText = (TextView) findViewById(R.id.cuisineText);
        eduText = (TextView) findViewById(R.id.eduText);
        booksText = (TextView) findViewById(R.id.booksText);
        digitalText = (TextView) findViewById(R.id.digitalText);
        hintText = (TextView) findViewById(R.id.hintText);

        //Image Identifiers
        introImage = (ImageView) findViewById(R.id.introImage);
        //cuisineImage = (ImageView) findViewById(R.id.cuisineImage);
        eduImage = (ImageView) findViewById(R.id.eduImage);
        booksImage = (ImageView) findViewById(R.id.booksImage);
        //digitalImage = (ImageView) findViewById(R.id.digitalImage);

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
        if (introText.getVisibility() == View.INVISIBLE)
        {
            introText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            introImage.setVisibility(View.VISIBLE);

            cuisineText.setVisibility(View.INVISIBLE);
            eduText.setVisibility(View.INVISIBLE);
            booksText.setVisibility(View.INVISIBLE);
            digitalText.setVisibility(View.INVISIBLE);
        }
        else
        {
            if (introText.getVisibility() == View.VISIBLE)
            {
                introText.setVisibility(View.INVISIBLE);
                introImage.setVisibility(View.INVISIBLE);

                cuisineText.setVisibility(View.INVISIBLE);
                eduText.setVisibility(View.INVISIBLE);
                booksText.setVisibility(View.INVISIBLE);
                digitalText.setVisibility(View.INVISIBLE);

                hintText.setVisibility(View.VISIBLE);
            }
        }
    }

    private void changeCuisine()
    {
        if (cuisineText.getVisibility() == View.INVISIBLE)
        {
            cuisineText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            //cuisineImage.setVisibility(View.VISIBLE);

            introText.setVisibility(View.INVISIBLE);
            eduText.setVisibility(View.INVISIBLE);
            booksText.setVisibility(View.INVISIBLE);
            digitalText.setVisibility(View.INVISIBLE);
        }
        else
        {
            if (cuisineText.getVisibility() == View.VISIBLE)
            {
                cuisineText.setVisibility(View.INVISIBLE);
                //cuisineImage.setVisibility(View.INVISIBLE);

                introText.setVisibility(View.INVISIBLE);
                eduText.setVisibility(View.INVISIBLE);
                booksText.setVisibility(View.INVISIBLE);
                digitalText.setVisibility(View.INVISIBLE);

                hintText.setVisibility(View.VISIBLE);
            }

        }
    }

    private void changeEdu()
    {
        if (eduText.getVisibility() == View.INVISIBLE)
        {
            eduText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            eduImage.setVisibility(View.VISIBLE);

            introText.setVisibility(View.INVISIBLE);
            cuisineText.setVisibility(View.INVISIBLE);
            booksText.setVisibility(View.INVISIBLE);
            digitalText.setVisibility(View.INVISIBLE);
        }
        else
        {
            if (eduText.getVisibility() == View.VISIBLE)
            {
                eduText.setVisibility(View.INVISIBLE);
                eduImage.setVisibility(View.INVISIBLE);

                introText.setVisibility(View.INVISIBLE);
                cuisineText.setVisibility(View.INVISIBLE);
                booksText.setVisibility(View.INVISIBLE);
                digitalText.setVisibility(View.INVISIBLE);

                hintText.setVisibility(View.VISIBLE);
            }

        }
    }

    private void changeBooks()
    {
        if (booksText.getVisibility() == View.INVISIBLE)
        {
            booksText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            booksImage.setVisibility(View.VISIBLE);

            introText.setVisibility(View.INVISIBLE);
            cuisineText.setVisibility(View.INVISIBLE);
            eduText.setVisibility(View.INVISIBLE);
            digitalText.setVisibility(View.INVISIBLE);
        }
        else
        {
            if (booksText.getVisibility() == View.VISIBLE)
            {
                booksText.setVisibility(View.INVISIBLE);
                booksImage.setVisibility(View.INVISIBLE);

                introText.setVisibility(View.INVISIBLE);
                cuisineText.setVisibility(View.INVISIBLE);
                eduText.setVisibility(View.INVISIBLE);
                digitalText.setVisibility(View.INVISIBLE);

                hintText.setVisibility(View.VISIBLE);
            }

        }
    }

    private void changeDigital()
    {
        if (digitalText.getVisibility() == View.INVISIBLE)
        {
            digitalText.setVisibility(View.VISIBLE);
            hintText.setVisibility(View.INVISIBLE);
            //digitalImage.setVisibility(View.VISIBLE);

            introText.setVisibility(View.INVISIBLE);
            cuisineText.setVisibility(View.INVISIBLE);
            eduText.setVisibility(View.INVISIBLE);
            booksText.setVisibility(View.INVISIBLE);
        }
        else
        {
            if (digitalText.getVisibility() == View.VISIBLE)
            {
                digitalText.setVisibility(View.INVISIBLE);
                //digitalImage.setVisibility(View.INVISIBLE);

                introText.setVisibility(View.INVISIBLE);
                cuisineText.setVisibility(View.INVISIBLE);
                eduText.setVisibility(View.INVISIBLE);
                booksText.setVisibility(View.INVISIBLE);

                hintText.setVisibility(View.VISIBLE);
            }

        }
    }

    //Calling Button functions: Carrying out the steps above

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