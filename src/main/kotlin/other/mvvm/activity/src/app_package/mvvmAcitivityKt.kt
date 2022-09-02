package other.mvvm.activity.src.app_package

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
fun mvvmAcitivityKt(
    applicationPackage: String?,
    activityClass: String,
    packageName: String
) = """
package ${packageName}
import android.os.Bundle
import com.lollitech.common.ui.BaseActivity
import ${applicationPackage}.databinding.Activity${activityClass}Binding
class ${activityClass}Activity : BaseActivity<Activity${activityClass}Binding>() {

    override fun initView(savedInstanceState: Bundle?) {
    
    }
    
}
"""