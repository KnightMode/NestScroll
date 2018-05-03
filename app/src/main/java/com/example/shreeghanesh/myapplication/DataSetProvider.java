package com.example.shreeghanesh.myapplication;

public class DataSetProvider {
    private static final int DATASET_COUNT = 30;

    /**
     * Generates Strings for RecyclerView's adapter. This data would usually come
     * from a local content provider or remote server.
     */
    public static String[] generateDataset() {
        String[] mDataset = new String[DATASET_COUNT];
        for (int i = 0; i < DATASET_COUNT; i++) {
            mDataset[i] = "This is element #" + i;
        }
        return mDataset;
    }
}
