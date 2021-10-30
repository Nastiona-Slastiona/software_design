// Generated by view binder compiler. Do not edit!
package ppo.tabata.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import ppo.tabata.R;

public final class FragmentTabataListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final RecyclerView recyclerview;

  private FragmentTabataListBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fab, @NonNull RecyclerView recyclerview) {
    this.rootView = rootView;
    this.fab = fab;
    this.recyclerview = recyclerview;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTabataListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTabataListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_tabata_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTabataListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.recyclerview;
      RecyclerView recyclerview = rootView.findViewById(id);
      if (recyclerview == null) {
        break missingId;
      }

      return new FragmentTabataListBinding((ConstraintLayout) rootView, fab, recyclerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
