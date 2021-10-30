package ppo.tabata.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lppo/tabata/utility/TabataApp;", "Lcom/zeugmasolutions/localehelper/LocaleAwareApplication;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "database", "Lppo/tabata/data/TabataDatabase;", "getDatabase", "()Lppo/tabata/data/TabataDatabase;", "database$delegate", "Lkotlin/Lazy;", "repository", "Lppo/tabata/data/TabataRepository;", "getRepository", "()Lppo/tabata/data/TabataRepository;", "repository$delegate", "onCreate", "", "Companion", "app_debug"})
public final class TabataApp extends com.zeugmasolutions.localehelper.LocaleAwareApplication {
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy repository$delegate = null;
    public static final ppo.tabata.utility.TabataApp.Companion Companion = null;
    
    private final ppo.tabata.data.TabataDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ppo.tabata.data.TabataRepository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public TabataApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lppo/tabata/utility/TabataApp$Companion;", "", "()V", "updateTheme", "", "darkTheme", "", "app_debug"})
    public static final class Companion {
        
        public final void updateTheme(boolean darkTheme) {
        }
        
        private Companion() {
            super();
        }
    }
}