package my.edu.tarc.apidemo.api


import my.edu.tarc.apidemo.model.ResultRespond
import my.edu.tarc.apidemo.model.StudentRespond
import retrofit2.Call
import retrofit2.http.*


interface MyRestAPI {

    companion object{
        val BASE_URL :String = "http://demo.onmyfinger.com/"
    }

    @GET("home/getALL")
    fun getAll () : Call <List<StudentRespond>>

    @GET("home/getbyid")
    fun getById (@Query("id") id:String) : Call <StudentRespond>

    @POST("home/Add")
    @FormUrlEncoded
    fun add(
        @Field("id") id:String,
        @Field("name") name:String,
        @Field("programme") programme:String,
        @Field("img") img:String
    ): Call <ResultRespond>

}