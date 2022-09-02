package other.mvvm.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.mvvm.fragment.res.layout.mvvmFragmentXml
import other.mvvm.fragment.src.app_package.mvvmFragmentKt

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
fun RecipeExecutor.mvvmFragmentRecipe(
    moduleData: ModuleTemplateData,
    fragmentClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvvmFragment = mvvmFragmentKt(fragmentClass, packageName,layoutName)
    // 保存Fragment
    save(mvvmFragment, srcOut.resolve("${fragmentClass}Fragment.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmFragmentXml(), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
//    save(mvvmViewModel(packageName, activityClass), srcOut.resolve("${activityClass}ViewModel.${ktOrJavaExt}"))
    // 保存repository
//    save(mvvmRepository(packageName, activityClass), srcOut.resolve("${activityClass}Repository.${ktOrJavaExt}"))
}