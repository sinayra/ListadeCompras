package com.listadecompras.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class JoinPurchaseMarket {
    @Id
    private Long id;
    private Long purchaseId;
    private Long marketId;
    @Generated(hash = 1643153174)
    public JoinPurchaseMarket(Long id, Long purchaseId, Long marketId) {
        this.id = id;
        this.purchaseId = purchaseId;
        this.marketId = marketId;
    }
    @Generated(hash = 956722085)
    public JoinPurchaseMarket() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPurchaseId() {
        return this.purchaseId;
    }
    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }
    public Long getMarketId() {
        return this.marketId;
    }
    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }
}
