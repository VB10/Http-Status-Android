package com.hwa.restonplaceholder.data

import com.google.gson.annotations.SerializedName

data class SampleModel(@SerializedName("imageUrl")
                       val imageUrl: String = "",
                       @SerializedName("description")
                       val description: String = "",
                       @SerializedName("statusCode")
                       val statusCode: Int = 0)