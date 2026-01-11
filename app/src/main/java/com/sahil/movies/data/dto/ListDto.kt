package com.sahil.movies.data.dto

import android.util.Log
import com.google.gson.annotations.SerializedName
import com.sahil.movies.domain.model.Title

data class TitleListDto(
    val id: Int,
    val title: String,
    val year: Int?,
    val type: String?,

)

data class TitleResponse(
    val titles: List<TitleListDto>
)


fun TitleListDto.toDomain(): Title {
    return Title(
        id = id,
        title = title,
        year = year,

    )
}