// Generated code from Butter Knife. Do not modify!
package com.freddy.rxbaby.func.menu2;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MenuTwoFragment$$ViewBinder<T extends com.freddy.rxbaby.func.menu2.MenuTwoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492992, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131492992, "field 'recyclerView'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
  }
}
