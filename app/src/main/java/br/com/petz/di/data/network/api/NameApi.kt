package br.com.petz.di.data.network.api

import br.com.petz.di.data.network.response.GetNameResponse
import retrofit2.Response
import retrofit2.http.GET

interface NameApi {

    @GET("<<MyJson estava fora assim que voltar vou gerar o link>>")
    fun getName(): Response<GetNameResponse>
}

