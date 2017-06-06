package wiki.kotlin.parcelable

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kotlinParcel = KotlinParcelable("andre",true)

        val i = Intent(this,Main2Activity::class.java)
        i.putExtra("test",kotlinParcel)
        startActivity(i)
    }
}
