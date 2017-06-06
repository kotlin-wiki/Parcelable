package wiki.kotlin.parcelable

import android.os.Parcel


fun Parcel.writeBoolean(value : Boolean){
    writeByte(if(value) 1 else 0)
}
fun Parcel.readBoolean() = (readByte().toInt()!=0)