package ppo.tabata.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0004\u0016\u0017\u0018\u0019B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\n2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lppo/tabata/utility/TabataListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lppo/tabata/data/TabataEntity;", "Lppo/tabata/utility/TabataListAdapter$TabataViewHolder;", "tabataList", "", "itemListener", "Lppo/tabata/utility/TabataListAdapter$RecyclerViewLongClickListener;", "clickListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lppo/tabata/utility/TabataListAdapter$RecyclerViewLongClickListener;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "Companion", "RecyclerViewLongClickListener", "TabataComparator", "TabataViewHolder", "app_debug"})
public final class TabataListAdapter extends androidx.recyclerview.widget.ListAdapter<ppo.tabata.data.TabataEntity, ppo.tabata.utility.TabataListAdapter.TabataViewHolder> {
    private java.util.List<ppo.tabata.data.TabataEntity> tabataList;
    private ppo.tabata.utility.TabataListAdapter.RecyclerViewLongClickListener itemListener;
    private final kotlin.jvm.functions.Function1<ppo.tabata.data.TabataEntity, kotlin.Unit> clickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static ppo.tabata.databinding.RecyclerviewItemBinding binding;
    public static final ppo.tabata.utility.TabataListAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ppo.tabata.utility.TabataListAdapter.TabataViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ppo.tabata.utility.TabataListAdapter.TabataViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<ppo.tabata.data.TabataEntity> list) {
    }
    
    public TabataListAdapter(@org.jetbrains.annotations.Nullable()
    java.util.List<ppo.tabata.data.TabataEntity> tabataList, @org.jetbrains.annotations.NotNull()
    ppo.tabata.utility.TabataListAdapter.RecyclerViewLongClickListener itemListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ppo.tabata.data.TabataEntity, kotlin.Unit> clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u000e"}, d2 = {"Lppo/tabata/utility/TabataListAdapter$TabataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lppo/tabata/utility/TabataListAdapter;Landroid/view/View;)V", "bind", "", "tabata", "Lppo/tabata/data/TabataEntity;", "clickListener", "Lkotlin/Function1;", "onClick", "v", "app_debug"})
    public final class TabataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity tabata, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super ppo.tabata.data.TabataEntity, kotlin.Unit> clickListener) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public TabataViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lppo/tabata/utility/TabataListAdapter$RecyclerViewLongClickListener;", "", "recyclerViewListLongClicked", "", "tabata", "Lppo/tabata/data/TabataEntity;", "app_debug"})
    public static abstract interface RecyclerViewLongClickListener {
        
        public abstract void recyclerViewListLongClicked(@org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity tabata);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lppo/tabata/utility/TabataListAdapter$TabataComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lppo/tabata/data/TabataEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class TabataComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<ppo.tabata.data.TabataEntity> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity oldItem, @org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity oldItem, @org.jetbrains.annotations.NotNull()
        ppo.tabata.data.TabataEntity newItem) {
            return false;
        }
        
        public TabataComparator() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lppo/tabata/utility/TabataListAdapter$Companion;", "", "()V", "binding", "Lppo/tabata/databinding/RecyclerviewItemBinding;", "getBinding", "()Lppo/tabata/databinding/RecyclerviewItemBinding;", "setBinding", "(Lppo/tabata/databinding/RecyclerviewItemBinding;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ppo.tabata.databinding.RecyclerviewItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        ppo.tabata.databinding.RecyclerviewItemBinding p0) {
        }
        
        private Companion() {
            super();
        }
    }
}