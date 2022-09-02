package other.mvvm

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvvm.activity.mvvmActivityTemplate
import other.mvvm.fragment.mvvmFragmentTemplate

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe:
 **/
class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {
    override fun getTemplates(): List<Template> = listOf(
        // activity的模板
        mvvmActivityTemplate,
        // fragment的模板
        mvvmFragmentTemplate
    )
}