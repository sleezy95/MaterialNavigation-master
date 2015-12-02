package net.mustafaozcan.materialnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Register extends AppCompatActivity {
    EditText srname, namey, passwordy, cellno, id, username;
    Button reg;
    ProgressBar         mProgressBar;
    public static final String DB = "Nigro";
    public static final String Sname = "Surname";
    public static final String names = "Name";
    public static final String passwords = "Password";
    public static final String cells= "Cellno";
    public static final String idd = "ID";
    public static final String users ="Username";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ParseUser.getCurrentUser.saveInBackground();

        setContentView(R.layout.activity_register);
        srname = (EditText) findViewById(R.id.txts);
        namey = (EditText) findViewById(R.id.txtn);
        passwordy = (EditText) findViewById(R.id.txtp);
        cellno = (EditText) findViewById(R.id.txtc);
        id = (EditText) findViewById(R.id.txid);
        username = (EditText) findViewById(R.id.txtus);
        reg = (Button) findViewById(R.id.btnreg);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar1);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);


    }


        //post.put(passwords, passwordy);

        //post.put(users, username);
       // ParseUser user = new ParseUser();

        //user.setUsername(nick);
       /// user.setPassword(pass);
       // user.put(Sname, sname);
        //user.put(names, name);
        //user.put(passwords, pass);
       // user.put(cells, cell);
        //user.put(idd, idzs);
       // user.put(users,nick);








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

