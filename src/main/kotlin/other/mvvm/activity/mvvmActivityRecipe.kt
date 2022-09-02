package other.mvvm.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.generateManifest
import other.mvvm.activity.src.app_package.mvvmActivityKt
import other.mvvm.activity.res.layout.mvvmActivityXml

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
fun RecipeExecutor.mvvmActivityRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//        packageName = packageName,
//        hasApplicationBlock = false,
//        usesFeatureBlock = """
//             <activity
//            android:name="$activityClass"Activity"
//            android:exported="false"
//            android:label=""
//            android:screenOrientation="portrait" />
//        """.trimIndent(),
//        hasRoundIcon = false,
//        appCategory = """
//
//        """.trimIndent()
//    )

//    generateManifest(
//        moduleData = moduleData,
//        activityClass = "",
//        packageName = "",
//        isLauncher = false,
//        activityThemeName = "",
//        hasNoActionBar = false,
//        generateActivityTitle = false,
//    )

    val mvvmActivity = mvvmActivityKt(activityClass, packageName, layoutName)
    // 保存Activity
    save(mvvmActivity, srcOut.resolve("${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmActivityXml(), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
//    save(mvvmViewModel(packageName, activityClass), srcOut.resolve("${activityClass}ViewModel.${ktOrJavaExt}"))
    // 保存repository
//    save(mvvmRepository(packageName, activityClass), srcOut.resolve("${activityClass}Repository.${ktOrJavaExt}"))
}