package com.freddy.rxbaby.func.setting;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;

/**
 * Created by wujinpeng on 2016/10/18.
 */
public class SettingContract {

    interface Presenter extends BasePrestener{

    }

    interface View extends BaseView<Presenter>{

    }
}
