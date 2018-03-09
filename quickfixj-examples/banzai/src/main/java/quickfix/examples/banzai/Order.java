/*******************************************************************************
 * Copyright (c) quickfixengine.org  All rights reserved.
 *
 * This file is part of the QuickFIX FIX Engine
 *
 * This file may be distributed under the terms of the quickfixengine.org
 * license as defined by quickfixengine.org and appearing in the file
 * LICENSE included in the packaging of this file.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING
 * THE WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE.
 *
 * See http://www.quickfixengine.org/LICENSE for licensing information.
 *
 * Contact ask@quickfixengine.org if any conditions of this licensing
 * are not clear to you.
 ******************************************************************************/

package quickfix.examples.banzai;

import quickfix.SessionID;

import java.util.HashMap;
import java.util.Map;

public class Order implements Cloneable {
    private SessionID sessionID = null;
    private String symbol = null;
    private String quantity = null;
    private String open = null;
    private String executed = null;
    private OrderSide side = OrderSide.BUY;
    private OrderType type = OrderType.MARKET;
    private OrderTIF tif = OrderTIF.DAY;
    private String limit = null;
    private String stop = null;
    private String avgPx = null;
    private boolean rejected = false;
    private boolean canceled = false;
    private boolean isNew = true;
    private String message = null;
    private String ID = null;
    private String originalID = null;
    private static int nextID = 1;
    private Map<Integer, String> data = new HashMap<>();

    public Order() {
        ID = generateID();
    }

    public Order(String ID) {
        this.ID = ID;
    }

    public Object clone() {
        try {
            Order order = (Order) super.clone();
            order.setOriginalID(getID());
            order.setID(order.generateID());
            return order;
        } catch (CloneNotSupportedException e) {}
        return null;
    }

    public String generateID() {
        return Long.toString(System.currentTimeMillis() + (nextID++));
    }

    public SessionID getSessionID() {
        return sessionID;
    }

    public void setSessionID(SessionID sessionID) {
        this.sessionID = sessionID;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getExecuted() {
        return executed;
    }

    public void setExecuted(String executed) {
        this.executed = executed;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    public OrderTIF getTIF() {
        return tif;
    }

    public void setTIF(OrderTIF tif) {
        this.tif = tif;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }


    public void setAvgPx(String avgPx) {
        this.avgPx = avgPx;
    }

    public String getAvgPx() {
        return avgPx;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }

    public boolean getRejected() {
        return rejected;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public boolean getCanceled() {
        return canceled;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setOriginalID(String originalID) {
        this.originalID = originalID;
    }

    public String getOriginalID() {
        return originalID;
    }

    public Map<Integer, String> getData() {
        return data;
    }

    public void setData(Map<Integer, String> data) {
        this.data = data;
    }
}
