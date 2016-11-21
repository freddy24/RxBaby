// Generated code from Butter Knife. Do not modify!
package com.freddy.rxbaby.func.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.freddy.rxbaby.func.main.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492987, "field 'tlTabs'");
    target.tlTabs = finder.castView(view, 2131492987, "field 'tlTabs'");
  }

  @Override public void unbind(T target) {
    target.tlTabs = null;
  }
}
