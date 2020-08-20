package com.hwa.restonplaceholder.data

import com.google.gson.annotations.SerializedName

data class DataItem(@SerializedName("profile_image")
                    val profileImage: String = "",
                    @SerializedName("employee_name")
                    val employeeName: String = "",
                    @SerializedName("employee_salary")
                    val employeeSalary: String = "",
                    @SerializedName("id")
                    val id: String = "",
                    @SerializedName("employee_age")
                    val employeeAge: String = "")