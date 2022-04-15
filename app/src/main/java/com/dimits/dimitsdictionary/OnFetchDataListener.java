package com.dimits.dimitsdictionary;

import com.dimits.dimitsdictionary.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
