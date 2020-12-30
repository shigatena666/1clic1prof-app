package fr.clic1prof.activities;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import fr.clic1prof.R;
import fr.clic1prof.abstractviews.AgendaFragment;

public class TeacherAgendaFragment extends AgendaFragment {

    public static TeacherAgendaFragment newInstance() { return new TeacherAgendaFragment(); }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflateFragment(R.layout.teacher_agenda, inflater, container);
        return view;
    }

}
