package com.example.qualtribe.models;

public class SubmittedOrder {

    String requirements;
    String orderId;
    String attachmentUrl;

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SubmittedOrder() {
    }

    public SubmittedOrder(String requirements, String orderId) {
        this.requirements = requirements;
        this.orderId = orderId;
    }

    public SubmittedOrder(String orderId) {
        this.orderId = orderId;
    }

    public SubmittedOrder(String requirements, String orderId, String attachmentUrl) {
        this.requirements = requirements;
        this.orderId = orderId;
        this.attachmentUrl = attachmentUrl;
    }
}
