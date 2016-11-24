package com.freddy.gogogo.func.record;

import com.freddy.gogogo.base.BasePrestener;
import com.freddy.gogogo.base.BaseView;

/**
 * Created by wujinpeng on 2016/10/18.
 */
public class RecordContract {

    interface Presenter extends BasePrestener{

    }

    interface View extends BaseView<Presenter>{

    }
}
