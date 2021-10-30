package ppo.tabata.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000f"}, d2 = {"Lppo/tabata/data/TabataDAO;", "", "clear", "", "deleteTabata", "tabata", "Lppo/tabata/data/TabataEntity;", "getTabata", "Landroidx/lifecycle/LiveData;", "id", "", "getTabatas", "", "insertTabata", "updateTabata", "app_debug"})
public abstract interface TabataDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TabataEntity")
    public abstract androidx.lifecycle.LiveData<java.util.List<ppo.tabata.data.TabataEntity>> getTabatas();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TabataEntity WHERE id = :id")
    public abstract androidx.lifecycle.LiveData<ppo.tabata.data.TabataEntity> getTabata(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.data.TabataEntity tabata);
    
    @androidx.room.Update()
    public abstract void updateTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.data.TabataEntity tabata);
    
    @androidx.room.Delete()
    public abstract void deleteTabata(@org.jetbrains.annotations.NotNull()
    ppo.tabata.data.TabataEntity tabata);
    
    @androidx.room.Query(value = "DELETE FROM TabataEntity")
    public abstract void clear();
}