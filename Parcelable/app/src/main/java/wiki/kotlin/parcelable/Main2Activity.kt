package wiki.kotlin.parcelable

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var kotlinParcel = intent.getParcelableExtra<KotlinParcelable>("test")
        println("ok =]")

    }
}
