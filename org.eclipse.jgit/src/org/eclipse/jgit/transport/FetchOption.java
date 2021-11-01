package org.eclipse.jgit.transport;

public class FetchOption {

    enum FetchOptionParam{
        DEPTH
    }

    public FetchOption(FetchOptionParam param, Object value) {
        this.param = param;
        this.value = value;
    }

    private FetchOptionParam param;

    private Object value;

    public FetchOptionParam getParam() {
        return param;
    }

    public void setParam(FetchOptionParam param) {
        this.param = param;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
