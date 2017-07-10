package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.FaceDetector;

// DONE (1): Create a Java class called Emojifier
// DONE (2): Create a static method in the Emojifier class called detectFaces() which detects and logs the number of faces in a given bitmap.
public class Emojifier {
    private static final String TAG = Emojifier.class.getSimpleName();

    public static void detectFaces(Context context, Bitmap bitmap) {
        FaceDetector faceDetector = new FaceDetector.Builder(context).build();
        int facesDetected =
                faceDetector.detect(new Frame.Builder().setBitmap(bitmap).build()).size();

        if (facesDetected == 0) {
            Toast.makeText(context, "No faces detected", Toast.LENGTH_SHORT).show();
        } else {
            Log.d(TAG, "detectFaces: " + facesDetected);
        }
    }
}
