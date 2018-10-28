package com.bignerdranch.android.beatbox;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.beatbox.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
