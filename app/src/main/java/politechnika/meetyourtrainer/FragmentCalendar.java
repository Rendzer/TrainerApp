package politechnika.meetyourtrainer;

<<<<<<< HEAD
import android.app.DatePickerDialog;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class FragmentCalendar extends Fragment {
    ImageButton imageButton;
    TextView mDisplayDate;
    RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    private View v;

    public FragmentCalendar() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_calendar,container, false);
        configureImageButton();
        configureDatePickerView();
        configureRecyclerView();
        return v;
    }


    private void configureImageButton() {
        imageButton = (ImageButton) v.findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You Clicked the button!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), Date.class);
                startActivity(i);
            }
        });
    }

    private void configureDatePickerView() {
       mDisplayDate = (TextView) v.findViewById(R.id.textView);

       mDisplayDate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               DialogFragment newFragment = new SelectDateFragment();
               newFragment.show(getFragmentManager(), "DatePicker");
           }
       });
    }

    private void configureRecyclerView() {


    }


}

=======
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentCalendar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }
}
>>>>>>> 962d22a9a79ea868ed5c58ad2a3dd97be31d040d
