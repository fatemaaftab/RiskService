package main.java;

public class Risk {
    private boolean IsUserKnown;
    private boolean IsClientKnown;
    private boolean IsIPKnown;
    private int IsIPInternal;
    private int FailedLoginCountLastWeek;

    public int getFailedLoginCountLastWeek() {
        return FailedLoginCountLastWeek;
    }

    public boolean isUserKnown() {
        return IsUserKnown;
    }

    public boolean isClientKnown() {
        return IsClientKnown;
    }

    public void setClientKnown(boolean clientKnown) {
        IsClientKnown = clientKnown;
    }

    public int isIPInternal() {
        return IsIPInternal;
    }

    public void setIPInternal(int IPInternal) {
        IsIPInternal = IPInternal;
    }

    public boolean isIPKnown() {
        return IsIPKnown;
    }

    public void setIPKnown(boolean IPKnown) {
        IsIPKnown = IPKnown;
    }

    public void setUserKnown(boolean userKnown) {
        IsUserKnown = userKnown;
    }

    public void setFailedLoginCountLastWeek(int FailedLoginCountLastWeek) {
        this.FailedLoginCountLastWeek = FailedLoginCountLastWeek;

    }

}

