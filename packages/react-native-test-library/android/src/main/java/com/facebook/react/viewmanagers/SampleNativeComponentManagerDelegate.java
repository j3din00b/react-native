/**
* This code was generated by [react-native-codegen](https://www.npmjs.com/package/react-native-codegen).
*
* Do not edit this file as changes may cause incorrect behavior and will be lost
* once the code is regenerated.
*
* @generated by codegen project: GeneratePropsJavaDelegate.js
*/

package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;

public class SampleNativeComponentManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & SampleNativeComponentManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
  public SampleNativeComponentManagerDelegate(U viewManager) {
    super(viewManager);
  }
  @Override
  public void setProperty(T view, String propName, @Nullable Object value) {
    switch (propName) {
      case "opacity":
        mViewManager.setOpacity(view, value == null ? 0f : ((Double) value).floatValue());
        break;
      case "values":
        mViewManager.setValues(view, (ReadableArray) value);
        break;
      default:
        super.setProperty(view, propName, value);
    }
  }

  @Override
  public void receiveCommand(T view, String commandName, @Nullable ReadableArray args) {
    switch (commandName) {
      case "changeBackgroundColor":
        mViewManager.changeBackgroundColor(view, args.getString(0));
        break;
    }
  }
}
