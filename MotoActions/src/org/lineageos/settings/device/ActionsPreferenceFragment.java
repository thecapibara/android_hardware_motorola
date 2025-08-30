/*
 * SPDX-FileCopyrightText: 2015-2016 The CyanogenMod Project
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.device;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceFragment;

public class ActionsPreferenceFragment extends PreferenceFragment {

    private static final String KEY_ACTIONS_CATEGORY = "actions_key";

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.actions_panel);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            getActivity().onBackPressed();
            return true;
        }
        return false;
    }
}
