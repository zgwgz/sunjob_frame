package com.domain;

import java.io.Serializable;
import java.util.Set;

public class Dep implements Serializable {
    private  int depid;
    private  String depname;


    private Set<Emp> emps;

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }

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
