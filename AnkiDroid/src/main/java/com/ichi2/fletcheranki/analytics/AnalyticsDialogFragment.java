package com.ichi2.fletcheranki.analytics;

import androidx.fragment.app.DialogFragment;

public abstract class AnalyticsDialogFragment extends DialogFragment {
    @Override
    public void onResume() {
        super.onResume();
        UsageAnalytics.sendAnalyticsScreenView(this);
    }
}
