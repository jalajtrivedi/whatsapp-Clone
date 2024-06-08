package com.example.whatsappclone;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class DataAdapter extends FragmentStateAdapter {

    private final int NTabs;
    public DataAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int NTabs) {
        super(fragmentManager,lifecycle);
        this.NTabs = NTabs;
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 0:return new Chats();
            case 1:return new Calls();
            case 2: return new Updates();
            default:new Chats();
        }
        return new Chats();
    }

    @Override
    public int getItemCount() {
        return NTabs;
    }
}
