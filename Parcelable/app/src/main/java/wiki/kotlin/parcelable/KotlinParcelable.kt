package wiki.kotlin.parcelable

import android.os.Parcel
import android.os.Parcelable

class KotlinParcelable(var name : String, var premium : Boolean) : Parcelable{


    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeBoolean(premium)
    }

    override fun describeContents() = 0

    companion object{
        @JvmField val CREATOR = object : Parcelable.Creator<KotlinParcelable>{
            override fun createFromParcel(source: Parcel) = KotlinParcelable(source.readString(), source.readBoolean())
            override fun newArray(size: Int) = arrayOfNulls<KotlinParcelable>(size)

        }
    }


}