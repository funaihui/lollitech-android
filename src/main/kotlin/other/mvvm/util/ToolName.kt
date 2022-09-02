package other.mvvm.util

/**
 * Copyright (c) 2022, Lollitech
 * All rights reserved
 * author: funaihui@lollitech.com
 * describe: 处理layout名称
 **/

fun layoutName2Binding(layoutName: String): String {
    val split = layoutName.split("_")
    val sb = StringBuilder()
    split.forEach {

        sb.append(it[0].toString().uppercase())
        sb.append(it.substring(1, it.length))
    }
    return sb.toString()
}