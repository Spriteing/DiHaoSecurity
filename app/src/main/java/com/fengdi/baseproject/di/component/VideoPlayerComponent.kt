package com.fengdi.baseproject.di.component

import dagger.Component
import com.jess.arms.di.component.AppComponent

import com.fengdi.baseproject.di.module.VideoPlayerModule

import com.jess.arms.di.scope.ActivityScope
import com.fengdi.baseproject.mvp.ui.activity.home.VideoPlayerActivity


/**
 * ================================================
 * Description:
 * <p>
 * Created by Yangjie on 09/09/2020 15:27


 * ================================================
 */
@ActivityScope
@Component(modules = arrayOf(VideoPlayerModule::class), dependencies = arrayOf(AppComponent::class))
interface VideoPlayerComponent {
    fun inject(activity: VideoPlayerActivity)
}
