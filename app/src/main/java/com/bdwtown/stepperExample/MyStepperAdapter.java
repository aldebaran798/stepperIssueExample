package com.bdwtown.stepperExample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;

import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;
import com.stepstone.stepper.viewmodel.StepViewModel;

public class MyStepperAdapter extends AbstractFragmentStepAdapter {
    private static final String CURRENT_STEP_POSITION_KEY = "step";

    public MyStepperAdapter(FragmentManager fm, Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(@IntRange(from = 0L) int position) {

        switch (position) {
            case 0:
                final Step1Fragment step1 = new Step1Fragment();
                Bundle bundle1 = new Bundle();
                bundle1.putInt(CURRENT_STEP_POSITION_KEY, position);
                step1.setArguments(bundle1);
                return step1;

            case 1:
                final Step2Fragment step2 = new Step2Fragment();
                Bundle bundle2 = new Bundle();
                bundle2.putInt(CURRENT_STEP_POSITION_KEY, position);
                step2.setArguments(bundle2);
                return step2;

            case 2:
                final Step3Fragment step3 = new Step3Fragment();
                Bundle bundle3 = new Bundle();
                bundle3.putInt(CURRENT_STEP_POSITION_KEY, position);
                step3.setArguments(bundle3);
                return step3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public StepViewModel getViewModel(@IntRange(from = 0L) int position) {
        StepViewModel.Builder builder = new StepViewModel.Builder(context);

        return builder.create();
    }
}
