package com.listadecompras.persistence;

import android.app.Application;

import com.listadecompras.entity.DaoMaster;
import com.listadecompras.entity.DaoSession;
import com.listadecompras.entity.Market;

public class ListApp extends Application {
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        mDaoSession = new DaoMaster(
                new DaoMaster.DevOpenHelper(this, "listadecompras.db").getWritableDb()).newSession();


        // USER CREATION FOR DEMO PURPOSE
        if(mDaoSession.getMarketDao().loadAll().size() == 0){
            mDaoSession.getMarketDao().insert(new Market(1L, "Carrefour"));
        }
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
}
