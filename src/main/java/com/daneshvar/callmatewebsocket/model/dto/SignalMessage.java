package com.daneshvar.callmatewebsocket.model.dto;


public class SignalMessage {
    private String fromId;
    private String toId;
    private String type;
    private Object data; // می‌تونه SDP یا ICE candidate باشه

    // getter و setter
    public String getFromId() { return fromId; }
    public void setFromId(String fromId) { this.fromId = fromId; }

    public String getToId() { return toId; }
    public void setToId(String toId) { this.toId = toId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}
