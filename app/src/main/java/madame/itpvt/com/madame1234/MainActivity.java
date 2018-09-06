package madame.itpvt.com.madame1234;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.NavigationView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

import static madame.itpvt.com.madame1234.R.*;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{


    ImageView insta;
    ImageView whatsapp;
    Button facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Remove notification bar


        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.main_navigation);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView textView=(TextView)findViewById(R.id.textView4) ;
      facebook=(Button) findViewById(R.id.facebook);
        ImageView img = (ImageView) findViewById(R.id.img1);
        insta= (ImageView) findViewById(R.id.insta);
     whatsapp=(ImageView) findViewById(R.id.whatsapp);
      //  sliderLayout = (SliderLayout) findViewById(R.id.slider);

//
     insta.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent i = new Intent( Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/madame_ready_to_wear"));
             startActivity(i);
         }
     });
//
//        instagram.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://madame_ready_to_wear/"));
//
//                startActivity(myIntent);
//            }
//        });



        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri  = Uri.parse("smsto:"+"+923000225587");
                Intent intent =new Intent(Intent.ACTION_SENDTO,uri);
                intent.setPackage("com.whatsapp");

                 startActivity(intent);


            }

        });

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, All_Products_Design.class);
                intent.putExtra("id", "55");
                intent.putExtra("title", "Hello");

                startActivity(intent);


            }
        });
        ImageView bag=(ImageView)findViewById(R.id.bag);

        bag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(getIntent());
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/madamepret/"));
//madame_ready_to_wear
                startActivity(myIntent);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://madame.pk/"));
                startActivity(myIntent);
            }
        });

        ImageView img1 = (ImageView) findViewById(id.img2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, All_Products_Design.class);
                intent.putExtra("id", "63");
                intent.putExtra("title", "Hello");

                startActivity(intent);

            }
        });


        ImageView img2 = (ImageView) findViewById(id.img3);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub_Categories.class);
                intent.putExtra("id", "61");
                intent.putExtra("title", "Hello");

                startActivity(intent);

            }

        });


        ImageView img3 = (ImageView) findViewById(id.img4);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub_Categories.class);
                intent.putExtra("id", "56");
                intent.putExtra("title", "Hello");

                startActivity(intent);

            }

        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
      ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawer,toolbar, R.string.navigation_drawer_open, string.navigation_drawer_close );
      drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.Home)
        {
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            intent.putExtra("id","55");
            intent.putExtra("title","Categories");
            startActivity(intent);

        } else if (id == R.id.Categories){

            Intent intent = new Intent(MainActivity.this, Sub_Categories.class);
            intent.putExtra("id", "56");
            intent.putExtra("title", "Hello");

            startActivity(intent);


        } else if (id == R.id.Cart) {

       Intent i= new Intent(MainActivity.this, My_Cart.class);
       startActivity(i);
finish();

        } else if (id == R.id.Whatsapp)
        {
            Uri uri  = Uri.parse("smsto:"+"+923000225587");
            Intent intent =new Intent(Intent.ACTION_SENDTO,uri);
            intent.setPackage("com.whatsapp");
            startActivity(intent);

        } else if (id == R.id.Innovators)
        {
           Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://itpvt.net/"));
            startActivity(myIntent);

        }else if (id == R.id.web) {

            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://madame.pk/"));
            startActivity(myIntent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}




