package com.project.afinal.bts.musicsharing.view;

import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

import com.project.afinal.bts.musicsharing.NavigationManager;
import com.project.afinal.bts.musicsharing.R;
import com.project.afinal.bts.musicsharing.view.base.BaseFragment;

/**
 * Created by Laia on 5/7/2016.
 */
public class RegistrationFragment extends BaseFragment {
    private AppCompatEditText editTextRegistrationName;
    private AppCompatEditText editTextRegistrationEmail;
    private AppCompatEditText editTextRegistrationPassword;
    private Button buttonRegistrationNext;

    public RegistrationFragment() {
        layoutId = R.layout.fragment_registration;
    }

    @Override
    protected void loadViewItems() {
        editTextRegistrationName = (AppCompatEditText) rootView.findViewById(R.id.editTextRegistrationName);
        editTextRegistrationEmail = (AppCompatEditText) rootView.findViewById(R.id.editTextRegistrationEmail);
        editTextRegistrationPassword = (AppCompatEditText) rootView.findViewById(R.id.editTextRegistrationPassword);
        buttonRegistrationNext = (Button) rootView.findViewById(R.id.buttonRegistrationNext);
        buttonRegistrationNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationManager.navigate(getActivity(), new PersonalInfoFragment(), true);
            }
        });
    }
}
