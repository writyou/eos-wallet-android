package org.arpnetwork.eoswallet.ui.wallet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.arpnetwork.eoswallet.R;
import org.arpnetwork.eoswallet.base.BaseFragment;

public class WalletFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_wallet, container, false);
    }
}