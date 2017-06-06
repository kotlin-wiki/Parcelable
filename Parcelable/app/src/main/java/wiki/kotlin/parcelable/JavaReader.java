package wiki.kotlin.parcelable;


import android.os.Parcelable;

public class JavaReader {

    public JavaReader() {

        Parcelable.Creator<JavaParcelable> javaCreator = JavaParcelable.CREATOR;
        //Parcelable.Creator<KotlinParcelable> kotlinParcelableCreator = KotlinParcelable.CREATOR;
        Parcelable.Creator<KotlinParcelable> kotlinParcelableCreator = KotlinParcelable.CREATOR;
    }


}
