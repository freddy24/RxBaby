// Generated code from Butter Knife. Do not modify!
package com.freddy.rxbaby.func.main;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainFragment$$ViewBinder<T extends com.freddy.rxbaby.func.main.MainFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492988, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131492988, "field 'viewPager'");
    view = finder.findRequiredView(source, 2131492987, "field 'tlTabs'");
    target.tlTabs = finder.castView(view, 2131492987, "field 'tlTabs'");
  }

  @Override public void unbind(T target) {
    target.viewPager = null;
    target.tlTabs = null;
  }
}
