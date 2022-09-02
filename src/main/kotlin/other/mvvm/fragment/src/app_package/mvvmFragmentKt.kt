package other.mvvm.fragment.src.app_package

import other.mvvm.util.layoutName2Binding

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
fun mvvmFragmentKt(fragmentClass: String, packageName: String, layoutName: String) = """
package $packageName
import android.os.Bundle
class ${fragmentClass}Fragment : BaseFragment<${layoutName2Binding(layoutName)}Binding>() {

    override fun initView(savedInstanceState: Bundle?) {
    
    }
    
}
"""