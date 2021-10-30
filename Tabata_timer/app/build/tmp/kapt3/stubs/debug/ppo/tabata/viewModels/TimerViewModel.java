package ppo.tabata.viewModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010F\u001a\u00020GH\u0002J\u0010\u0010D\u001a\u00020\u00162\u0006\u0010H\u001a\u00020\u001cH\u0002J\u0006\u0010I\u001a\u00020GJ\u000e\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020\u000fJ\b\u0010L\u001a\u00020GH\u0002J\u000e\u0010M\u001a\u00020G2\u0006\u0010<\u001a\u00020=J\u0006\u0010N\u001a\u00020GR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082D\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\u001a\u0010 \u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR \u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020+X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R \u00100\u001a\b\u0012\u0004\u0012\u00020\u001601X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00106\u001a\b\u0012\u0004\u0012\u00020\u000f01X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u0016\u00109\u001a\n \u0007*\u0004\u0018\u00010:0:X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010\u001aR\u000e\u0010A\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010C\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0018\"\u0004\bE\u0010\u001a\u00a8\u0006O"}, d2 = {"Lppo/tabata/viewModels/TimerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "attr", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "currIndex", "", "getCurrIndex", "()I", "setCurrIndex", "(I)V", "currentText", "Landroidx/lifecycle/MutableLiveData;", "", "getCurrentText", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentText", "(Landroidx/lifecycle/MutableLiveData;)V", "interval", "", "isFinished", "", "setFinished", "isRunning", "()Z", "setRunning", "(Z)V", "nextText", "getNextText", "setNextText", "prevText", "getPrevText", "setPrevText", "res", "Landroid/content/res/Resources;", "getRes", "()Landroid/content/res/Resources;", "setRes", "(Landroid/content/res/Resources;)V", "sequenceText", "Ljava/util/ArrayList;", "getSequenceText", "()Ljava/util/ArrayList;", "setSequenceText", "(Ljava/util/ArrayList;)V", "sequenceTime", "getSequenceTime", "setSequenceTime", "soundPool", "Landroid/media/SoundPool;", "stagesCount", "tabata", "Lppo/tabata/data/TabataEntity;", "timePercentRemaining", "getTimePercentRemaining", "setTimePercentRemaining", "timeRemaining", "timeRemainingStatic", "timeRemainingText", "getTimeRemainingText", "setTimeRemainingText", "createSequence", "", "time", "pause", "rewind", "i", "setInitValues", "setTabata", "startTimer", "app_debug"})
public final class TimerViewModel extends androidx.lifecycle.AndroidViewModel {
    private ppo.tabata.data.TabataEntity tabata;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> currentText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> prevText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> nextText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> timeRemainingText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> timePercentRemaining;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFinished;
    @org.jetbrains.annotations.Nullable()
    private android.os.CountDownTimer countDownTimer;
    private long timeRemaining = 0L;
    private long timeRemainingStatic;
    private int currIndex = 0;
    private int stagesCount = 0;
    private final long interval = 1000L;
    private boolean isRunning = false;
    @org.jetbrains.annotations.NotNull()
    public android.content.res.Resources res;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> sequenceText;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.Integer> sequenceTime;
    private final android.media.AudioAttributes attr = null;
    private final android.media.SoundPool soundPool = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrentText() {
        return null;
    }
    
    public final void setCurrentText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrevText() {
        return null;
    }
    
    public final void setPrevText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNextText() {
        return null;
    }
    
    public final void setNextText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTimeRemainingText() {
        return null;
    }
    
    public final void setTimeRemainingText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTimePercentRemaining() {
        return null;
    }
    
    public final void setTimePercentRemaining(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFinished() {
        return null;
    }
    
    public final void setFinished(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.os.CountDownTimer getCountDownTimer() {
        return null;
    }
    
    public final void setCountDownTimer(@org.jetbrains.annotations.Nullable()
    android.os.CountDownTimer p0) {
    }
    
    public final int getCurrIndex() {
        return 0;
    }
    
    public final void setCurrIndex(int p0) {
    }
    
    public final boolean isRunning() {
        return false;
    }
    
    public final void setRunning(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.Resources getRes() {
        return null;
    }
    
    public final void setRes(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getSequenceText() {
        return null;
    }
    
    public final void setSequenceText(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getSequenceTime() {
        return null;
    }
    
    public final void setSequenceTime(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> p0) {
    }
    
    public final void setTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.data.TabataEntity tabata) {
    }
    
    private final void setInitValues() {
    }
    
    private final void createSequence() {
    }
    
    public final void pause() {
    }
    
    private final java.lang.String getTimeRemainingText(long time) {
        return null;
    }
    
    public final void startTimer() {
    }
    
    public final void rewind(int i) {
    }
    
    public TimerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}