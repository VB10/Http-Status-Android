package com.hwa.restonplaceholder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hwa.restonplaceholder.data.HttpCatModel
import com.hwa.restonplaceholder.service.ApiClient
import com.hwa.restonplaceholder.ui.DataAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var dataList = ArrayList<HttpCatModel>()
    lateinit var recylerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recylerView = findViewById(R.id.recyler_view)

        recylerView.adapter = DataAdapter(dataList, this)
        recylerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        getData()
    }

    fun getData() {
        val call: Call<List<HttpCatModel>> = ApiClient.getClient.getHttpCatList()
        call.enqueue(object : Callback<List<HttpCatModel>> {
            override fun onFailure(call: Call<List<HttpCatModel>>?, t: Throwable?) {
                Toast.makeText(this@MainActivity,"",Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(
                call: Call<List<HttpCatModel>>?,
                response: Response<List<HttpCatModel>>?
            ) {
                if (response != null) {
                    dataList.addAll(response.body())
                    recylerView.adapter?.notifyDataSetChanged()
                }

            }

        })
    }
}
