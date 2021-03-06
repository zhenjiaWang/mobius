package com.mobius.entity.futures;

import com.mobius.entity.sys.SysTrade;
import org.guiceside.persistence.entity.IdEntity;
import org.guiceside.persistence.entity.Tracker;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 12-8-15
 * Time: 下午4:26
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "FUTURES_DAILY_BTC")
public class FuturesDailyBtc extends IdEntity implements Tracker {

    private static final long serialVersionUID = 1L;

    private Long id;

    private SysTrade tradeId;

    private FuturesSymbol symbolId;

    private Date tradingDay;

    private Double lastPrice;

    private Double marketValue;

    private Double volume;

    private Double turnover;

    private Double liquidity;

    private Date created;

    private String createdBy;

    private Date updated;

    private String updatedBy;

    private String useYn;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRADE_ID")
    public SysTrade getTradeId() {
        return tradeId;
    }

    public void setTradeId(SysTrade tradeId) {
        this.tradeId = tradeId;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYMBOL_ID")
    public FuturesSymbol getSymbolId() {
        return symbolId;
    }

    public void setSymbolId(FuturesSymbol symbolId) {
        this.symbolId = symbolId;
    }

    @Column(name = "TRADING_DAY")
    public Date getTradingDay() {
        return tradingDay;
    }

    public void setTradingDay(Date tradingDay) {
        this.tradingDay = tradingDay;
    }



    @Column(name = "LAST_PRICE")
    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    @Column(name = "MARKET_VALUE")
    public Double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(Double marketValue) {
        this.marketValue = marketValue;
    }

    @Column(name = "VOLUME")
    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Column(name = "TURNOVER")
    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    @Column(name = "LIQUIDITY")
    public Double getLiquidity() {
        return liquidity;
    }

    public void setLiquidity(Double liquidity) {
        this.liquidity = liquidity;
    }

    @Column(name = "CREATED", updatable = false)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "CREATED_BY")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "UPDATED")
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Column(name = "UPDATED_BY")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "USE_YN")
    public String getUseYn() {
        return useYn;
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }
}
