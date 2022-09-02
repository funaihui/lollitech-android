package other.mvvm.fragment.src.app_package

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
fun mvvmFragmentKt(
    applicationPackage: String?,
    activityClass: String,
    packageName: String
) = """
package $packageName
import android.os.Bundle
import com.lollitech.common.ui.BaseFragment
import ${applicationPackage}.databinding.Fragment${activityClass}Binding
class ${activityClass}Fragment : BaseFragment<Fragment${activityClass}Binding>() {

    override fun initView(savedInstanceState: Bundle?) {
    
    }
    
}
"""