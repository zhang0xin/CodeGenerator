package com.ysusoft.Action.purchase;

import com.ysusoft.Action.BaseQueryParams;
import com.ysusoft.Action.StringQueryParameter;
import com.ysusoft.Action.DateQueryParameter;
import com.ysusoft.Action.LongQueryParameter;
import com.ysusoft.Action.DoubleQueryParameter;

public class Ffb020avParamsAuto extends BaseQueryParams {
  
  private StringQueryParameter shipBatchId = new StringQueryParameter();
  
  private StringQueryParameter visibleDepartment = new StringQueryParameter();
  
  
  
  public StringQueryParameter getShipBatchId() {
    return shipBatchId;
  }
  public void setShipBatchId(StringQueryParameter shipBatchId) {
    this.shipBatchId = shipBatchId;
  }
  
  public StringQueryParameter getVisibleDepartment() {
    return visibleDepartment;
  }
  public void setVisibleDepartment(StringQueryParameter visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}
