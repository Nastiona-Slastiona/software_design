package ppo.tabata.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lppo/tabata/viewModels/EditTabataViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "newTabata", "", "getNewTabata", "()Z", "setNewTabata", "(Z)V", "tabata", "Landroidx/lifecycle/MutableLiveData;", "Lppo/tabata/data/TabataEntity;", "renderTabataEdit", "", "binding", "Lppo/tabata/databinding/FragmentTabataEditBinding;", "saveTabata", "viewModel", "Lppo/tabata/viewModels/TabataViewModel;", "setInputFilters", "setTabata", "Time", "app_debug"})
public final class EditTabataViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.MutableLiveData<ppo.tabata.data.TabataEntity> tabata;
    private boolean newTabata = false;
    public static final ppo.tabata.viewModels.EditTabataViewModel.Time Time = null;
    
    public final boolean getNewTabata() {
        return false;
    }
    
    public final void setNewTabata(boolean p0) {
    }
    
    public final void setTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.data.TabataEntity tabata) {
    }
    
    public final void renderTabataEdit(@org.jetbrains.annotations.NotNull()
    ppo.tabata.databinding.FragmentTabataEditBinding binding) {
    }
    
    public final void setInputFilters(@org.jetbrains.annotations.NotNull()
    ppo.tabata.databinding.FragmentTabataEditBinding binding) {
    }
    
    public final void saveTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.databinding.FragmentTabataEditBinding binding, @org.jetbrains.annotations.NotNull()
    ppo.tabata.viewModels.TabataViewModel viewModel) {
    }
    
    public EditTabataViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lppo/tabata/viewModels/EditTabataViewModel$Time;", "", "()V", "addZero", "", "time", "", "getMinutes", "getSec", "getTime", "app_debug"})
    public static final class Time {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTime(int time) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMinutes(int time) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSec(int time) {
            return null;
        }
        
        private final java.lang.String addZero(int time) {
            return null;
        }
        
        private Time() {
            super();
        }
    }
}