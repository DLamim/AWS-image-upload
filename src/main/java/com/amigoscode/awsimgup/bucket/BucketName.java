package com.amigoscode.awsimgup.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-image-upload-diotuba");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
