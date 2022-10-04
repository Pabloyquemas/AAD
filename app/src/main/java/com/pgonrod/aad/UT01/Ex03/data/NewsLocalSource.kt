package com.pgonrod.aad.UT01.Ex03.data

import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import com.pgonrod.aad.UT01.Ex03.domain.News

class NewsLocalSource(val sharedPref:SharedPreferences) {

    fun setNews(news: News){
        val gson = Gson ()
        val jsonNews = gson.toJson(news, News::class.java)
        val editor = sharedPref.edit()

        editor.putString(news.id.toString(), jsonNews)
        editor.apply()
    }

    fun findByid(newsId : Int): News? {
        val gson = Gson()

        val jsonNews = sharedPref.getString(newsId.toString(),"")

        return gson.fromJson(jsonNews, News::class.java)
    }
    fun setNewsList(newsList: MutableList<News>){
        newsList.forEach {
            news ->
        }
    }

    fun findAll() : MutableList<News>{
        return mutableListOf()
    }
}