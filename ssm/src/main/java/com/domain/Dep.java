package com.domain;

public class Dep {
    private  int depid;
    private  String depname;

    @Override
    public String toString() {
        return "Dep{" +
                "depid=" + depid +
                ", depname='" + depname + '\'' +
                '}';
    }

    public int getDepid() {
        return depid;
    }

    public void setDepid(int depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }
}
