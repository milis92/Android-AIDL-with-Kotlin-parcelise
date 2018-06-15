package forestgump.kotlin_playground.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product(val value1: String, val value2: String) : Parcelable