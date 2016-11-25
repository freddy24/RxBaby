package com.freddy.gogogo.func;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.freddy.gogogo.base.APP;
import com.freddy.gogogo.base.BaseActivity;
import com.freddy.gogogo.data.entity.Code;
import com.freddy.gogogo.func.main.MainActivity;
import com.freddy.gogogo.gen.DaoSession;
import com.freddy.gogogo.uitls.CodeUtil;
import com.orhanobut.logger.Logger;

import org.greenrobot.greendao.rx.RxDao;
import org.greenrobot.greendao.rx.RxQuery;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 *
 * Created by wujinpeng on 2016/11/25.
 */
public class LoadingActivity extends BaseActivity {

    private RxDao<Code, Long> mCodeDao;
    private RxQuery<Code> mCodeRxQuery;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaoSession daoSession = ((APP)getApplication()).getDaoSession();
        mCodeDao = daoSession.getCodeDao().rx();

        mCodeRxQuery = daoSession.getCodeDao().queryBuilder().rx();
        mCodeRxQuery.list().observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<Code>>() {
                    @Override
                    public void call(List<Code> codes) {
                        Logger.t("CODE DATA").i("codes size = %d", codes.size());
                        if (codes.size() == 0) {
                            //TODO insert data
                            insertNumberData();
                            toMainActivity();
                        }else{
                            toMainActivity();
                        }
                    }
                });


    }

    private void insertNumberData(){
        for (int i=1; i< 50; i++){
            Code code = new Code();
            code.setNumber(String.valueOf(i));
            code.setBigsmall(CodeUtil.getBigSmall(i));
            code.setAnimal(CodeUtil.getAnimal(i));
            code.setDoublesingle(CodeUtil.getDoubleSingle(i));
            code.setWave(CodeUtil.getWave(i));
            mCodeDao.insert(code);
        }
    }

    private void toMainActivity(){
        Intent intent = new Intent();
        intent.setClass(LoadingActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
