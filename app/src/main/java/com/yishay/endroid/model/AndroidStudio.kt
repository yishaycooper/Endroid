package com.yishay.endroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AndroidStudio(var tutor: String, var uri: String) : Parcelable {

    object Supplier {

        val examples = listOf(
            AndroidStudio("IDE\n" +
                    "an IDE is a tool that combines many other tools to help and eas development",
                "d3zpBU5izQ0"),
            AndroidStudio("Android studio panes\n" +
                    "Android studio provides menus toolbars and panes for setup navigation and development",
                "A-n5Ub1YZ0U"),
            AndroidStudio("Android studio look\n" +
                    "Android studio is very customizable therefore projects of other developer may look" +
                " very different than yours",
                "xoXC0mpzbIU"),
            AndroidStudio("Android studio code and UI\n" +
                    "Android uses java or kotin for code manipulation and XML for presentation",
                "FCRZyWT97Ek"),
            AndroidStudio("Code file\n" +
                    "There is nothing magical about a files that contain code",
                "tRDR3tdoRKQ"),
            AndroidStudio("Project structure\n" +
                    "Structure and naming have their own conventions",
                "FKtJQiOLEDs"),
            AndroidStudio("GitHub import\n" +
                    "When Import to github after deleting github repository \n" +
                    "You should delete the file associated with the\n" +
                    " Repository as well.\n",
                "u6MaR0NPx4o")
        )

    }
}