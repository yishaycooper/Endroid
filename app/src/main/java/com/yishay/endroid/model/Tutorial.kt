package com.yishay.endroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Tutorial(var tutor: String, var uri: String) : Parcelable {

    object Supplier {

        val examples = listOf(
            Tutorial( "This keyword \n" +
                    "this keword in kotlin means the object currently \n" +
                    "instantiated or calling this method.\n",
                "IkZeDTOVe14"),
            Tutorial( "Lambda function\n" +
                    "When a lambda function is passed to a higher\n" +
                    "Order function it can look like a function body.\n",
                "EmhlFgaeHjo"),
            Tutorial( "Apply and also are higher order functions that \n" +
                    "receive a lambda function to be executed and \n" +
                    "returned with the modified object.\n",
                "t4CDJOUIHkc"),
            Tutorial( "With run and let functions\n" +
                    "With run and let functions can return any type they \n" +
                    "are not part of the language but rather a part of the\n" +
                    " standard kotlin library.\n",
                "THVES0YJwfQ"),
            Tutorial( "Primary and secondary constructors\n" +
                    "Initialization of primary constructor is executed\n" +
                    "before secondary constructor, secondary\n" +
                    "constructorcan then call primary constructor using this\n",
                "gt_MZrXdH3Y"),
            Tutorial( "Parentheses are used to call a function,\n" +
                    "that is why we need to sets of parentheses\n" +
                    "one to call the first function and one to call\n" +
                    "the returned function.\n",
                "k7aLOpcrJcs"),
            Tutorial("Object in kotlin\n" +
                    "In kotlin object is used to create a singleton.\n",
                "mSlxB7_fzvw")
        )

    }
}