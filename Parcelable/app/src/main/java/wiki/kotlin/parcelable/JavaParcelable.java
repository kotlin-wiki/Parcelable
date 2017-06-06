package wiki.kotlin.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zeusc on 05/06/2017.
 */

public class JavaParcelable implements Parcelable {

    private String name;
    private boolean premium;

    public JavaParcelable(String name, boolean premium) {
        this.name = name;
        this.premium = premium;
    }

    protected JavaParcelable(Parcel in) {
        name = in.readString();
        premium = in.readByte() != 0;
    }

    public static final Creator<JavaParcelable> CREATOR = new Creator<JavaParcelable>() {
        @Override
        public JavaParcelable createFromParcel(Parcel in) {
            return new JavaParcelable(in);
        }

        @Override
        public JavaParcelable[] newArray(int size) {
            return new JavaParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeByte((byte) (premium ? 1 : 0));
    }
}
