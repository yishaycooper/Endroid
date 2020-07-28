package com.yishay.endroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Guide(var tutor: String, var uri: String) : Parcelable {

    object Supplier {

        val examples = listOf(
            Guide("Experience\n" +
                    "There are thing you can only learn by experience",
                "DwvcFx6dgAw"),
            Guide("Thinking\n" +
                    "Thinking good ",
                "mq1HTOA95Gw"),
            Guide("My way\n" +
                    "What is your way?",
                "l0RH5KoB4xg"),
            Guide("Turorials\n" +
                    "Balance between knowledge and experience",
                "3TuZJEojaOE"),
            Guide("Functionality\n" +
                    "Thinkin general then into details",
                "aO6nTyFlSp4"),
            Guide("Rubber duck\n" +
                     "The solution is right in front of you ask the duck",
                "dQiA_YOM37o"),
            Guide("Self taut\n" +
                    "Self taut learn how to learn",
                "l3lDPj4kIxA")
        )

    }
}