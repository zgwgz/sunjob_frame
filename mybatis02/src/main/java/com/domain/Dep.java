package com.domain;

import java.io.Serializable;

public class Dep implements Serializable {
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
