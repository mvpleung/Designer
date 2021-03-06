package com.jojo.design.module_mall.net

import com.jojo.design.common_base.net.RetrofitManager

/**
 *    author : JOJO
 *    e-mail : 18510829974@163.com
 *    date   : 2018/12/7 4:11 PM
 *    desc   : 单例提供Retrofit请求的Service
 */
object NetMallProvider {

    val requestService: ApiMallService
        get() = RetrofitManager.getRetrofit().create<ApiMallService>(ApiMallService::class.java)
}