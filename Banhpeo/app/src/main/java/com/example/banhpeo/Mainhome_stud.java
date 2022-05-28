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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.banhpeo.fragment_stud.ChangePassFragment;
import com.example.banhpeo.fragment_stud.CourseFragmentStud;
import com.example.banhpeo.fragment_stud.HomeFragmentStud;
import com.example.banhpeo.fragment_stud.ProfileFragmentStud;
import com.google.android.material.navigation.NavigationView;

public class Mainhome_stud extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Toolbar mtoolbar;
    private DrawerLayout sDrawer;
    private static final int FRAGMENT_HOME = 1;
    private static final int FRAGMENT_USER = 2;
    private static final int FRAGMENT_COURSE = 3;
    private static final int FRAGMENT_CHANGEPASS = 4;

    private int currentFragment = FRAGMENT_HOME;

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
            if(FRAGMENT_HOME!= currentFragment){
                replaceFragment(new HomeFragmentStud());
                currentFragment = FRAGMENT_HOME;
            }
        } else if(id == R.id.nav_course){
            if(FRAGMENT_HOME!= currentFragment){
                replaceFragment(new CourseFragmentStud());
                currentFragment = FRAGMENT_COURSE;
            }
        } else if(id == R.id.nav_change_pass){
            if(FRAGMENT_CHANGEPASS!= currentFragment){
                replaceFragment(new ChangePassFragment());
                currentFragment = FRAGMENT_CHANGEPASS;
            }
        } else if(id == R.id.nav_user){
            if(FRAGMENT_HOME!= currentFragment){
                replaceFragment(new ProfileFragmentStud());
                currentFragment = FRAGMENT_USER;
            }
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

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.drawer_layout_student, fragment);
        fragmentTransaction.commit();

    }
}
