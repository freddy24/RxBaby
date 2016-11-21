package com.freddy.rxbaby.func.record;

import com.freddy.rxbaby.base.BasePrestener;
import com.freddy.rxbaby.base.BaseView;

/**
 * Created by wujinpeng on 2016/10/18.
 */
public class RecordContract {

    interface Presenter extends BasePrestener{

    }

    interface View extends BaseView<Presenter>{

    }
}
