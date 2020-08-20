package com.hwa.restonplaceholder.data

import com.google.gson.annotations.SerializedName

data class Veli(@SerializedName("data")
                val data: List<DataItem>?,
                @SerializedName("status")
                val status: String = "")