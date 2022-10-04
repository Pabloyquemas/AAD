package com.pgonrod.aad.UT01.Ex03.data

import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.stream.JsonReader
import com.pgonrod.aad.UT01.Ex03.domain.News

class NewsLocalSource(val sharedPref:SharedPreferences) {

    private val gson = Gson()

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
    //for each ejecuta el metodo setNews 10 veces
    fun setNewsList(newsList: MutableList<News>){
        newsList.forEach { news ->
            setNews(news)
        }
    }
    //para recorrer un mapa
    fun findAll() : MutableList<News> {
        val newsList = mutableListOf<News>()
        sharedPref.all.forEach{ entry ->
            val news = gson.fromJson(entry.value as String, News::class.java)
            newsList.add(news)
        }
        return newsList
    }
    fun findAllVKotlin() =  sharedPref.all.map { entry ->
            gson.fromJson(entry.value as String, News::class.java)
        }.toMutableList()
}