package com.yishay.endroid.model

data class Tutorials(var title: String)

object Supplier {

    val examples = listOf(
        Tutorials("ViewModel"),
        Tutorials("WebView"),
        Tutorials("YouTube"),
        Tutorials("RecyclerView"),
        Tutorials("LiveData"),
        Tutorials("DataBinding"),
        Tutorials("CardView"),
        Tutorials("Gradient")
    )

    val tutorials = listOf(
        Tutorials("This Keyword"),
        Tutorials("Lambda Parameter"),
        Tutorials("Apply Also"),
        Tutorials("With Run Apply"),
        Tutorials("Constructors"),
        Tutorials("Function as return"),
        Tutorials("Object")
    )

    val guide = listOf(
        Tutorials("Experience"),
        Tutorials("Think"),
        Tutorials("Right way"),
        Tutorials("Tutorials"),
        Tutorials("Functionality"),
        Tutorials("Rubber duck"),
        Tutorials("Self taut")
    )

    val studio = listOf(
        Tutorials("IDE"),
        Tutorials("Panes"),
        Tutorials("Look"),
        Tutorials("code & UI"),
        Tutorials("Code file"),
        Tutorials("Structure"),
        Tutorials("GitHub")
    )

    val architecture = listOf(
        Tutorials("stack"),
        Tutorials("System"),
        Tutorials("JDK"),
        Tutorials("JRE"),
        Tutorials("Compilation"),
        Tutorials("Byte code"),
        Tutorials("Dalvik"),
        Tutorials("Sandbox"),
        Tutorials("Multi environment")
    )

}