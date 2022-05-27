package io.zoemeow.dutapp

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.zoemeow.dutapp.model.LinkItem
import io.zoemeow.dutapp.model.NewsGlobalItem
import kotlin.collections.ArrayList

class LinkItemConverter {
    @TypeConverter
    fun fromLinks(jsonData: String): ArrayList<LinkItem> {
        val gson = Gson()
        val myType = object : TypeToken<ArrayList<LinkItem>>() {}.type
        return gson.fromJson<ArrayList<LinkItem>>(jsonData, myType)
    }

    @TypeConverter
    fun linksToString(arr: ArrayList<LinkItem>): String {
        val gson = Gson()
        return gson.toJson(arr)
    }
}