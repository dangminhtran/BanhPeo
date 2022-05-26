package com.example.banhpeo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Mainhome_stud extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar mtoolbar;
    private DrawerLayout sDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_student);

        Toolbar mtoolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(mtoolbar);

        sDrawer = findViewById(R.id.drawer_layout_student);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, sDrawer, mtoolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        sDrawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_course){

        } else if(id == R.id.nav_home){

        } else if(id == R.id.nav_favorite){

        } else if(id == R.id.nav_change_pass){

        } else if(id == R.id.nav_user){

        }

        sDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(sDrawer.isDrawerOpen(GravityCompat.START)){
            sDrawer.closeDrawer(GravityCompat.START);
        } else{
            super.onBackPressed();
        }
    }
}
