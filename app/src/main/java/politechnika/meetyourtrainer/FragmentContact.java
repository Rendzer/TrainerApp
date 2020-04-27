package politechnika.meetyourtrainer;

<<<<<<< HEAD
import android.os.Bundle;
import android.support.v4.app.Fragment;
=======
import androidx.fragment.app.Fragment;

import android.os.Bundle;
>>>>>>> 962d22a9a79ea868ed5c58ad2a3dd97be31d040d
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentContact extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }
}
