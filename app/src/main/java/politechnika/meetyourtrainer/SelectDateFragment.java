package politechnika.meetyourtrainer;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class SelectDateFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar calendar = Calendar.getInstance();
        int yy = calendar.get(Calendar.YEAR);
        int mm = calendar.get(Calendar.MONTH) + 1;
        int dd = calendar.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(), this, dd, mm, yy);
    }

    public void onDateSet(DatePicker view, int dd, int mm, int yy) {
        TextView tv1 = (TextView) getActivity().findViewById(R.id.textView);
        tv1.setText(new StringBuilder()
                .append(yy).append("/").append(mm + 1)
                .append("/").append(dd).append(" "));

    }

}
