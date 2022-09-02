package other.mvvm.activity.src.app_package

import other.mvvm.util.layoutName2Binding

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe: 生成Activity模板代码
 **/
fun mvvmActivityKt(activityClass: String, packageName: String, layoutName: String) = """
package $packageName
import android.os.Bundle
class ${activityClass}Activity : BaseActivity<${layoutName2Binding(layoutName)}Binding>() {

    override fun initView(savedInstanceState: Bundle?) {
    
    }
    
}
"""

