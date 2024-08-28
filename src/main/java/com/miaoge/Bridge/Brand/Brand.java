package com.miaoge.Bridge.Brand;

import com.miaoge.Bridge.Software.Software;

public abstract class Brand {
    abstract public void run();

    public Software software;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }
}
