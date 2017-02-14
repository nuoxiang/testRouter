package think.router;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dazhuanjia_rx on 17/2/13.
 */

public class B implements Parcelable {
    public String text;
    public int age;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.text);
        dest.writeInt(this.age);
    }

    public B() {
    }

    protected B(Parcel in) {
        this.text = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<B> CREATOR = new Parcelable.Creator<B>() {
        @Override
        public B createFromParcel(Parcel source) {
            return new B(source);
        }

        @Override
        public B[] newArray(int size) {
            return new B[size];
        }
    };
}
