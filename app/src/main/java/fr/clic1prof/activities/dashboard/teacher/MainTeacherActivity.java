package fr.clic1prof.activities.dashboard.teacher;


import android.os.Bundle;


import fr.clic1prof.R;
import fr.clic1prof.activities.abstractviews.AbstractActivity;

public class MainTeacherActivity extends AbstractActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_main_activity);
        this.setListenerMenu();
    }



}
