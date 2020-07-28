package com.yishay.endroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Architecture(var tutor: String, var uri: String) : Parcelable {

    object Supplier {

        val examples = listOf(
            Architecture("Android stack\n" +
                    "Android is a full software stack",
                "dvu8TrI2xGE"),
            Architecture("Android system\n" +
                    "During development your app is receiving calls and communicating with the system",
                "ptku9IhFBQk"),
            Architecture("JDK\n" +
                    "JDK the java development kit is a suite of tools to build write and run code",
                "krYAlDHhR08"),
            Architecture("JRE\n" +
                    "JRE is a java runtime environment meaning it runs in an instance on the operating system",
                "nbhgfvnxG2c"),
            Architecture("Java compilation\n" +
                    "Java is compiled into byte code before it is compiled into machine code",
                "-cPGSEef-JM"),
            Architecture("Byte code\n" +
                    "Byte code is run on the JVM the JVM is platform dependent",
                "brrrhSlSGjs"),
                    Architecture("Dalvik\n" +
                    "Dalvik byte code runs on the dalvik virtual machine",
            "tl8WJi-obJU"),
            Architecture("Sandbox\n" +
                    "Android apps run in their own virtual machine instance and can't access data from outside",
                "8IG5Y_sftGM"),
            Architecture("Multi programming\n" +
                    "In android you get a wide range of experience",
                "pDGkYD-W9us")
        )

    }
}