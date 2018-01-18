package com.ysusoft.Action.purchase;

import com.ysusoft.Action.BaseQueryParams;
import com.ysusoft.Action.StringQueryParameter;
import com.ysusoft.Action.DateQueryParameter;
import com.ysusoft.Action.LongQueryParameter;
import com.ysusoft.Action.DoubleQueryParameter;

public class Ffb060avParamsAuto extends BaseQueryParams {
  
  private StringQueryParameter contractNumber = new StringQueryParameter();
  
  private StringQueryParameter visibleDepartment = new StringQueryParameter();
  
  
  
  public StringQueryParameter getContractNumber() {
    return contractNumber;
  }
  public void setContractNumber(StringQueryParameter contractNumber) {
    this.contractNumber = contractNumber;
  }
  
  public StringQueryParameter getVisibleDepartment() {
    return visibleDepartment;
  }
  public void setVisibleDepartment(StringQueryParameter visibleDepartment) {
    this.visibleDepartment = visibleDepartment;
  }
  
}
