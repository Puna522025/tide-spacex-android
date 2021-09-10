// Generated by view binder compiler. Do not edit!
package com.tide.spacex.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.tide.spacex.ui.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BaseActivityBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout baseContainer;

  private BaseActivityBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout baseContainer) {
    this.rootView = rootView;
    this.baseContainer = baseContainer;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BaseActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BaseActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.base_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BaseActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.baseContainer;
      FrameLayout baseContainer = rootView.findViewById(id);
      if (baseContainer == null) {
        break missingId;
      }

      return new BaseActivityBinding((LinearLayout) rootView, baseContainer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}