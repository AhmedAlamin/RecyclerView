package android.example.myapplication;

public class AccountCell {

    private String mAccountName;
    private String mAccountEmail;
    private int mImageOfAccount;

    public AccountCell(String mAccountName, String mAccountEmail, int mImageOfAccount) {
        this.mAccountName = mAccountName;
        this.mAccountEmail = mAccountEmail;
        this.mImageOfAccount = mImageOfAccount;
    }

    public String getmAccountName() {
        return mAccountName;
    }

    public String getmAccountEmail() {
        return mAccountEmail;
    }

    public int getmImageOfAccount() {
        return mImageOfAccount;
    }
}
