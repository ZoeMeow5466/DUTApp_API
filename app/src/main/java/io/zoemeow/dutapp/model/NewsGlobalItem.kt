package io.zoemeow.dutapp.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*
import kotlin.collections.ArrayList

data class NewsGlobalItem(
    @Expose
    var id: String = UUID.randomUUID().toString(),
    var date: Long? = null,
    var title: String? = null,

    @SerializedName("contenttext")
    var contentText: String? = null,

    var links: ArrayList<LinkItem>? = null,
)
