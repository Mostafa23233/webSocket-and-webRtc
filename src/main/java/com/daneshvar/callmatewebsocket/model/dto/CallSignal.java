package com.daneshvar.callmatewebsocket.model.dto;

public class CallSignal {
    private String type;   // call_request, call_answer, ice_candidate, hangup
    private String fromId;
    private String toId;
    private String sdp;    
    private String candidate; // ICE candidate
    private Object data;

    // getter / setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getFromId() { return fromId; }
    public void setFromId(String fromId) { this.fromId = fromId; }
    public String getToId() { return toId; }
    public void setToId(String toId) { this.toId = toId; }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSdp() { return sdp; }
    public void setSdp(String sdp) { this.sdp = sdp; }
    public String getCandidate() { return candidate; }
    public void setCandidate(String candidate) { this.candidate = candidate; }

    public Object getData() { return data; }
}
