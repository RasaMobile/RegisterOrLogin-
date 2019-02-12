package com.rassa.rassauser.user.edit.profile;

public interface iUserEditInfo {

    void onStartSetUserInfo();
    void setUserInfoSuccess();
    void setUserInfoFailed(String msg);
}
