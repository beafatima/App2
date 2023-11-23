/*package com.example.app2.ui.gameplay;

import androidx.lifecycle.ViewModel;

public class GameplayViewModel extends ViewModel {
    // TODO: Implement the ViewModel
}
*/

package com.example.app2.ui.gameplay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GameplayViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GameplayViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gameplay fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}