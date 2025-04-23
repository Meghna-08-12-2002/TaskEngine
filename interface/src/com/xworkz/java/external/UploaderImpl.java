package com.xworkz.java.external;

import com.xworkz.java.internal.Uploader;

public class UploaderImpl implements Uploader {
    public void upload() {
        System.out.println("UploaderImpl: upload");
    }
    public void pauseUpload() {
        System.out.println("UploaderImpl: pauseUpload");
    }
    public void cancelUpload() {
        System.out.println("UploaderImpl: cancelUpload");
    }
}
