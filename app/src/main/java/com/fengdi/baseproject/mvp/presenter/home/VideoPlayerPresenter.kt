package com.fengdi.baseproject.mvp.presenter.home

import android.app.Application

import com.jess.arms.integration.AppManager
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.mvp.BasePresenter
import com.jess.arms.http.imageloader.ImageLoader
import me.jessyan.rxerrorhandler.core.RxErrorHandler
import javax.inject.Inject

import com.fengdi.baseproject.mvp.contract.home.VideoPlayerContract


/**
 * ================================================
 * Description:
 * <p>
 * Created by Yangjie on 09/09/2020 15:27


 * ================================================
 */
@ActivityScope
class VideoPlayerPresenter
@Inject
constructor(model: VideoPlayerContract.Model, rootView: VideoPlayerContract.View) :
        BasePresenter<VideoPlayerContract.Model, VideoPlayerContract.View>(model, rootView) {
    @Inject
    lateinit var mErrorHandler: RxErrorHandler

    @Inject
    lateinit var mApplication: Application

    @Inject
    lateinit var mImageLoader: ImageLoader

    @Inject
    lateinit var mAppManager: AppManager


    override fun onDestroy() {
        super.onDestroy();
    }
}
