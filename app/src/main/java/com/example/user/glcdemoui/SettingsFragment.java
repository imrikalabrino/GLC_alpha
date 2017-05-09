
package com.example.user.glcdemoui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;


/**
 * Created by User on 08/05/2017.
 */

public class SettingsFragment extends Fragment {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /*myView = inflater.inflate(R.layout.settings, container, false);
        return myView;*/
        myView = LayoutInflater.from(getActivity()).inflate(R.layout.settings, null);
        final PopupWindow popupWindow = new PopupWindow(myView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);
        popupWindow.showAsDropDown(myView, 0, 0);
        Button close = (Button) myView.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        return null;

    }
}