package net.kr9ly.dagger2sampleapplication.view.ui.sample.detail;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import net.kr9ly.dagger2sampleapplication.BR;
import net.kr9ly.dagger2sampleapplication.R;
import net.kr9ly.dagger2sampleapplication.di.component.ViewScopeComponent;
import net.kr9ly.dagger2sampleapplication.view.ui.base.DaggerBaseActivity;

public class SampleDetailActivity extends DaggerBaseActivity {

    @Override
    protected void onComponentPrepared(ViewScopeComponent component, @Nullable Bundle savedInstanceState) {
        DataBindingUtil
                .setContentView(this, R.layout.activity_detail)
                .setVariable(BR.viewModel, component.detailViewModel());
    }
}
