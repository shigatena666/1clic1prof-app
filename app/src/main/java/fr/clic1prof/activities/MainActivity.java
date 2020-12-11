package fr.clic1prof.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import fr.clic1prof.R;
import fr.clic1prof.viewmodels.ContactActivityViewModel;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    private ContactActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.viewModel = new ViewModelProvider(this).get(ContactActivityViewModel.class);

        // Setup contact observer.
        this.setContactObserver();
    }

    private void setContactObserver() {

        // Observe the list of contacts and make view update when necessary.
        this.viewModel.getContactMutableLiveData().observe(this, contacts -> {
            // Update view here.
            // If contact list is null, then there is an error.
            // Else, display contacts.
            TextView view = findViewById(R.id.textView);
            view.setText(contacts == null ? "Aucun contact trouvé !" : "Affichage des contacts.");
        });
    }

    public void connect(View view) {
        this.viewModel.retrieveContacts();
    }
}