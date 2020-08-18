/**
* Copyright (c) Facebook, Inc. and its affiliates.
*
* This source code is licensed under the MIT license found in the
* LICENSE file in the root directory of this source tree.
*
* @generated by codegen project: GeneratePropsJavaInterface.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;

public interface AndroidDialogPickerManagerInterface<T extends View> {
  void setColor(T view, @Nullable Integer value);
  void setBackgroundColor(T view, @Nullable Integer value);
  void setEnabled(T view, boolean value);
  void setItems(T view, @Nullable ReadableArray value);
  void setPrompt(T view, @Nullable String value);
  void setSelected(T view, int value);
}
