package com.example.app_serv

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface QuotesApi {
//    @GET("/bl /test /quotes")
    @GET("/bl")
    suspend fun getQuotes(): Response<QuoteList>
//    Response

    @GET("/au")
    suspend fun getAuthor(): Response<AuthorList>

    @POST("/bl")
    suspend fun postQuotes(@Body json: String)
}
