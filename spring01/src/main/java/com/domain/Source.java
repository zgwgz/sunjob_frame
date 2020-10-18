package com.domain;

public class Source {
    private  Integer zf;
    private  Integer mc;

    @Override
    public String toString() {
        return "Source{" +
                "zf=" + zf +
                ", mc=" + mc +
                '}';
    }

    public Integer getZf() {
        return zf;
    }

    public void setZf(Integer zf) {
        this.zf = zf;
    }

    public Integer getMc() {
        return mc;
    }

    public void setMc(Integer mc) {
        this.mc = mc;
    }
}
